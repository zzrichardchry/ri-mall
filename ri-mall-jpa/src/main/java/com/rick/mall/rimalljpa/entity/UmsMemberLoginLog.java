package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_member_login_log", schema = "ri-mall")
public class UmsMemberLoginLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "ip")
    private String ip;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "login_type")
    private Integer loginType;
    @Basic
    @Column(name = "province")
    private String province;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMemberLoginLog that = (UmsMemberLoginLog) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(createTime, that.createTime) && Objects.equals(ip, that.ip) && Objects.equals(city, that.city) && Objects.equals(loginType, that.loginType) && Objects.equals(province, that.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, createTime, ip, city, loginType, province);
    }
}
