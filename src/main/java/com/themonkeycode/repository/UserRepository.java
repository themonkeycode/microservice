package com.themonkeycode.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.themonkeycode.entity.User;
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    List<User> findByFirstName(@Param("name") String name);
}