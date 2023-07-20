package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_comment", schema = "ri-mall")
public class PmsComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "member_nick_name")
    private String memberNickName;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "star")
    private Integer star;
    @Basic
    @Column(name = "member_ip")
    private String memberIp;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "show_status")
    private Integer showStatus;
    @Basic
    @Column(name = "product_attribute")
    private String productAttribute;
    @Basic
    @Column(name = "collect_couont")
    private Integer collectCouont;
    @Basic
    @Column(name = "read_count")
    private Integer readCount;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "pics")
    private String pics;
    @Basic
    @Column(name = "member_icon")
    private String memberIcon;
    @Basic
    @Column(name = "replay_count")
    private Integer replayCount;

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

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    public Integer getCollectCouont() {
        return collectCouont;
    }

    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
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

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsComment that = (PmsComment) o;
        return id == that.id && Objects.equals(productId, that.productId) && Objects.equals(memberNickName, that.memberNickName) && Objects.equals(productName, that.productName) && Objects.equals(star, that.star) && Objects.equals(memberIp, that.memberIp) && Objects.equals(createTime, that.createTime) && Objects.equals(showStatus, that.showStatus) && Objects.equals(productAttribute, that.productAttribute) && Objects.equals(collectCouont, that.collectCouont) && Objects.equals(readCount, that.readCount) && Objects.equals(content, that.content) && Objects.equals(pics, that.pics) && Objects.equals(memberIcon, that.memberIcon) && Objects.equals(replayCount, that.replayCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, memberNickName, productName, star, memberIp, createTime, showStatus, productAttribute, collectCouont, readCount, content, pics, memberIcon, replayCount);
    }
}
