package com.rick.mall.rimallcommon.exception;

import com.rick.mall.rimallcommon.api.IErrorCode;

/**
 * @Author zhuhaotian
 * @Date 2023/7/21
 *
 * Assertion class for throwing Api exceptions
 */

public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
