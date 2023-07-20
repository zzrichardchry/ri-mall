package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_admin_login_log", schema = "ri-mall")
public class UmsAdminLoginLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "admin_id")
    private Long adminId;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "ip")
    private String ip;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "user_agent")
    private String userAgent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsAdminLoginLog that = (UmsAdminLoginLog) o;
        return id == that.id && Objects.equals(adminId, that.adminId) && Objects.equals(createTime, that.createTime) && Objects.equals(ip, that.ip) && Objects.equals(address, that.address) && Objects.equals(userAgent, that.userAgent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminId, createTime, ip, address, userAgent);
    }
}
