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
@Table(name = "oms_order", schema = "ri-mall", catalog = "")
public class OmsOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private long memberId;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
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
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    @Basic
    @Column(name = "pay_amount")
    private BigDecimal payAmount;
    @Basic
    @Column(name = "freight_amount")
    private BigDecimal freightAmount;
    @Basic
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;
    @Basic
    @Column(name = "integration_amount")
    private BigDecimal integrationAmount;
    @Basic
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;
    @Basic
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;
    @Basic
    @Column(name = "pay_type")
    private Integer payType;
    @Basic
    @Column(name = "source_type")
    private Integer sourceType;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "order_type")
    private Integer orderType;
    @Basic
    @Column(name = "delivery_company")
    private String deliveryCompany;
    @Basic
    @Column(name = "delivery_sn")
    private String deliverySn;
    @Basic
    @Column(name = "auto_confirm_day")
    private Integer autoConfirmDay;
    @Basic
    @Column(name = "integration")
    private Integer integration;
    @Basic
    @Column(name = "growth")
    private Integer growth;
    @Basic
    @Column(name = "promotion_info")
    private String promotionInfo;
    @Basic
    @Column(name = "bill_type")
    private Integer billType;
    @Basic
    @Column(name = "bill_header")
    private String billHeader;
    @Basic
    @Column(name = "bill_content")
    private String billContent;
    @Basic
    @Column(name = "bill_receiver_phone")
    private String billReceiverPhone;
    @Basic
    @Column(name = "bill_receiver_email")
    private String billReceiverEmail;
    @Basic
    @Column(name = "receiver_name")
    private String receiverName;
    @Basic
    @Column(name = "receiver_phone")
    private String receiverPhone;
    @Basic
    @Column(name = "receiver_post_code")
    private String receiverPostCode;
    @Basic
    @Column(name = "receiver_province")
    private String receiverProvince;
    @Basic
    @Column(name = "receiver_city")
    private String receiverCity;
    @Basic
    @Column(name = "receiver_region")
    private String receiverRegion;
    @Basic
    @Column(name = "receiver_detail_address")
    private String receiverDetailAddress;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "confirm_status")
    private Integer confirmStatus;
    @Basic
    @Column(name = "delete_status")
    private int deleteStatus;
    @Basic
    @Column(name = "use_integration")
    private Integer useIntegration;
    @Basic
    @Column(name = "payment_time")
    private Timestamp paymentTime;
    @Basic
    @Column(name = "delivery_time")
    private Timestamp deliveryTime;
    @Basic
    @Column(name = "receive_time")
    private Timestamp receiveTime;
    @Basic
    @Column(name = "comment_time")
    private Timestamp commentTime;
    @Basic
    @Column(name = "modify_time")
    private Timestamp modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Timestamp getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Timestamp deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrder omsOrder = (OmsOrder) o;
        return id == omsOrder.id && memberId == omsOrder.memberId && deleteStatus == omsOrder.deleteStatus && Objects.equals(couponId, omsOrder.couponId) && Objects.equals(orderSn, omsOrder.orderSn) && Objects.equals(createTime, omsOrder.createTime) && Objects.equals(memberUsername, omsOrder.memberUsername) && Objects.equals(totalAmount, omsOrder.totalAmount) && Objects.equals(payAmount, omsOrder.payAmount) && Objects.equals(freightAmount, omsOrder.freightAmount) && Objects.equals(promotionAmount, omsOrder.promotionAmount) && Objects.equals(integrationAmount, omsOrder.integrationAmount) && Objects.equals(couponAmount, omsOrder.couponAmount) && Objects.equals(discountAmount, omsOrder.discountAmount) && Objects.equals(payType, omsOrder.payType) && Objects.equals(sourceType, omsOrder.sourceType) && Objects.equals(status, omsOrder.status) && Objects.equals(orderType, omsOrder.orderType) && Objects.equals(deliveryCompany, omsOrder.deliveryCompany) && Objects.equals(deliverySn, omsOrder.deliverySn) && Objects.equals(autoConfirmDay, omsOrder.autoConfirmDay) && Objects.equals(integration, omsOrder.integration) && Objects.equals(growth, omsOrder.growth) && Objects.equals(promotionInfo, omsOrder.promotionInfo) && Objects.equals(billType, omsOrder.billType) && Objects.equals(billHeader, omsOrder.billHeader) && Objects.equals(billContent, omsOrder.billContent) && Objects.equals(billReceiverPhone, omsOrder.billReceiverPhone) && Objects.equals(billReceiverEmail, omsOrder.billReceiverEmail) && Objects.equals(receiverName, omsOrder.receiverName) && Objects.equals(receiverPhone, omsOrder.receiverPhone) && Objects.equals(receiverPostCode, omsOrder.receiverPostCode) && Objects.equals(receiverProvince, omsOrder.receiverProvince) && Objects.equals(receiverCity, omsOrder.receiverCity) && Objects.equals(receiverRegion, omsOrder.receiverRegion) && Objects.equals(receiverDetailAddress, omsOrder.receiverDetailAddress) && Objects.equals(note, omsOrder.note) && Objects.equals(confirmStatus, omsOrder.confirmStatus) && Objects.equals(useIntegration, omsOrder.useIntegration) && Objects.equals(paymentTime, omsOrder.paymentTime) && Objects.equals(deliveryTime, omsOrder.deliveryTime) && Objects.equals(receiveTime, omsOrder.receiveTime) && Objects.equals(commentTime, omsOrder.commentTime) && Objects.equals(modifyTime, omsOrder.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);
    }
}
