package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_feight_template", schema = "ri-mall")
public class PmsFeightTemplate {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "charge_type")
    private Integer chargeType;
    @Basic
    @Column(name = "first_weight")
    private BigDecimal firstWeight;
    @Basic
    @Column(name = "first_fee")
    private BigDecimal firstFee;
    @Basic
    @Column(name = "continue_weight")
    private BigDecimal continueWeight;
    @Basic
    @Column(name = "continme_fee")
    private BigDecimal continmeFee;
    @Basic
    @Column(name = "dest")
    private String dest;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getFirstFee() {
        return firstFee;
    }

    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsFeightTemplate that = (PmsFeightTemplate) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(chargeType, that.chargeType) && Objects.equals(firstWeight, that.firstWeight) && Objects.equals(firstFee, that.firstFee) && Objects.equals(continueWeight, that.continueWeight) && Objects.equals(continmeFee, that.continmeFee) && Objects.equals(dest, that.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, chargeType, firstWeight, firstFee, continueWeight, continmeFee, dest);
    }
}
