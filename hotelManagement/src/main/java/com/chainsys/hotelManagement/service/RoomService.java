package com.chainsys.hotelManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.hotelManagement.dao.RoomRepository;
import com.chainsys.hotelManagement.pojo.Room;

@Service
public class RoomService {
	@Autowired
	private RoomRepository repo;

	public List<Room> getRoom() {
		List<Room> listrm = repo.findAll();
		return listrm;

	}
//------------------------------------
	public Room save(Room rm) {

		return repo.save(rm);
	}
//-------------------------------------
	public Room findById(int id) {
		return repo.findById(id);
	}
//-------------------------------------
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}
