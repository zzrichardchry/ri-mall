package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "cms_preference_area", schema = "ri-mall")
public class CmsPreferenceArea {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "sub_title")
    private String subTitle;
    @Basic
    @Column(name = "pic")
    private byte[] pic;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "show_status")
    private Integer showStatus;

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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CmsPreferenceArea that = (CmsPreferenceArea) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(subTitle, that.subTitle) && Arrays.equals(pic, that.pic) && Objects.equals(sort, that.sort) && Objects.equals(showStatus, that.showStatus);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, subTitle, sort, showStatus);
        result = 31 * result + Arrays.hashCode(pic);
        return result;
    }
}
