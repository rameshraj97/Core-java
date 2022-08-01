package com.chainsys.hotelManagement.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
@Id
private int emp_id;
private String f_name;
private String l_name;
private int phone;
private Date dob;
private String address;
private  String gender;
private String email;
private String qualification;
private String role;
private Date date_of_joining;
private String department;
private String manager;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
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
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Date getDate_of_joining() {
	return date_of_joining;
}
public void setDate_of_joining(Date date_of_joining) {
	this.date_of_joining = date_of_joining;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}

}
