package com.medanta.gs.hms.service;

import com.medanta.gs.hms.dao.DoctorDao;
import com.medanta.gs.hms.dao.DoctorDaoImpl;
import com.medanta.gs.hms.pojos.Doctor;

// create read update deleted doctor
public class DoctorServiceImpl implements DoctorService {

	//
	private DoctorDao doctorDaoImpl = new DoctorDaoImpl();

	@Override
	public void save(Doctor doctor, int index) {
		doctorDaoImpl.save(doctor, index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medanta.gs.hms.service.DoctorService#findById(long) Find any doctor
	 * by id from the array
	 * 
	 */
	@Override
	public Doctor findById(long id) {
		// 23
		// array = findAll
		// 1) Doctor[] allDoctors = findAll();

		Doctor[] allDoctors = doctorDaoImpl.findAll();

		Doctor doctorToReturn = null;

		int size = allDoctors.length;

		for (int i = 0; i < size; i++) {
			Doctor doctor = allDoctors[i];
			if (doctor.getDoctorId() == id) {
				doctorToReturn = doctor;
				break;
			}
		}

		return doctorToReturn;
	}

	@Override
	public void update(Doctor oldDoctor, Doctor newDoctor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Doctor doctor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Doctor[] findAll() {
		// TODO Auto-generated method stub
		return doctorDaoImpl.findAll();
	}

	@Override
	public Doctor findByIndex(int index) {
		// TODO Auto-generated method stub
		return doctorDaoImpl.findByIndex(index);
	}

}
