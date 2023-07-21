package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_sku_stock", schema = "ri-mall")
public class PmsSkuStock {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "sku_code")
    private String skuCode;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "stock")
    private Integer stock;
    @Basic
    @Column(name = "low_stock")
    private Integer lowStock;
    @Basic
    @Column(name = "pic")
    private String pic;
    @Basic
    @Column(name = "sale")
    private Integer sale;
    @Basic
    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;
    @Basic
    @Column(name = "lock_stock")
    private Integer lockStock;
    @Basic
    @Column(name = "sp_data")
    private String spData;

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

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getLockStock() {
        return lockStock;
    }

    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    public String getSpData() {
        return spData;
    }

    public void setSpData(String spData) {
        this.spData = spData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuStock that = (PmsSkuStock) o;
        return id == that.id && Objects.equals(productId, that.productId) && Objects.equals(skuCode, that.skuCode) && Objects.equals(price, that.price) && Objects.equals(stock, that.stock) && Objects.equals(lowStock, that.lowStock) && Objects.equals(pic, that.pic) && Objects.equals(sale, that.sale) && Objects.equals(promotionPrice, that.promotionPrice) && Objects.equals(lockStock, that.lockStock) && Objects.equals(spData, that.spData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, skuCode, price, stock, lowStock, pic, sale, promotionPrice, lockStock, spData);
    }
}
