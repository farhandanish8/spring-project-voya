package com.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.doctor.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorAppJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorAppJdbcApplication.class, args);
	}
	
	@Autowired
	IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(doctorService.getById(1));
		doctorService.updateDoctor(5, 200);
	}

}
