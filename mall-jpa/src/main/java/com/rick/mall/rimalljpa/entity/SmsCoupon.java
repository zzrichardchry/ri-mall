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
@Table(name = "sms_coupon", schema = "ri-mall")
public class SmsCoupon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "type")
    private Integer type;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "platform")
    private Integer platform;
    @Basic
    @Column(name = "count")
    private Integer count;
    @Basic
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic
    @Column(name = "per_limit")
    private Integer perLimit;
    @Basic
    @Column(name = "min_point")
    private BigDecimal minPoint;
    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;
    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;
    @Basic
    @Column(name = "use_type")
    private Integer useType;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "publish_count")
    private Integer publishCount;
    @Basic
    @Column(name = "use_count")
    private Integer useCount;
    @Basic
    @Column(name = "receive_count")
    private Integer receiveCount;
    @Basic
    @Column(name = "enable_time")
    private Timestamp enableTime;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "member_level")
    private Integer memberLevel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Timestamp getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Timestamp enableTime) {
        this.enableTime = enableTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsCoupon smsCoupon = (SmsCoupon) o;
        return id == smsCoupon.id && Objects.equals(type, smsCoupon.type) && Objects.equals(name, smsCoupon.name) && Objects.equals(platform, smsCoupon.platform) && Objects.equals(count, smsCoupon.count) && Objects.equals(amount, smsCoupon.amount) && Objects.equals(perLimit, smsCoupon.perLimit) && Objects.equals(minPoint, smsCoupon.minPoint) && Objects.equals(startTime, smsCoupon.startTime) && Objects.equals(endTime, smsCoupon.endTime) && Objects.equals(useType, smsCoupon.useType) && Objects.equals(note, smsCoupon.note) && Objects.equals(publishCount, smsCoupon.publishCount) && Objects.equals(useCount, smsCoupon.useCount) && Objects.equals(receiveCount, smsCoupon.receiveCount) && Objects.equals(enableTime, smsCoupon.enableTime) && Objects.equals(code, smsCoupon.code) && Objects.equals(memberLevel, smsCoupon.memberLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, platform, count, amount, perLimit, minPoint, startTime, endTime, useType, note, publishCount, useCount, receiveCount, enableTime, code, memberLevel);
    }
}
