package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "cms_topic", schema = "ri-mall")
public class CmsTopic {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;
    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;
    @Basic
    @Column(name = "attend_count")
    private Integer attendCount;
    @Basic
    @Column(name = "attention_count")
    private Integer attentionCount;
    @Basic
    @Column(name = "read_count")
    private Integer readCount;
    @Basic
    @Column(name = "award_name")
    private String awardName;
    @Basic
    @Column(name = "attend_type")
    private String attendType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAttendType() {
        return attendType;
    }

    public void setAttendType(String attendType) {
        this.attendType = attendType;
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
        CmsTopic cmsTopic = (CmsTopic) o;
        return id == cmsTopic.id && Objects.equals(categoryId, cmsTopic.categoryId) && Objects.equals(name, cmsTopic.name) && Objects.equals(createTime, cmsTopic.createTime) && Objects.equals(startTime, cmsTopic.startTime) && Objects.equals(endTime, cmsTopic.endTime) && Objects.equals(attendCount, cmsTopic.attendCount) && Objects.equals(attentionCount, cmsTopic.attentionCount) && Objects.equals(readCount, cmsTopic.readCount) && Objects.equals(awardName, cmsTopic.awardName) && Objects.equals(attendType, cmsTopic.attendType) && Objects.equals(content, cmsTopic.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, name, createTime, startTime, endTime, attendCount, attentionCount, readCount, awardName, attendType, content);
    }
}
