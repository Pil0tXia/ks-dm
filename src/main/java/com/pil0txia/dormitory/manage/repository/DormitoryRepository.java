package com.pil0txia.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.pil0txia.dormitory.manage.entity.DormitoryEntity;

/**
 * 宿舍存储服务
 *
 * @author pil0txia
 * @version 0.0.1
 * @since 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "dormitory", path = "dormitory")
public interface DormitoryRepository extends PagingAndSortingRepository<DormitoryEntity, String> {

    /**
     * 按照宿舍编号查询宿舍信息
     *
     * @param sn 宿舍编号
     * @return 宿舍信息
     */
    DormitoryEntity findBySn(String sn);
}
