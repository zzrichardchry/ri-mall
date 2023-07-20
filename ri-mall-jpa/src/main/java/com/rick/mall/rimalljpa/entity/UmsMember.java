package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_member", schema = "ri-mall")
public class UmsMember {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_level_id")
    private Long memberLevelId;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "nickname")
    private String nickname;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "gender")
    private Integer gender;
    @Basic
    @Column(name = "birthday")
    private Date birthday;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "job")
    private String job;
    @Basic
    @Column(name = "personalized_signature")
    private String personalizedSignature;
    @Basic
    @Column(name = "source_type")
    private Integer sourceType;
    @Basic
    @Column(name = "integration")
    private Integer integration;
    @Basic
    @Column(name = "growth")
    private Integer growth;
    @Basic
    @Column(name = "luckey_count")
    private Integer luckeyCount;
    @Basic
    @Column(name = "history_integration")
    private Integer historyIntegration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMember umsMember = (UmsMember) o;
        return id == umsMember.id && Objects.equals(memberLevelId, umsMember.memberLevelId) && Objects.equals(username, umsMember.username) && Objects.equals(password, umsMember.password) && Objects.equals(nickname, umsMember.nickname) && Objects.equals(phone, umsMember.phone) && Objects.equals(status, umsMember.status) && Objects.equals(createTime, umsMember.createTime) && Objects.equals(icon, umsMember.icon) && Objects.equals(gender, umsMember.gender) && Objects.equals(birthday, umsMember.birthday) && Objects.equals(city, umsMember.city) && Objects.equals(job, umsMember.job) && Objects.equals(personalizedSignature, umsMember.personalizedSignature) && Objects.equals(sourceType, umsMember.sourceType) && Objects.equals(integration, umsMember.integration) && Objects.equals(growth, umsMember.growth) && Objects.equals(luckeyCount, umsMember.luckeyCount) && Objects.equals(historyIntegration, umsMember.historyIntegration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberLevelId, username, password, nickname, phone, status, createTime, icon, gender, birthday, city, job, personalizedSignature, sourceType, integration, growth, luckeyCount, historyIntegration);
    }
}
