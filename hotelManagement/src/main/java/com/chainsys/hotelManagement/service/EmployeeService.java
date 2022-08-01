package com.chainsys.hotelManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.hotelManagement.dao.EmployeeRepository;
import com.chainsys.hotelManagement.dao.HotelRepository;
import com.chainsys.hotelManagement.pojo.Employee;
import com.chainsys.hotelManagement.pojo.Hotel;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	
	public List<Employee> getEmployee() {
		List<Employee> listemp = repo.findAll();
		return listemp;
	}
//--------------------------------------
	public Employee save(Employee emp) {
		
      return repo.save(emp);
	}
//------------------------------------
	public Employee findById(int id) {
		return repo.findById(id);
//-----------------------------------
}
	public void deleteById(int id) {
		repo.deleteById(id);
}
}