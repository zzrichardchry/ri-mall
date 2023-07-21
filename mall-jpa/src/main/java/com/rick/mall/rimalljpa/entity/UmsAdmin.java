package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_admin", schema = "ri-mall")
public class UmsAdmin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "nick_name")
    private String nickName;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "login_time")
    private Timestamp loginTime;
    @Basic
    @Column(name = "status")
    private Integer status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsAdmin umsAdmin = (UmsAdmin) o;
        return id == umsAdmin.id && Objects.equals(username, umsAdmin.username) && Objects.equals(password, umsAdmin.password) && Objects.equals(icon, umsAdmin.icon) && Objects.equals(email, umsAdmin.email) && Objects.equals(nickName, umsAdmin.nickName) && Objects.equals(note, umsAdmin.note) && Objects.equals(createTime, umsAdmin.createTime) && Objects.equals(loginTime, umsAdmin.loginTime) && Objects.equals(status, umsAdmin.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, icon, email, nickName, note, createTime, loginTime, status);
    }
}
