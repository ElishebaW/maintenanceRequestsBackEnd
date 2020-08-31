package com.maintenance.requests.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maintenance.requests.entity.AppUsers;

@Service
public interface AppUsersInterface {

	List<AppUsers> getAppUsers();

	Optional<AppUsers> getAnAppUser(final Long id);

	void createAppUser(final AppUsers appUser);
}
