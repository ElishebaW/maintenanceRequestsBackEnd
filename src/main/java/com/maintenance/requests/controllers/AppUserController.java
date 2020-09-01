package com.maintenance.requests.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maintenance.requests.entity.AppUsers;
import com.maintenance.requests.services.AppUsersInterface;

@RestController
public class AppUserController {

	@Autowired
	private AppUsersInterface appUserInterface;

	@GetMapping(path = "/appUsers/{id}")
	public ResponseEntity<AppUsers> getOneAppUser(@RequestParam Long id) {
		final Optional<AppUsers> appUser = appUserInterface.getAnAppUser(id);
		return ResponseEntity.ok(appUser.get());
	}

	@GetMapping(path = "/appUsers/")
	public ResponseEntity<List<AppUsers>> getAllAppUsers() {
		final List<AppUsers> appUser = appUserInterface.getAppUsers();
		return ResponseEntity.ok(appUser);
	}

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public void createAppUser(@RequestParam AppUsers appUser) {
		appUserInterface.createAppUser(appUser);
	}

}
