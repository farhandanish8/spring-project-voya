package com.insuranceapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;

@RestController
public class InsuranceController {
	@Autowired
	IInsuranceService insuranceService;
	
	@GetMapping("/insurance")
	List<Insurance> showInsurances(){
		return insuranceService.getall();
	}
	@GetMapping("/insurance/insurance-id/{insuranceId}")
	Insurance getOne(@PathVariable("insuranceId")int insuranceId) {
	return insuranceService.getById(insuranceId);

}
}
