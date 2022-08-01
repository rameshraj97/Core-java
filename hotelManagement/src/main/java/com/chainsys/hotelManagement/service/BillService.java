package com.chainsys.hotelManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.hotelManagement.dao.BillRepository;
import com.chainsys.hotelManagement.dao.HotelRepository;
import com.chainsys.hotelManagement.pojo.Bill;
@Service
public class BillService {
	@Autowired
	private BillRepository repo;

	
	public List<Bill> getBill() {
		List<Bill> listbl = repo.findAll();
		return listbl;
	}
//---------------------------------------------
	public Bill save(Bill bl ) {

		return repo.save(bl);
	}
	//-------------------------------------
	public Bill findById(int id) {
		return repo.findById(id);
	}	
	//-------------------------------------
	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
