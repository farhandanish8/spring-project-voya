package com.insuranceapp.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.insuranceapp.model.AppUser;

@Mapper
public interface IAppUserRepository {
	
	@Insert("insert into appuser values(#{userId},{username},#{password},#{email},#{authorities})")
	void addUser(AppUser user);
	@Select("select * from appuser where username=#{username}")
	AppUser findByUsername(String username);
	
}
