package com.rick.mall.rimallcommon.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author zhuhaotian
 * @Date 2023/7/20
 */

@Data
@EqualsAndHashCode
@Builder
public class SwaggerProperties {
    /**
     * API documents generation base path
     */
    private String apiBasePackage;

    /**
     * Enable security
     */
    private boolean enableSecurity;

    /**
     * Document title
     */
    private String title;

    /**
     * Document description
     */
    private String description;

    /**
     * Document version
     */
    private String version;

    /**
     * Document contact name
     */
    private String contactName;

    /**
     * Document contact website
     */
    private String contactUrl;

    /**
     * Document contact Email
     */
    private String contactEmail;
}
