package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "sms_coupon_product_category_relation", schema = "ri-mall")
public class SmsCouponProductCategoryRelation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
    @Basic
    @Column(name = "product_category_id")
    private Long productCategoryId;
    @Basic
    @Column(name = "product_category_name")
    private String productCategoryName;
    @Basic
    @Column(name = "parent_category_name")
    private String parentCategoryName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsCouponProductCategoryRelation that = (SmsCouponProductCategoryRelation) o;
        return id == that.id && Objects.equals(couponId, that.couponId) && Objects.equals(productCategoryId, that.productCategoryId) && Objects.equals(productCategoryName, that.productCategoryName) && Objects.equals(parentCategoryName, that.parentCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, productCategoryId, productCategoryName, parentCategoryName);
    }
}
