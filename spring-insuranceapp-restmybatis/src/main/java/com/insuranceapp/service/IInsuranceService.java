package com.insuranceapp.service;

import java.util.List;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;

public interface IInsuranceService {

	void addInsurance(Insurance insurance);
	void updateInsurance(int insuranceId,double premiun);
	void deleteInsurance(int insuranceId);
	
	List<Insurance>getAll();
	List<Insurance>getByBrand(String brand)throws InsuranceNotFoundException;
	List<Insurance>getByBrandAndType(String brand,String type)throws InsuranceNotFoundException;
	List<Insurance>getByTypeAndLesserPremiun(String type, double premium)throws InsuranceNotFoundException;
	Insurance getById(int insuranceiId)throws InsuranceNotFoundException;
	
}
