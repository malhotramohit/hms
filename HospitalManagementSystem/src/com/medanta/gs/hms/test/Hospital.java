package com.medanta.gs.hms.test;

import com.medanta.gs.hms.pojos.Department;
import com.medanta.gs.hms.pojos.Doctor;
import com.medanta.gs.hms.service.DoctorService;
import com.medanta.gs.hms.service.DoctorServiceImpl;

public class Hospital {
	
	private  static DoctorService doctorServiceImpl =  new DoctorServiceImpl();
	
	
	public static void main(String[] args) {

		Doctor doctor1 = new Doctor(23, "Rahul", "haddio ka doctor");

		Doctor doctor2 = new Doctor();
		doctor2.setDoctorId(45);
		doctor2.setDoctorName("Akash");

		// dept
		//Department cardioDep = new Department(1, "cardio-dep", doctor1);
		
		doctorServiceImpl.save(doctor1, 0);
		doctorServiceImpl.save(doctor2, 1);
		
		System.out.println("------save op done ----------");
		
		Doctor[] allDoctors =  doctorServiceImpl.findAll();
		
		System.out.println("------find all started----------");

		
		for (int i = 0; i < allDoctors.length; i++) {
			if(null!=allDoctors[i]) {
				
				displayDocDetails(allDoctors[i]);
			}
		}
		
		
		System.out.println("------ find all ended----------");
		
		System.out.println("----find by id 45");
		
		Doctor doct =  doctorServiceImpl.findById(45);
		
		displayDocDetails(doct);

	}

	private static void displayDocDetails(Doctor doctor1) {
		System.out.println("doctor id " + doctor1.getDoctorId());
		System.out.println("doctor name " + doctor1.getDoctorName());
	}

	private void displayDepDetails(Department dept) {
		System.out.println("dep id " + dept.getDeptId());
		System.out.println("dep name " + dept.getDeptName());
		
		displayDocDetails(dept.getDoctor());
	}

}
