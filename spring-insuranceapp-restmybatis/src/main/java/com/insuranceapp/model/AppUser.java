package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	
	
	private String userName;
	private String email;
	private Integer userId;
	private String password;
	
	private List<String> authorities;

	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(String userName, String email, Integer userId, String password, List<String> authorities) {
		super();
		this.userName = userName;
		this.email = email;
		this.userId = userId;
		this.password = password;
		this.authorities = authorities;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", email=" + email + ", userId=" + userId + ", password=" + password
				+ ", authorities=" + authorities + "]";
	}
	

}
