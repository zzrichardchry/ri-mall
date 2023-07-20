package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "oms_order_item", schema = "ri-mall")
public class OmsOrderItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;
    @Basic
    @Column(name = "product_id")
    private Long productId;
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
    @Column(name = "product_sn")
    private String productSn;
    @Basic
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Basic
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @Basic
    @Column(name = "product_sku_id")
    private Long productSkuId;
    @Basic
    @Column(name = "product_sku_code")
    private String productSkuCode;
    @Basic
    @Column(name = "product_category_id")
    private Long productCategoryId;
    @Basic
    @Column(name = "promotion_name")
    private String promotionName;
    @Basic
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;
    @Basic
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;
    @Basic
    @Column(name = "integration_amount")
    private BigDecimal integrationAmount;
    @Basic
    @Column(name = "real_amount")
    private BigDecimal realAmount;
    @Basic
    @Column(name = "gift_integration")
    private Integer giftIntegration;
    @Basic
    @Column(name = "gift_growth")
    private Integer giftGrowth;
    @Basic
    @Column(name = "product_attr")
    private String productAttr;

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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderItem that = (OmsOrderItem) o;
        return id == that.id && Objects.equals(orderId, that.orderId) && Objects.equals(orderSn, that.orderSn) && Objects.equals(productId, that.productId) && Objects.equals(productPic, that.productPic) && Objects.equals(productName, that.productName) && Objects.equals(productBrand, that.productBrand) && Objects.equals(productSn, that.productSn) && Objects.equals(productPrice, that.productPrice) && Objects.equals(productQuantity, that.productQuantity) && Objects.equals(productSkuId, that.productSkuId) && Objects.equals(productSkuCode, that.productSkuCode) && Objects.equals(productCategoryId, that.productCategoryId) && Objects.equals(promotionName, that.promotionName) && Objects.equals(promotionAmount, that.promotionAmount) && Objects.equals(couponAmount, that.couponAmount) && Objects.equals(integrationAmount, that.integrationAmount) && Objects.equals(realAmount, that.realAmount) && Objects.equals(giftIntegration, that.giftIntegration) && Objects.equals(giftGrowth, that.giftGrowth) && Objects.equals(productAttr, that.productAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, orderSn, productId, productPic, productName, productBrand, productSn, productPrice, productQuantity, productSkuId, productSkuCode, productCategoryId, promotionName, promotionAmount, couponAmount, integrationAmount, realAmount, giftIntegration, giftGrowth, productAttr);
    }
}
