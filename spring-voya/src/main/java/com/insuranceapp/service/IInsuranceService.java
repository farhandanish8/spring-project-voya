package com.insuranceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
@Service
public interface IInsuranceService {
	List<Insurance> getall();
	Insurance getById(int insuranceId);

}
