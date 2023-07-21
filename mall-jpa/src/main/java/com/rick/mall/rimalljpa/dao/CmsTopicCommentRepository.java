package com.rick.mall.rimalljpa.dao;

import com.rick.mall.rimalljpa.entity.CmsTopicComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author zhuhaotian
 * @Date 2023/7/18
 */

@Repository
public interface CmsTopicCommentRepository extends JpaRepository<CmsTopicComment, Long> {
}
