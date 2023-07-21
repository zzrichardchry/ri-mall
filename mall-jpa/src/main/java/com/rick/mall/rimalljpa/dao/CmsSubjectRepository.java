package com.rick.mall.rimalljpa.dao;

import com.rick.mall.rimalljpa.entity.CmsSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author zhuhaotian
 * @Date 2023/7/18
 */

@Repository
public interface CmsSubjectRepository extends JpaRepository<CmsSubject, Long> {
}
