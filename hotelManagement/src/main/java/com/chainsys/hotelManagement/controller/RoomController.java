package com.chainsys.hotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.hotelManagement.pojo.Hotel;
import com.chainsys.hotelManagement.pojo.Room;
import com.chainsys.hotelManagement.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
@ Autowired
private RoomService rmservice;
   
@GetMapping("/addform")
public String RoomAddFrom(Model model) {
	Room rm= new Room();
	model.addAttribute("addroom",rm);
	return"add-room-form";
}
//------------------------------------------
@PostMapping("/add")
public String addnewRoom(@ModelAttribute("addroom")Room rm)
{
	rmservice.save(rm);
  return "redirect:/room/list";
}
//-------------------------------------------
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("roomid") int id,Model model)
{
    Room rm=rmservice.findById(id);
    model.addAttribute("updateroom", rm);
    return "update-room";
}
//--------------------------------------------
@PostMapping("/updateroom")
public String updateRoom(@ModelAttribute("updateRoom") Room rm) {
   rmservice.save(rm);
    return "redirect:/room/list";
}
//-------------------------------------------------
@GetMapping("/deleteroom")
public String deleteRoom(@RequestParam("roomid") int id) {
    rmservice.deleteById(id);
    return "redirect:/room/list";
}
//-----------------------------------
@GetMapping("/findbyid")
public String findRoomById(@RequestParam("id") int id,Model model) {
    Room rm= rmservice.findById(id);
    model.addAttribute("findroombyid", rm);
    return "find-room";
}
//------------------------------------
@GetMapping("/list")
public String getAllRoom(Model model)
{
    List <Room> rmlist =rmservice.getRoom();
    model.addAttribute("allroom", rmlist);
    return "list-Room";
}
}
