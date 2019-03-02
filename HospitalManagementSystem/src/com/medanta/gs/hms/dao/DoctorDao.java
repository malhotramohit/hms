package com.medanta.gs.hms.dao;

import com.medanta.gs.hms.pojos.Doctor;

public interface DoctorDao {
	
	// rules // create
	public void save(Doctor doctor,int index);

	// read
	public Doctor findByIndex(int index);

	public void update(Doctor oldDoctor, Doctor newDoctor);

	public void delete(Doctor doctor);

	public Doctor[] findAll();
}
