package com.pil0txia.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.pil0txia.dormitory.manage.entity.DormitoryManagerEntity;

import java.util.List;

/**
 * 宿舍管理员存储服务
 *
 * @author pil0txia
 * @version 0.0.1
 * @since 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "dormitoryManager", path = "dormitoryManager")
public interface DormitoryManagerRepository extends PagingAndSortingRepository<DormitoryManagerEntity, String> {

    /**
     * 按照宿管编号查询宿管信息
     *
     * @param sn 宿管编号
     * @return 宿管信息
     */
    DormitoryManagerEntity findBySn(String sn);

    /**
     * 按照宿管姓名查询宿管信息
     *
     * @param name 姓名
     * @return 宿管信息
     */
    List<DormitoryManagerEntity> findByName(String name);
}
