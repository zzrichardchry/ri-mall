package com.rick.mall.rimallcommon.api;

import lombok.Data;

/**
 * @Author zhuhaotian
 * @Date 2023/7/20
 */

@Data
public class ResultResponse<T> {
    /**
     * Status Code
     */
    private long code;

    /**
     * Status Message
     */
    private String message;

    /**
     * Data Encapsulation
     */
    private T data;

    public ResultResponse(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * Return successful result
     *
     * @param data retrieved data
     */
    public static <T> ResultResponse<T> success(T data) {
        return new ResultResponse<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * Return successful result
     *
     * @param data retrieved data
     * @param message information
     */
    public static <T> ResultResponse<T> success(T data, String message) {
        return new ResultResponse<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * Return failed result
     *
     * @param errorCode
     */
    public static <T> ResultResponse<T> failed(IErrorCode errorCode) {
        return new ResultResponse<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * Return failed result
     *
     * @param errorCode
     * @param message
     */
    public static <T> ResultResponse<T> failed(IErrorCode errorCode, String message) {
        return new ResultResponse<>(errorCode.getCode(), message, null);
    }

    /**
     * Return failed result
     *
     * @param message
     */
    public static <T> ResultResponse<T> failed(String message) {
        return new ResultResponse<>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * Validation failed
     */
    public static <T> ResultResponse<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * Validation failed and return failure message
     *
     * @param message
     */
    public static <T> ResultResponse<T> validateFailed(String message) {
        return new ResultResponse<>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * Not log in and return result
     */
    public static <T> ResultResponse<T> forbidden(T data) {
        return new ResultResponse<>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }
}
