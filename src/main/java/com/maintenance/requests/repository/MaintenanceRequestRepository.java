package com.maintenance.requests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maintenance.requests.entity.MaintenanceRequests;

@Repository
public interface MaintenanceRequestRepository extends JpaRepository< MaintenanceRequests, Long> {

}
