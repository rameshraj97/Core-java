package com.chainsys.minproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.minproject.dao.DoctorDao;
import com.chainsys.minproject.dao.DoctorDao;
import com.chainsys.minproject.dao.DoctorDao;
import com.chainsys.minproject.pojo.Doctor;
import com.chainsys.minproject.pojo.Doctor;
import com.chainsys.minproject.pojo.Doctor;

public class TestDoctor {
	public static void testGetAllEmployees() {
		List<Doctor> allEmployees = DoctorDao.getAllDoctors();
		Iterator<Doctor> empIterator = allEmployees.iterator();
		while(empIterator.hasNext()) {
			Doctor doctor = empIterator.next();
			System.out.println(doctor.getDoctor_id()+" "+doctor.getDoctor_name()+" "+doctor.getDob());
		}
	}
	public static void testGetDoctorById() {
		Doctor doctor = DoctorDao.getDoctorById(101);
		System.out.println(doctor.getDoctor_id()+" "+doctor.getDoctor_name()+" "+doctor.getDob());
	}
	public static void testInsertDoctor() {
		Doctor newdoctor = new Doctor();
		newdoctor.setDoctor_id(110);
		newdoctor.setDoctor_name("kRaja");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		newdoctor.setDob(newDate);
	    newdoctor.setSpeciality("neuro");
		newdoctor.setCity("madurai");
		newdoctor.setPhone_no(9789156557l);
		newdoctor.setStandard_fees(800);
		
		int result = DoctorDao.insertDoctor(newdoctor);
		System.out.println(result);
		
	}
	public static void testUpdateDoctor() {
		Doctor oldDoctor=new Doctor();
		oldDoctor.setDoctor_id(110);
		oldDoctor.setDoctor_name("John");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate=c1.getTime();
		oldDoctor.setDob(newDate);
		oldDoctor.setSpeciality("den");
		oldDoctor.setCity("trichy");
		int result =DoctorDao.updateDoctorName(101, "Chennai");
		System.out.println(result);
		
	}
	public static void testDeleteDoctor() {
		int result = DoctorDao.deleteDoctor(110);
		System.out.println(result);
	}
}
