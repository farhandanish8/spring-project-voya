package com.doctor.service;

import com.doctor.exceptions.DoctorNotFoundException;
import com.doctor.exceptions.IdNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.repository.DoctorRepositoryImpl;
import com.doctor.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
    private IDoctorRepository doctorRepository;

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.addDoctor(doctor);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		doctorRepository.updateDoctor(doctorId, fees);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteDoctor(doctorId);
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorId);
		
	}

	@Override
	public List<Doctor> getAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialityAndExp(speciality, experience);
	}

	@Override
	public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialityAndLessFees(speciality, fees);
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, double ratings) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialityAndRatings(speciality, ratings);
	}

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialityAndNameContains(speciality, doctorName);
	}

}