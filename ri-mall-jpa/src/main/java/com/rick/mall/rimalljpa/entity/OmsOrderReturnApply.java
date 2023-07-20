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
@Table(name = "oms_order_return_apply", schema = "ri-mall")
public class OmsOrderReturnApply {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "company_address_id")
    private Long companyAddressId;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "member_username")
    private String memberUsername;
    @Basic
    @Column(name = "return_amount")
    private BigDecimal returnAmount;
    @Basic
    @Column(name = "return_name")
    private String returnName;
    @Basic
    @Column(name = "return_phone")
    private String returnPhone;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "handle_time")
    private Timestamp handleTime;
    @Basic
    @Column(name = "product_pic")
    private String productPic;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "product_brand")
    private String productBrand;
    @Basic
    @Column(name = "product_attr")
    private String productAttr;
    @Basic
    @Column(name = "product_count")
    private Integer productCount;
    @Basic
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Basic
    @Column(name = "product_real_price")
    private BigDecimal productRealPrice;
    @Basic
    @Column(name = "reason")
    private String reason;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "proof_pics")
    private String proofPics;
    @Basic
    @Column(name = "handle_note")
    private String handleNote;
    @Basic
    @Column(name = "handle_man")
    private String handleMan;
    @Basic
    @Column(name = "receive_man")
    private String receiveMan;
    @Basic
    @Column(name = "receive_time")
    private Timestamp receiveTime;
    @Basic
    @Column(name = "receive_note")
    private String receiveNote;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Timestamp handleTime) {
        this.handleTime = handleTime;
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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderReturnApply that = (OmsOrderReturnApply) o;
        return id == that.id && Objects.equals(orderId, that.orderId) && Objects.equals(companyAddressId, that.companyAddressId) && Objects.equals(productId, that.productId) && Objects.equals(orderSn, that.orderSn) && Objects.equals(createTime, that.createTime) && Objects.equals(memberUsername, that.memberUsername) && Objects.equals(returnAmount, that.returnAmount) && Objects.equals(returnName, that.returnName) && Objects.equals(returnPhone, that.returnPhone) && Objects.equals(status, that.status) && Objects.equals(handleTime, that.handleTime) && Objects.equals(productPic, that.productPic) && Objects.equals(productName, that.productName) && Objects.equals(productBrand, that.productBrand) && Objects.equals(productAttr, that.productAttr) && Objects.equals(productCount, that.productCount) && Objects.equals(productPrice, that.productPrice) && Objects.equals(productRealPrice, that.productRealPrice) && Objects.equals(reason, that.reason) && Objects.equals(description, that.description) && Objects.equals(proofPics, that.proofPics) && Objects.equals(handleNote, that.handleNote) && Objects.equals(handleMan, that.handleMan) && Objects.equals(receiveMan, that.receiveMan) && Objects.equals(receiveTime, that.receiveTime) && Objects.equals(receiveNote, that.receiveNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, companyAddressId, productId, orderSn, createTime, memberUsername, returnAmount, returnName, returnPhone, status, handleTime, productPic, productName, productBrand, productAttr, productCount, productPrice, productRealPrice, reason, description, proofPics, handleNote, handleMan, receiveMan, receiveTime, receiveNote);
    }
}
