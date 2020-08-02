package com.maintenance.requests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maintenance.requests.entity.AppUsers;

public interface AppUsersRepository extends  JpaRepository<AppUsers, Long> {

}
