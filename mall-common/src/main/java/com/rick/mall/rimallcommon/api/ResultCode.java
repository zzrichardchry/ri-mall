package com.rick.mall.rimallcommon.api;

/**
 * @Author zhuhaotian
 * @Date 2023/7/20
 */

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "Operation succeed"),
    FAILED(500, "Operation failed"),
    VALIDATE_FAILED(404, "Argument validation failed"),
    UNAUTHORIZED(401, "Not logged in yet or token has expired"),
    FORBIDDEN(403, "Not authorized");
    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
