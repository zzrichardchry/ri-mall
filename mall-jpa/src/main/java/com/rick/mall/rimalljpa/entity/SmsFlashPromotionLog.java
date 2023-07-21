package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "sms_flash_promotion_log", schema = "ri-mall")
public class SmsFlashPromotionLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "member_id")
    private Integer memberId;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "member_phone")
    private String memberPhone;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "subscribe_time")
    private Timestamp subscribeTime;
    @Basic
    @Column(name = "send_time")
    private Timestamp sendTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Timestamp getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Timestamp subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsFlashPromotionLog that = (SmsFlashPromotionLog) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(productId, that.productId) && Objects.equals(memberPhone, that.memberPhone) && Objects.equals(productName, that.productName) && Objects.equals(subscribeTime, that.subscribeTime) && Objects.equals(sendTime, that.sendTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, productId, memberPhone, productName, subscribeTime, sendTime);
    }
}
