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
@Table(name = "pms_product", schema = "ri-mall")
public class PmsProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "brand_id")
    private Long brandId;
    @Basic
    @Column(name = "product_category_id")
    private Long productCategoryId;
    @Basic
    @Column(name = "feight_template_id")
    private Long feightTemplateId;
    @Basic
    @Column(name = "product_attribute_category_id")
    private Long productAttributeCategoryId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "pic")
    private String pic;
    @Basic
    @Column(name = "product_sn")
    private String productSn;
    @Basic
    @Column(name = "delete_status")
    private Integer deleteStatus;
    @Basic
    @Column(name = "publish_status")
    private Integer publishStatus;
    @Basic
    @Column(name = "new_status")
    private Integer newStatus;
    @Basic
    @Column(name = "recommand_status")
    private Integer recommandStatus;
    @Basic
    @Column(name = "verify_status")
    private Integer verifyStatus;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "sale")
    private Integer sale;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;
    @Basic
    @Column(name = "gift_growth")
    private Integer giftGrowth;
    @Basic
    @Column(name = "gift_point")
    private Integer giftPoint;
    @Basic
    @Column(name = "use_point_limit")
    private Integer usePointLimit;
    @Basic
    @Column(name = "sub_title")
    private String subTitle;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "original_price")
    private BigDecimal originalPrice;
    @Basic
    @Column(name = "stock")
    private Integer stock;
    @Basic
    @Column(name = "low_stock")
    private Integer lowStock;
    @Basic
    @Column(name = "unit")
    private String unit;
    @Basic
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic
    @Column(name = "preview_status")
    private Integer previewStatus;
    @Basic
    @Column(name = "service_ids")
    private String serviceIds;
    @Basic
    @Column(name = "keywords")
    private String keywords;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "album_pics")
    private String albumPics;
    @Basic
    @Column(name = "detail_title")
    private String detailTitle;
    @Basic
    @Column(name = "detail_desc")
    private String detailDesc;
    @Basic
    @Column(name = "detail_html")
    private String detailHtml;
    @Basic
    @Column(name = "detail_mobile_html")
    private String detailMobileHtml;
    @Basic
    @Column(name = "promotion_start_time")
    private Timestamp promotionStartTime;
    @Basic
    @Column(name = "promotion_end_time")
    private Timestamp promotionEndTime;
    @Basic
    @Column(name = "promotion_per_limit")
    private Integer promotionPerLimit;
    @Basic
    @Column(name = "promotion_type")
    private Integer promotionType;
    @Basic
    @Column(name = "brand_name")
    private String brandName;
    @Basic
    @Column(name = "product_category_name")
    private String productCategoryName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPreviewStatus() {
        return previewStatus;
    }

    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    public Timestamp getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Timestamp promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Timestamp getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Timestamp promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProduct that = (PmsProduct) o;
        return id == that.id && Objects.equals(brandId, that.brandId) && Objects.equals(productCategoryId, that.productCategoryId) && Objects.equals(feightTemplateId, that.feightTemplateId) && Objects.equals(productAttributeCategoryId, that.productAttributeCategoryId) && Objects.equals(name, that.name) && Objects.equals(pic, that.pic) && Objects.equals(productSn, that.productSn) && Objects.equals(deleteStatus, that.deleteStatus) && Objects.equals(publishStatus, that.publishStatus) && Objects.equals(newStatus, that.newStatus) && Objects.equals(recommandStatus, that.recommandStatus) && Objects.equals(verifyStatus, that.verifyStatus) && Objects.equals(sort, that.sort) && Objects.equals(sale, that.sale) && Objects.equals(price, that.price) && Objects.equals(promotionPrice, that.promotionPrice) && Objects.equals(giftGrowth, that.giftGrowth) && Objects.equals(giftPoint, that.giftPoint) && Objects.equals(usePointLimit, that.usePointLimit) && Objects.equals(subTitle, that.subTitle) && Objects.equals(description, that.description) && Objects.equals(originalPrice, that.originalPrice) && Objects.equals(stock, that.stock) && Objects.equals(lowStock, that.lowStock) && Objects.equals(unit, that.unit) && Objects.equals(weight, that.weight) && Objects.equals(previewStatus, that.previewStatus) && Objects.equals(serviceIds, that.serviceIds) && Objects.equals(keywords, that.keywords) && Objects.equals(note, that.note) && Objects.equals(albumPics, that.albumPics) && Objects.equals(detailTitle, that.detailTitle) && Objects.equals(detailDesc, that.detailDesc) && Objects.equals(detailHtml, that.detailHtml) && Objects.equals(detailMobileHtml, that.detailMobileHtml) && Objects.equals(promotionStartTime, that.promotionStartTime) && Objects.equals(promotionEndTime, that.promotionEndTime) && Objects.equals(promotionPerLimit, that.promotionPerLimit) && Objects.equals(promotionType, that.promotionType) && Objects.equals(brandName, that.brandName) && Objects.equals(productCategoryName, that.productCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, description, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, detailDesc, detailHtml, detailMobileHtml, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName);
    }
}
