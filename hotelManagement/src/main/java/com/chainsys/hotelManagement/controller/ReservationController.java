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

import com.chainsys.hotelManagement.pojo.Reservation;
import com.chainsys.hotelManagement.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
@Autowired
private ReservationService resservice;

@GetMapping("/addform")
public String ReservationAddForm(Model model)
{
    Reservation res = new  Reservation();
    model.addAttribute("addreservation",res);
    return "add-reservation-form";
}
//--------------------------------------
@PostMapping("/add")
public String addnewReservation(@ModelAttribute("addreservation")Reservation res)
{
  resservice.save(res);
  return "redirect:/Reservation/list";
}
//-------------------------------------
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("id") int id,Model model)
{
    Reservation res=resservice.findById(id);
    model.addAttribute("updatereservation", res);
    return "update-reservation";
}
//-------------------------------------------
@PostMapping("/updatereservation")
public String updateReservation(@ModelAttribute("updatereservation") Reservation res) {
   resservice.save(res);
    return "redirect:/Reservation/list";
}
//---------------------------------------
@GetMapping("/deletereservation")
public String deletereservation(@RequestParam("reservationid") int id) {
    resservice.deleteById(id);
    return "redirect:/reservation/list";
}
//-------------------------------------------------------------------
@GetMapping("/findreservationbyid")
public String findReservationById(@RequestParam("reservationid") int id,Model model) {
    Reservation res= resservice.findById(id);
    model.addAttribute("findreservationbyid", res);
    return "find-reservationid";
}
//----------------------------------------------------------------------
@GetMapping("/list")
public String getAllReservation(Model model)
{
    List <Reservation> reslist =resservice.getReservation();
    model.addAttribute("allreservation", reslist);
    return "list-reservation";
}
}
