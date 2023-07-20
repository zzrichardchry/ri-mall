package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_menu", schema = "ri-mall")
public class UmsMenu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "parent_id")
    private Long parentId;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "level")
    private Integer level;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "hidden")
    private Integer hidden;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMenu umsMenu = (UmsMenu) o;
        return id == umsMenu.id && Objects.equals(parentId, umsMenu.parentId) && Objects.equals(createTime, umsMenu.createTime) && Objects.equals(title, umsMenu.title) && Objects.equals(level, umsMenu.level) && Objects.equals(sort, umsMenu.sort) && Objects.equals(name, umsMenu.name) && Objects.equals(icon, umsMenu.icon) && Objects.equals(hidden, umsMenu.hidden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, createTime, title, level, sort, name, icon, hidden);
    }
}
