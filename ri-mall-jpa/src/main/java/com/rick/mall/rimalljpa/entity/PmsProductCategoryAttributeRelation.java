package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_product_category_attribute_relation", schema = "ri-mall")
public class PmsProductCategoryAttributeRelation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_category_id")
    private Long productCategoryId;
    @Basic
    @Column(name = "product_attribute_id")
    private Long productAttributeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductCategoryAttributeRelation that = (PmsProductCategoryAttributeRelation) o;
        return id == that.id && Objects.equals(productCategoryId, that.productCategoryId) && Objects.equals(productAttributeId, that.productAttributeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productCategoryId, productAttributeId);
    }
}
