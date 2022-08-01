package com.chainsys.hotelManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.hotelManagement.dao.GuestRepository;
import com.chainsys.hotelManagement.dao.HotelRepository;
import com.chainsys.hotelManagement.pojo.Guest;
import com.chainsys.hotelManagement.pojo.Hotel;
@Service
public class GuestService {
	

		@Autowired
		private GuestRepository repo;

		
		public List<Guest> getGuest() {
			List<Guest> listgt = repo.findAll();
			return listgt;
		}
	//-------------------------------------------
		public Guest save(Guest gt ) {

			return repo.save(gt);
		}
	//-----------------------------------------
		public Guest findById(int id) {
			return repo.findById(id);
		}
	//-------------------------------------------
		public void deleteById(int id) {
			repo.deleteById(id);
		}

	}