package com.maintenance.requests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maintenance.requests.entity.AppUsers;

@Repository
public interface AppUsersRepository extends  JpaRepository<AppUsers, Long> {

}
