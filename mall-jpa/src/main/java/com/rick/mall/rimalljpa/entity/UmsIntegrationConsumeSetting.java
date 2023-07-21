package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_integration_consume_setting", schema = "ri-mall")
public class UmsIntegrationConsumeSetting {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "deduction_per_amount")
    private Integer deductionPerAmount;
    @Basic
    @Column(name = "max_percent_per_order")
    private Integer maxPercentPerOrder;
    @Basic
    @Column(name = "use_unit")
    private Integer useUnit;
    @Basic
    @Column(name = "coupon_status")
    private Integer couponStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    public Integer getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsIntegrationConsumeSetting that = (UmsIntegrationConsumeSetting) o;
        return id == that.id && Objects.equals(deductionPerAmount, that.deductionPerAmount) && Objects.equals(maxPercentPerOrder, that.maxPercentPerOrder) && Objects.equals(useUnit, that.useUnit) && Objects.equals(couponStatus, that.couponStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deductionPerAmount, maxPercentPerOrder, useUnit, couponStatus);
    }
}
