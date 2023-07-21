package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "sms_coupon_history", schema = "ri-mall")
public class SmsCouponHistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "coupon_code")
    private String couponCode;
    @Basic
    @Column(name = "member_nickname")
    private String memberNickname;
    @Basic
    @Column(name = "get_type")
    private Integer getType;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "use_status")
    private Integer useStatus;
    @Basic
    @Column(name = "use_time")
    private Timestamp useTime;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;

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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Timestamp getUseTime() {
        return useTime;
    }

    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsCouponHistory that = (SmsCouponHistory) o;
        return id == that.id && Objects.equals(couponId, that.couponId) && Objects.equals(memberId, that.memberId) && Objects.equals(couponCode, that.couponCode) && Objects.equals(memberNickname, that.memberNickname) && Objects.equals(getType, that.getType) && Objects.equals(createTime, that.createTime) && Objects.equals(useStatus, that.useStatus) && Objects.equals(useTime, that.useTime) && Objects.equals(orderId, that.orderId) && Objects.equals(orderSn, that.orderSn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, memberId, couponCode, memberNickname, getType, createTime, useStatus, useTime, orderId, orderSn);
    }
}
