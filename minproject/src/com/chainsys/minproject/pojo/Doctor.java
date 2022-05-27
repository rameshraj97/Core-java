package com.chainsys.minproject.pojo;

import java.util.Date;

public class Doctor {
	private int Doctor_id ;
	private String Doctor_name ;
	private Date Dob ;
	private String Speciality ;
	private String City ;
	private long Phone_no;
	private float Standard_fees ;
	public int getDoctor_id() {
		return Doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		Doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return Doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		Doctor_name = doctor_name;
	}
	
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public long getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(long phone_no) {
		Phone_no = phone_no;
	}
	public float getStandard_fees() {
		return Standard_fees;
	}
	public void setStandard_fees(float f) {
		Standard_fees = f;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
}
