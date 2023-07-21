package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "sms_flash_promotion_product_relation", schema = "ri-mall")
public class SmsFlashPromotionProductRelation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "flash_promotion_id")
    private Long flashPromotionId;
    @Basic
    @Column(name = "flash_promotion_session_id")
    private Long flashPromotionSessionId;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "flash_promotion_price")
    private BigDecimal flashPromotionPrice;
    @Basic
    @Column(name = "flash_promotion_count")
    private Integer flashPromotionCount;
    @Basic
    @Column(name = "flash_promotion_limit")
    private Integer flashPromotionLimit;
    @Basic
    @Column(name = "sort")
    private Integer sort;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsFlashPromotionProductRelation that = (SmsFlashPromotionProductRelation) o;
        return id == that.id && Objects.equals(flashPromotionId, that.flashPromotionId) && Objects.equals(flashPromotionSessionId, that.flashPromotionSessionId) && Objects.equals(productId, that.productId) && Objects.equals(flashPromotionPrice, that.flashPromotionPrice) && Objects.equals(flashPromotionCount, that.flashPromotionCount) && Objects.equals(flashPromotionLimit, that.flashPromotionLimit) && Objects.equals(sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flashPromotionId, flashPromotionSessionId, productId, flashPromotionPrice, flashPromotionCount, flashPromotionLimit, sort);
    }
}
