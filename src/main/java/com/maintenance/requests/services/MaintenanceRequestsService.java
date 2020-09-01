package com.maintenance.requests.services;

import java.util.List;
import java.util.Optional;

import com.maintenance.requests.entity.MaintenanceRequests;

public interface MaintenanceRequestsService {

	List<MaintenanceRequests> getMaintenanceRequests();

	Optional<MaintenanceRequests> getAMaintenanceRequest(final Long id);

	void createMaintenanceRequests(final MaintenanceRequests maintenanceRequests);

}
