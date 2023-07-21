package com.rick.mall.rimallcommon.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author zhuhaotian
 * @Date 2023/7/21
 */

@Data
@EqualsAndHashCode
public class WebLog {
    /**
     * Operation description
     */
    private String description;

    /**
     * Operation user
     */
    private String username;

    /**
     * Operation time
     */
    private Long startTime;

    /**
     * Time consumed
     */
    private Integer spendTime;

    /**
     * Base path
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * Request method
     */
    private String method;

    /**
     * IP Address
     */
    private String ip;

    /**
     * Request parameter
     */
    private Object parameter;

    /**
     * Response
     */
    private Object result;
}
