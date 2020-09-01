package com.maintenance.requests.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.requests.entity.MaintenanceRequests;
import com.maintenance.requests.repository.MaintenanceRequestRepository;
import com.maintenance.requests.services.MaintenanceRequestsService;

@Service
public class DefaultMaintenanceRequestImpl implements MaintenanceRequestsService {

	@Autowired
	private MaintenanceRequestRepository maintenaceRequestsRepo;

	@Override
	public List<MaintenanceRequests> getMaintenanceRequests() {

		return maintenaceRequestsRepo.findAll();
	}

	@Override
	public Optional<MaintenanceRequests> getAMaintenanceRequest(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createMaintenanceRequests(MaintenanceRequests maintenanceRequest) {
		// TODO Auto-generated method stub

	}

}
