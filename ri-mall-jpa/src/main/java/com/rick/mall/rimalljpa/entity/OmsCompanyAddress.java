package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "oms_company_address", schema = "ri-mall")
public class OmsCompanyAddress {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "address_name")
    private String addressName;
    @Basic
    @Column(name = "send_status")
    private Integer sendStatus;
    @Basic
    @Column(name = "receive_status")
    private Integer receiveStatus;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "province")
    private String province;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "region")
    private String region;
    @Basic
    @Column(name = "detail_address")
    private String detailAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsCompanyAddress that = (OmsCompanyAddress) o;
        return id == that.id && Objects.equals(addressName, that.addressName) && Objects.equals(sendStatus, that.sendStatus) && Objects.equals(receiveStatus, that.receiveStatus) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(province, that.province) && Objects.equals(city, that.city) && Objects.equals(region, that.region) && Objects.equals(detailAddress, that.detailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressName, sendStatus, receiveStatus, name, phone, province, city, region, detailAddress);
    }
}
