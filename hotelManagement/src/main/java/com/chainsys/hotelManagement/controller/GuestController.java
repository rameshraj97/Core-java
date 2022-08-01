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

import com.chainsys.hotelManagement.pojo.Guest;
import com.chainsys.hotelManagement.pojo.Hotel;
import com.chainsys.hotelManagement.service.GuestService;
import com.chainsys.hotelManagement.service.HotelService;
@Controller
@RequestMapping("/guest")
public class GuestController {
	
@Autowired
private GuestService gtservice;


@GetMapping("/addform")
public String guestAddForm(Model model)
{
    Guest gt = new Guest();
    model.addAttribute("addguest",gt);
    return "add-guest-form";
}
//----------------------------------------------------------------
@PostMapping("/add")
public String addnewguest(@ModelAttribute("addguest")Guest gt)
{
gtservice.save(gt);
  return "redirect:/guest/list";
}
//---------------------------------------
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("guestid") int id,Model model)
{
    Guest gt=gtservice.findById(id);
    model.addAttribute("updateguest", gt);
    return "update-guest";
}
//------------------------------------------
@PostMapping("/updateguest")
public String updateguest(@ModelAttribute("updateguest") Guest gt) {
  gtservice.save(gt);
    return "redirect:/guest/list";
}
//------------------------------------
@GetMapping("/deleteguest")
public String deleteguest(@RequestParam("guestid") int id) {
    gtservice.deleteById(id);
    return "redirect:/guest/list";
}
//---------------------------------------------
@GetMapping("/list")
public String getAllGuest(Model model)
{
    List <Guest> gtlist =gtservice.getGuest();
    model.addAttribute("allguest", gtlist);
    return "list-guest";
}
}
