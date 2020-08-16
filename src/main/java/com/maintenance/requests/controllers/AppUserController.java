package com.maintenance.requests.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maintenance.requests.entity.AppUsers;
import com.maintenance.requests.repository.AppUsersRepository;

@RestController
public class AppUserController {

	@Autowired
	private AppUsersRepository appUsersRepository;

	@GetMapping("/appUsers/{id}")
	public ResponseEntity<AppUsers> getOneAppUser(@RequestParam Long id) {
		final Optional<AppUsers> appUser = appUsersRepository.findById(id);
		Optional.ofNullable(appUser).orElseThrow();
		return ResponseEntity.ok(appUser.get());
	}

	@GetMapping("/appUsers/")
	public ResponseEntity<List<AppUsers>> getAllAppUsers() {
		return ResponseEntity.ok(appUsersRepository.findAll());
	}

}
