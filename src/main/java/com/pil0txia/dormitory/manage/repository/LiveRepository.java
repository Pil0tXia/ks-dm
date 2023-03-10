package com.pil0txia.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.pil0txia.dormitory.manage.entity.LiveEntity;

/**
 * 入住信息存储服务
 *
 * @author pil0txia
 * @version 0.0.1
 * @since 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "live", path = "live")
public interface LiveRepository extends PagingAndSortingRepository<LiveEntity, String> {
}
