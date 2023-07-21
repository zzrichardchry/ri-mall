package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_album", schema = "ri-mall")
public class PmsAlbum {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "cover_pic")
    private String coverPic;
    @Basic
    @Column(name = "pic_count")
    private Integer picCount;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "description")
    private String description;

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

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public Integer getPicCount() {
        return picCount;
    }

    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsAlbum pmsAlbum = (PmsAlbum) o;
        return id == pmsAlbum.id && Objects.equals(name, pmsAlbum.name) && Objects.equals(coverPic, pmsAlbum.coverPic) && Objects.equals(picCount, pmsAlbum.picCount) && Objects.equals(sort, pmsAlbum.sort) && Objects.equals(description, pmsAlbum.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coverPic, picCount, sort, description);
    }
}
