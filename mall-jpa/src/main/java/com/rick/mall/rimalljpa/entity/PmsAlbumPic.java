package com.rick.mall.rimalljpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author zhuhaotian
 * @Date 2023/7/14
 */

@Entity
@Table(name = "pms_album_pic", schema = "ri-mall")
public class PmsAlbumPic {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "album_id")
    private Long albumId;
    @Basic
    @Column(name = "pic")
    private String pic;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsAlbumPic that = (PmsAlbumPic) o;
        return id == that.id && Objects.equals(albumId, that.albumId) && Objects.equals(pic, that.pic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId, pic);
    }
}
