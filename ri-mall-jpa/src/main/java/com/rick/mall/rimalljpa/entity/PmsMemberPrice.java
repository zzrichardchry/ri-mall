package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_member_price", schema = "ri-mall")
public class PmsMemberPrice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "member_level_id")
    private Long memberLevelId;
    @Basic
    @Column(name = "member_price")
    private BigDecimal memberPrice;
    @Basic
    @Column(name = "member_level_name")
    private String memberLevelName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsMemberPrice that = (PmsMemberPrice) o;
        return id == that.id && Objects.equals(productId, that.productId) && Objects.equals(memberLevelId, that.memberLevelId) && Objects.equals(memberPrice, that.memberPrice) && Objects.equals(memberLevelName, that.memberLevelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, memberLevelId, memberPrice, memberLevelName);
    }
}
