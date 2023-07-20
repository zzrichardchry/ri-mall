package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "oms_cart_item", schema = "ri-mall")
public class OmsCartItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "product_sku_id")
    private Long productSkuId;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "quantity")
    private Integer quantity;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "product_pic")
    private String productPic;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "product_sub_title")
    private String productSubTitle;
    @Basic
    @Column(name = "product_sku_code")
    private String productSkuCode;
    @Basic
    @Column(name = "member_nickname")
    private String memberNickname;
    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;
    @Basic
    @Column(name = "modify_date")
    private Timestamp modifyDate;
    @Basic
    @Column(name = "delete_status")
    private Integer deleteStatus;
    @Basic
    @Column(name = "product_category_id")
    private Long productCategoryId;
    @Basic
    @Column(name = "product_brand")
    private String productBrand;
    @Basic
    @Column(name = "product_sn")
    private String productSn;
    @Basic
    @Column(name = "product_attr")
    private String productAttr;

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

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsCartItem that = (OmsCartItem) o;
        return id == that.id && Objects.equals(productId, that.productId) && Objects.equals(productSkuId, that.productSkuId) && Objects.equals(memberId, that.memberId) && Objects.equals(quantity, that.quantity) && Objects.equals(price, that.price) && Objects.equals(productPic, that.productPic) && Objects.equals(productName, that.productName) && Objects.equals(productSubTitle, that.productSubTitle) && Objects.equals(productSkuCode, that.productSkuCode) && Objects.equals(memberNickname, that.memberNickname) && Objects.equals(createDate, that.createDate) && Objects.equals(modifyDate, that.modifyDate) && Objects.equals(deleteStatus, that.deleteStatus) && Objects.equals(productCategoryId, that.productCategoryId) && Objects.equals(productBrand, that.productBrand) && Objects.equals(productSn, that.productSn) && Objects.equals(productAttr, that.productAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, productSkuId, memberId, quantity, price, productPic, productName, productSubTitle, productSkuCode, memberNickname, createDate, modifyDate, deleteStatus, productCategoryId, productBrand, productSn, productAttr);
    }
}
