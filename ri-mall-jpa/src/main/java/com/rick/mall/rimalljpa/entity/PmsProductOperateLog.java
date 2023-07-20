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
@Table(name = "pms_product_operate_log", schema = "ri-mall")
public class PmsProductOperateLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "price_old")
    private BigDecimal priceOld;
    @Basic
    @Column(name = "price_new")
    private BigDecimal priceNew;
    @Basic
    @Column(name = "sale_price_old")
    private BigDecimal salePriceOld;
    @Basic
    @Column(name = "sale_price_new")
    private BigDecimal salePriceNew;
    @Basic
    @Column(name = "gift_point_old")
    private Integer giftPointOld;
    @Basic
    @Column(name = "gift_point_new")
    private Integer giftPointNew;
    @Basic
    @Column(name = "use_point_limit_old")
    private Integer usePointLimitOld;
    @Basic
    @Column(name = "use_point_limit_new")
    private Integer usePointLimitNew;
    @Basic
    @Column(name = "operate_man")
    private String operateMan;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;

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

    public BigDecimal getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductOperateLog that = (PmsProductOperateLog) o;
        return id == that.id && Objects.equals(productId, that.productId) && Objects.equals(priceOld, that.priceOld) && Objects.equals(priceNew, that.priceNew) && Objects.equals(salePriceOld, that.salePriceOld) && Objects.equals(salePriceNew, that.salePriceNew) && Objects.equals(giftPointOld, that.giftPointOld) && Objects.equals(giftPointNew, that.giftPointNew) && Objects.equals(usePointLimitOld, that.usePointLimitOld) && Objects.equals(usePointLimitNew, that.usePointLimitNew) && Objects.equals(operateMan, that.operateMan) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, priceOld, priceNew, salePriceOld, salePriceNew, giftPointOld, giftPointNew, usePointLimitOld, usePointLimitNew, operateMan, createTime);
    }
}
