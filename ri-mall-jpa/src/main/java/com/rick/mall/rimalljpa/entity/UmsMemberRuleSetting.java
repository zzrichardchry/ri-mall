package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_member_rule_setting", schema = "ri-mall")
public class UmsMemberRuleSetting {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "continue_sign_day")
    private Integer continueSignDay;
    @Basic
    @Column(name = "continue_sign_point")
    private Integer continueSignPoint;
    @Basic
    @Column(name = "consume_per_point")
    private BigDecimal consumePerPoint;
    @Basic
    @Column(name = "low_order_amount")
    private BigDecimal lowOrderAmount;
    @Basic
    @Column(name = "max_point_per_order")
    private Integer maxPointPerOrder;
    @Basic
    @Column(name = "type")
    private Integer type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMemberRuleSetting that = (UmsMemberRuleSetting) o;
        return id == that.id && Objects.equals(continueSignDay, that.continueSignDay) && Objects.equals(continueSignPoint, that.continueSignPoint) && Objects.equals(consumePerPoint, that.consumePerPoint) && Objects.equals(lowOrderAmount, that.lowOrderAmount) && Objects.equals(maxPointPerOrder, that.maxPointPerOrder) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, continueSignDay, continueSignPoint, consumePerPoint, lowOrderAmount, maxPointPerOrder, type);
    }
}
