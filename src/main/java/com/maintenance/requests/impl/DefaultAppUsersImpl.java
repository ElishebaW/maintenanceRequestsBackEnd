package com.maintenance.requests.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maintenance.requests.entity.AppUsers;
import com.maintenance.requests.repository.AppUsersRepository;
import com.maintenance.requests.services.AppUsersInterface;

@Component
public class DefaultAppUsersImpl implements AppUsersInterface {

	@Autowired
	private AppUsersRepository appUsersRepo;

	public List<AppUsers> getAppUsers() {
		return appUsersRepo.findAll();

	}

	public Optional<AppUsers> getAnAppUser(Long id) {
		return appUsersRepo.findById(id);
	}

}
