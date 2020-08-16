package com.maintenance.request.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.requests.entity.AppUsers;
import com.maintenance.requests.repository.AppUsersRepository;
import com.maintenance.requests.services.AppUsersInterface;

@Service
public class DefaultAppUsersImpl implements AppUsersInterface{
	
	@Autowired
	private AppUsersRepository appUsersRepo;
	
	public List<AppUsers> getAppUsers() {
		return appUsersRepo.findAll();

	}

}
