package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "cms_help", schema = "ri-mall")
public class CmsHelp {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "show_status")
    private Integer showStatus;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "read_count")
    private Integer readCount;
    @Basic
    @Column(name = "content")
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CmsHelp cmsHelp = (CmsHelp) o;
        return id == cmsHelp.id && Objects.equals(categoryId, cmsHelp.categoryId) && Objects.equals(icon, cmsHelp.icon) && Objects.equals(title, cmsHelp.title) && Objects.equals(showStatus, cmsHelp.showStatus) && Objects.equals(createTime, cmsHelp.createTime) && Objects.equals(readCount, cmsHelp.readCount) && Objects.equals(content, cmsHelp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, icon, title, showStatus, createTime, readCount, content);
    }
}
