package com.medanta.gs.hms.dao;

import com.medanta.gs.hms.pojos.Doctor;

//static virtual database
public class DoctorDaoImpl implements DoctorDao {

	// String[]
	// int[]

	private static Doctor[] doctorDB = new Doctor[5];

	@Override
	public void save(Doctor doctor,int index) {
		doctorDB[index] = doctor;
	}

	@Override
	public Doctor[] findAll() {
		
		return doctorDB;
	}
	
	@Override
	public Doctor findByIndex(int index) {
		
		return doctorDB[index];
	}

	@Override
	public void update(Doctor oldDoctor, Doctor newDoctor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Doctor doctor) {
		// TODO Auto-generated method stub

	}
	
	public void dontseeme() {
		
	}

}
