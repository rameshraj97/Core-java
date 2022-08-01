package com.chainsys.hotelManagement.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="guest")
public class Guest {
	@Id
private int guest_id;
private String f_name;
private String l_name;
private long phone_no;
private String address;
private String email;
private String gender;
private  Date dob;
private long aadhar_number;
public int getGuest_id() {
	return guest_id;
}
public void setGuest_id(int guest_id) {
	this.guest_id = guest_id;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public long getPhone_no() {
	return phone_no;
}
public void setPhone_no(long phone_no) {
	this.phone_no = phone_no;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public long getAadhar_number() {
	return aadhar_number;
}
public void setAadhar_number(long aadhar_number) {
	this.aadhar_number = aadhar_number;
}
}