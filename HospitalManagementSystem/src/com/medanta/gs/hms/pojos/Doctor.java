package com.medanta.gs.hms.pojos;

public class Doctor {

	private long doctorId;
	private String doctorName;
	private String doctorSpecs;

	//Patient
	
	// new Doctor()

	public Doctor(long doctorId, String doctorName, String doctorSpecs) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpecs = doctorSpecs;
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(long doctorId, String doctorName) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}

	public Doctor(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorIdP) {
		doctorId = doctorIdP;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpecs() {
		return doctorSpecs;
	}

	public void setDoctorSpecs(String doctorSpecs) {
		this.doctorSpecs = doctorSpecs;
	}

}
