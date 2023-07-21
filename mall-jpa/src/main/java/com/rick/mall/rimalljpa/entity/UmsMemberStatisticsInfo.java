package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "ums_member_statistics_info", schema = "ri-mall")
public class UmsMemberStatisticsInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "consume_amount")
    private BigDecimal consumeAmount;
    @Basic
    @Column(name = "order_count")
    private Integer orderCount;
    @Basic
    @Column(name = "coupon_count")
    private Integer couponCount;
    @Basic
    @Column(name = "comment_count")
    private Integer commentCount;
    @Basic
    @Column(name = "return_order_count")
    private Integer returnOrderCount;
    @Basic
    @Column(name = "login_count")
    private Integer loginCount;
    @Basic
    @Column(name = "attend_count")
    private Integer attendCount;
    @Basic
    @Column(name = "fans_count")
    private Integer fansCount;
    @Basic
    @Column(name = "collect_product_count")
    private Integer collectProductCount;
    @Basic
    @Column(name = "collect_subject_count")
    private Integer collectSubjectCount;
    @Basic
    @Column(name = "collect_topic_count")
    private Integer collectTopicCount;
    @Basic
    @Column(name = "collect_comment_count")
    private Integer collectCommentCount;
    @Basic
    @Column(name = "invite_friend_count")
    private Integer inviteFriendCount;
    @Basic
    @Column(name = "recent_order_time")
    private Timestamp recentOrderTime;

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

    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    public Timestamp getRecentOrderTime() {
        return recentOrderTime;
    }

    public void setRecentOrderTime(Timestamp recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMemberStatisticsInfo that = (UmsMemberStatisticsInfo) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(consumeAmount, that.consumeAmount) && Objects.equals(orderCount, that.orderCount) && Objects.equals(couponCount, that.couponCount) && Objects.equals(commentCount, that.commentCount) && Objects.equals(returnOrderCount, that.returnOrderCount) && Objects.equals(loginCount, that.loginCount) && Objects.equals(attendCount, that.attendCount) && Objects.equals(fansCount, that.fansCount) && Objects.equals(collectProductCount, that.collectProductCount) && Objects.equals(collectSubjectCount, that.collectSubjectCount) && Objects.equals(collectTopicCount, that.collectTopicCount) && Objects.equals(collectCommentCount, that.collectCommentCount) && Objects.equals(inviteFriendCount, that.inviteFriendCount) && Objects.equals(recentOrderTime, that.recentOrderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, consumeAmount, orderCount, couponCount, commentCount, returnOrderCount, loginCount, attendCount, fansCount, collectProductCount, collectSubjectCount, collectTopicCount, collectCommentCount, inviteFriendCount, recentOrderTime);
    }
}
