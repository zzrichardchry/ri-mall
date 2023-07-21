package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_member_level", schema = "ri-mall")
public class UmsMemberLevel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "growth_point")
    private Integer growthPoint;
    @Basic
    @Column(name = "default_status")
    private Integer defaultStatus;
    @Basic
    @Column(name = "free_freight_point")
    private BigDecimal freeFreightPoint;
    @Basic
    @Column(name = "comment_growth_point")
    private Integer commentGrowthPoint;
    @Basic
    @Column(name = "priviledge_free_freight")
    private Integer priviledgeFreeFreight;
    @Basic
    @Column(name = "priviledge_sign_in")
    private Integer priviledgeSignIn;
    @Basic
    @Column(name = "priviledge_comment")
    private Integer priviledgeComment;
    @Basic
    @Column(name = "priviledge_promotion")
    private Integer priviledgePromotion;
    @Basic
    @Column(name = "priviledge_member_price")
    private Integer priviledgeMemberPrice;
    @Basic
    @Column(name = "priviledge_birthday")
    private Integer priviledgeBirthday;
    @Basic
    @Column(name = "note")
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
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
        UmsMemberLevel that = (UmsMemberLevel) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(growthPoint, that.growthPoint) && Objects.equals(defaultStatus, that.defaultStatus) && Objects.equals(freeFreightPoint, that.freeFreightPoint) && Objects.equals(commentGrowthPoint, that.commentGrowthPoint) && Objects.equals(priviledgeFreeFreight, that.priviledgeFreeFreight) && Objects.equals(priviledgeSignIn, that.priviledgeSignIn) && Objects.equals(priviledgeComment, that.priviledgeComment) && Objects.equals(priviledgePromotion, that.priviledgePromotion) && Objects.equals(priviledgeMemberPrice, that.priviledgeMemberPrice) && Objects.equals(priviledgeBirthday, that.priviledgeBirthday) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, growthPoint, defaultStatus, freeFreightPoint, commentGrowthPoint, priviledgeFreeFreight, priviledgeSignIn, priviledgeComment, priviledgePromotion, priviledgeMemberPrice, priviledgeBirthday, note);
    }
}
