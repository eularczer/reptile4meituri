package com.example.reptile4meituri.dao;

import com.example.reptile4meituri.entity.AlbumDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA 接口
 *
 * @since 2019-06-15
 */
public interface AlbumJpaDAO extends JpaRepository<AlbumDO, Long> {

    /**
     * 根据机构编号获取相册列表
     *
     * @param institutionType 机构编号
     */
    List<AlbumDO> findByInstitutionTypeEquals(Integer institutionType);
}
