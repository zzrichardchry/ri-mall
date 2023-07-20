package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "cms_topic_comment", schema = "ri-mall")
public class CmsTopicComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_nick_name")
    private String memberNickName;
    @Basic
    @Column(name = "topic_id")
    private Long topicId;
    @Basic
    @Column(name = "member_icon")
    private String memberIcon;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "show_status")
    private Integer showStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CmsTopicComment that = (CmsTopicComment) o;
        return id == that.id && Objects.equals(memberNickName, that.memberNickName) && Objects.equals(topicId, that.topicId) && Objects.equals(memberIcon, that.memberIcon) && Objects.equals(content, that.content) && Objects.equals(createTime, that.createTime) && Objects.equals(showStatus, that.showStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberNickName, topicId, memberIcon, content, createTime, showStatus);
    }
}
