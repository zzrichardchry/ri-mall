package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "cms_member_report", schema = "ri-mall")
public class CmsMemberReport {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "report_type")
    private Integer reportType;
    @Basic
    @Column(name = "report_member_name")
    private String reportMemberName;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "report_object")
    private String reportObject;
    @Basic
    @Column(name = "report_status")
    private Integer reportStatus;
    @Basic
    @Column(name = "handle_status")
    private Integer handleStatus;
    @Basic
    @Column(name = "note")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getReportMemberName() {
        return reportMemberName;
    }

    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getReportObject() {
        return reportObject;
    }

    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CmsMemberReport that = (CmsMemberReport) o;
        return Objects.equals(id, that.id) && Objects.equals(reportType, that.reportType) && Objects.equals(reportMemberName, that.reportMemberName) && Objects.equals(createTime, that.createTime) && Objects.equals(reportObject, that.reportObject) && Objects.equals(reportStatus, that.reportStatus) && Objects.equals(handleStatus, that.handleStatus) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reportType, reportMemberName, createTime, reportObject, reportStatus, handleStatus, note);
    }
}
