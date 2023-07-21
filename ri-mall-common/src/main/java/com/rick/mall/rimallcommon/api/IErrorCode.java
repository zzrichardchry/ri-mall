package com.rick.mall.rimallcommon.api;

/**
 * @Author zhuhaotian
 * @Date 2023/7/20
 *
 * Api return code
 */

public interface IErrorCode {
    /**
     * Return code
     */
    long getCode();

    /**
     * Return message
     */
    String getMessage();
}
