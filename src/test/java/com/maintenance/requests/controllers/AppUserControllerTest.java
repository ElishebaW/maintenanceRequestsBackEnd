package com.maintenance.requests.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.maintenance.requests.services.AppUsersInterface;

@SpringBootTest
@AutoConfigureMockMvc
public class AppUserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	private AppUsersInterface appUserInterface;

	@Test
	public void testGetAppUsersController() throws Exception {

		mockMvc.perform(get("/appUsers/")).andExpect(status().isOk());

	}

	@Test
	public void testGetAnAppUserController() throws Exception {

		mockMvc.perform(get("/appUsers/1")).andExpect(status().isOk());

	}

	@Test
	public void testCreateAppUsersController() throws Exception {

		mockMvc.perform(post("/")).andExpect(status().isCreated());

	}

}
