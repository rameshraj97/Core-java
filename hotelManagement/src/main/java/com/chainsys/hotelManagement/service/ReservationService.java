package com.chainsys.hotelManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.hotelManagement.dao.ReservationRepository;
import com.chainsys.hotelManagement.pojo.Reservation;

  @Service
   public class ReservationService {
	@Autowired
	private ReservationRepository repo;

	public List<Reservation> getReservation() {
		List<Reservation> listRes = repo.findAll();
		return listRes;
	}
 //--------------------------------------------
	public Reservation save(Reservation res) {

		return repo.save(res);
	}
  //-------------------------------------------    
	public Reservation findById(int id) {
		return repo.findById(id);
	}
//--------------------------------------------
	public void deleteById(int id) {
		repo.deleteById(id);
	}

}