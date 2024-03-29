package com.insuranceapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.model.AppUser;
import com.insuranceapp.model.AppUserMapper;
import com.insuranceapp.util.JwtTokenUtil;
@RestController
@RequestMapping("/user-api/v1")
public class AppUserController {
	@Autowired
	private UserDetailsManager appUserServiceImpl;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	JwtTokenUtil tokenUtil;
	@Autowired
	private AppUserMapper appUserMapper;
	
	@PostMapping("/register")
	ResponseEntity<Void> createUser(@RequestBody AppUser appUser){
		UserDetails details = appUserMapper.convertToUserDetails(appUser);
		appUserServiceImpl.createUser(details);
		return ResponseEntity.status(HttpStatus.CREATED.value()).build();
	}
	@PostMapping("/register")
	ResponseEntity<String> authenticateUser(@RequestBody AppUser appUser){
		appUserServiceImpl.loadUserByUsername(appUser.getUserName());
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(null);
	}
}