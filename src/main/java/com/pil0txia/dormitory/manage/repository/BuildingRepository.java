package com.pil0txia.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.pil0txia.dormitory.manage.entity.BuildingEntity;

/**
 * 楼宇存储服务
 *
 * @author pil0txia
 * @version 0.0.1
 * @since 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "building", path = "building")
public interface BuildingRepository extends PagingAndSortingRepository<BuildingEntity, String> {

    /**
     * 楼宇信息
     *
     * @param name 楼宇名称
     * @return 楼宇信息
     */
    BuildingEntity findByName(String name);
}
