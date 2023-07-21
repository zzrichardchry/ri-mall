package com.rick.mall.rimallcommon.exception;

import cn.hutool.core.util.StrUtil;
import com.rick.mall.rimallcommon.api.ResultResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLSyntaxErrorException;

/**
 * @Author zhuhaotian
 * @Date 2023/7/21
 *
 * Global exceptions handling
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public ResultResponse handle(ApiException e) {
        if (e.getErrorCode() != null) return ResultResponse.failed(e.getErrorCode());
        return ResultResponse.failed(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResultResponse handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();

        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return ResultResponse.validateFailed(message);
    }

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public ResultResponse handleValidException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();

        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return ResultResponse.validateFailed(message);
    }

    @ResponseBody
    @ExceptionHandler(value = SQLSyntaxErrorException.class)
    public ResultResponse handleSQLSyntaxErrorException(SQLSyntaxErrorException e) {
        String message = e.getMessage();

        if (StrUtil.isNotEmpty(message) && message.contains("denied")) {
            message = "Demo environment is not authorized to modify database. If needed, please use local database.";
        }
        return ResultResponse.failed(message);
    }
}
