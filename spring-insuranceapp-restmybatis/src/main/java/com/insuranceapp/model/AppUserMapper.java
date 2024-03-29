package com.insuranceapp.model;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUserMapper {
	
	public AppUser convertToAppUser(UserDetails userDetails) {
		String username = userDetails.getUsername();
		String password = userDetails.getPassword();
		//List<GrantedAuthority> authorities = userDetails.getAuthorities();
		AppUser appUser = new AppUser();
		appUser.setUserName(username);
		appUser.setPassword(password);
		return appUser;
	}
	
	public UserDetails convertToUserDetails(AppUser appUser) {
		String username = appUser.getUserName();
		String password = appUser.getPassword();
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		// create roles for user
		List<String> roles = Arrays.asList("user","admin");
		for(String role:roles) {
			// create a simplegranted authority
			SimpleGrantedAuthority simpleAuthority = new SimpleGrantedAuthority(role);
			// add this to the List of grantedauthority
			authorities.add(simpleAuthority);
		}
		// create a UserDetails object
		UserDetails details = new User(username, password, authorities);
		return details;
		
				
				
	}

}
