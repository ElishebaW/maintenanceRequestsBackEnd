package com.maintenance.requests.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
public class AppUserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGetAppUsersController() throws Exception {

		mockMvc.perform(get("/appUsers/1")).andExpect(status().isOk());

	}

}
