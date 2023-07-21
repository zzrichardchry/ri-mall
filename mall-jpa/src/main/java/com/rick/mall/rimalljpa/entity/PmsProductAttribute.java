package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_product_attribute", schema = "ri-mall")
public class PmsProductAttribute {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_attribute_category_id")
    private Long productAttributeCategoryId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "select_type")
    private Integer selectType;
    @Basic
    @Column(name = "input_type")
    private Integer inputType;
    @Basic
    @Column(name = "input_list")
    private String inputList;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "filter_type")
    private Integer filterType;
    @Basic
    @Column(name = "search_type")
    private Integer searchType;
    @Basic
    @Column(name = "related_status")
    private Integer relatedStatus;
    @Basic
    @Column(name = "hand_add_status")
    private Integer handAddStatus;
    @Basic
    @Column(name = "type")
    private Integer type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Integer getSelectType() {
        return selectType;
    }

    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
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
        PmsProductAttribute that = (PmsProductAttribute) o;
        return id == that.id && Objects.equals(productAttributeCategoryId, that.productAttributeCategoryId) && Objects.equals(name, that.name) && Objects.equals(selectType, that.selectType) && Objects.equals(inputType, that.inputType) && Objects.equals(inputList, that.inputList) && Objects.equals(sort, that.sort) && Objects.equals(filterType, that.filterType) && Objects.equals(searchType, that.searchType) && Objects.equals(relatedStatus, that.relatedStatus) && Objects.equals(handAddStatus, that.handAddStatus) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productAttributeCategoryId, name, selectType, inputType, inputList, sort, filterType, searchType, relatedStatus, handAddStatus, type);
    }
}
