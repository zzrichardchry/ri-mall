package com.rick.mall.rimallcommon.api;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author zhuhaotian
 * @Date 2023/7/20
 * A payload class for paging operations
 */

@Data
public class PageResponse<T> {
    /**
     * Current page number
     */
    private Integer pageNum;

    /**
     * Size per page
     */
    private Integer pageSize;

    /**
     * Total pages
     */
    private Integer totalPage;

    /**
     * Total elements
     */
    private Long totalElements;

    /**
     * Is last page?
     */
    private Boolean last;

    /**
     * Content
     */
    private List<T> content;

    public static  <T> PageResponse<T> setPage(Page<T> page) {
        PageResponse<T> res = new PageResponse<>();

        res.setContent(page.getContent());
        res.setPageNum(page.getNumber());
        res.setPageSize(page.getSize());
        res.setTotalPage(page.getTotalPages());
        res.setTotalElements(page.getTotalElements());
        res.setLast(page.isLast());
        res.setTotalElements(page.getTotalElements());

        return res;
    }

}
