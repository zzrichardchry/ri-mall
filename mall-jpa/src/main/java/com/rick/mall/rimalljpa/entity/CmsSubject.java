package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "cms_subject", schema = "ri-mall")
public class CmsSubject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "pic")
    private String pic;
    @Basic
    @Column(name = "product_count")
    private Integer productCount;
    @Basic
    @Column(name = "recommend_status")
    private Integer recommendStatus;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "collect_count")
    private Integer collectCount;
    @Basic
    @Column(name = "read_count")
    private Integer readCount;
    @Basic
    @Column(name = "comment_count")
    private Integer commentCount;
    @Basic
    @Column(name = "album_pics")
    private String albumPics;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "show_status")
    private Integer showStatus;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "forward_count")
    private Integer forwardCount;
    @Basic
    @Column(name = "category_name")
    private String categoryName;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CmsSubject that = (CmsSubject) o;
        return id == that.id && Objects.equals(categoryId, that.categoryId) && Objects.equals(title, that.title) && Objects.equals(pic, that.pic) && Objects.equals(productCount, that.productCount) && Objects.equals(recommendStatus, that.recommendStatus) && Objects.equals(createTime, that.createTime) && Objects.equals(collectCount, that.collectCount) && Objects.equals(readCount, that.readCount) && Objects.equals(commentCount, that.commentCount) && Objects.equals(albumPics, that.albumPics) && Objects.equals(description, that.description) && Objects.equals(showStatus, that.showStatus) && Objects.equals(content, that.content) && Objects.equals(forwardCount, that.forwardCount) && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, title, pic, productCount, recommendStatus, createTime, collectCount, readCount, commentCount, albumPics, description, showStatus, content, forwardCount, categoryName);
    }
}
