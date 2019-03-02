package com.medanta.gs.hms.pojos;

public class Department {

	private long deptId;
	private String deptName;

	// has a rel: dept has doct
	private Doctor doctor;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(long deptId, String deptName, Doctor doctor) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.doctor = doctor;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
