package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Override
	public List<Insurance> getall() {
		// TODO Auto-generated method stub
		return getAllInsurances();
	}

	@Override
	public Insurance getById(int insuranceId) {
		// TODO Auto-generated method stub
		List<Insurance> insurances = getAllInsurances();
		for(Insurance insurance : insurances) {
			if(insurance.getInsuranceId()==insuranceId)
				return insurance;
		}
		return null;
	}
	
	private List<Insurance>getAllInsurances(){
		return Arrays.asList(
				new Insurance(100, "V0-H001","voya","health",10,10000),
				new Insurance(101, "BJ-M01","Bajaj","motor",10,5000),
				new Insurance(102, "FI-H001","Fidelity","life",15,8000),
				new Insurance(103, "V0-Mc01","voya","motor",12,3000),
				new Insurance(104, "FI-Motor","Fiedelity","motor",20,4500)
				);
			
			
		}
	}
	
