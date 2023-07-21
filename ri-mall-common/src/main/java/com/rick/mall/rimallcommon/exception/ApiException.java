package com.rick.mall.rimallcommon.exception;

import com.rick.mall.rimallcommon.api.IErrorCode;

/**
 * @Author zhuhaotian
 * @Date 2023/7/21
 *
 * Custom Api Exceptions
 */

public class ApiException extends RuntimeException {

    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
