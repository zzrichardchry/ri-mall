package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_brand", schema = "ri-mall")
public class PmsBrand {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "first_letter")
    private String firstLetter;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "factory_status")
    private Integer factoryStatus;
    @Basic
    @Column(name = "show_status")
    private Integer showStatus;
    @Basic
    @Column(name = "product_count")
    private Integer productCount;
    @Basic
    @Column(name = "product_comment_count")
    private Integer productCommentCount;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "big_pic")
    private String bigPic;
    @Basic
    @Column(name = "brand_story")
    private String brandStory;

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

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBrand pmsBrand = (PmsBrand) o;
        return id == pmsBrand.id && Objects.equals(name, pmsBrand.name) && Objects.equals(firstLetter, pmsBrand.firstLetter) && Objects.equals(sort, pmsBrand.sort) && Objects.equals(factoryStatus, pmsBrand.factoryStatus) && Objects.equals(showStatus, pmsBrand.showStatus) && Objects.equals(productCount, pmsBrand.productCount) && Objects.equals(productCommentCount, pmsBrand.productCommentCount) && Objects.equals(logo, pmsBrand.logo) && Objects.equals(bigPic, pmsBrand.bigPic) && Objects.equals(brandStory, pmsBrand.brandStory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstLetter, sort, factoryStatus, showStatus, productCount, productCommentCount, logo, bigPic, brandStory);
    }
}
