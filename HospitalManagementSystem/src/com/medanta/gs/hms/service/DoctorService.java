package com.medanta.gs.hms.service;

import com.medanta.gs.hms.pojos.Doctor;

public interface DoctorService {

	// rules // create
	public void save(Doctor doctor, int index);

	// read
	public Doctor findById(long id);

	// read
	public Doctor findByIndex(int index);

	public Doctor[] findAll();

	public void update(Doctor oldDoctor, Doctor newDoctor);

	public void delete(Doctor doctor);

}
