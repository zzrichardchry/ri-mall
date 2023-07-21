package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "oms_order_setting", schema = "ri-mall")
public class OmsOrderSetting {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "flash_order_overtime")
    private Integer flashOrderOvertime;
    @Basic
    @Column(name = "normal_order_overtime")
    private Integer normalOrderOvertime;
    @Basic
    @Column(name = "confirm_overtime")
    private Integer confirmOvertime;
    @Basic
    @Column(name = "finish_overtime")
    private Integer finishOvertime;
    @Basic
    @Column(name = "comment_overtime")
    private Integer commentOvertime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderSetting that = (OmsOrderSetting) o;
        return id == that.id && Objects.equals(flashOrderOvertime, that.flashOrderOvertime) && Objects.equals(normalOrderOvertime, that.normalOrderOvertime) && Objects.equals(confirmOvertime, that.confirmOvertime) && Objects.equals(finishOvertime, that.finishOvertime) && Objects.equals(commentOvertime, that.commentOvertime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flashOrderOvertime, normalOrderOvertime, confirmOvertime, finishOvertime, commentOvertime);
    }
}
