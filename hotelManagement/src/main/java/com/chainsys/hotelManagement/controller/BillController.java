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

import com.chainsys.hotelManagement.pojo.Bill;
import com.chainsys.hotelManagement.pojo.Hotel;
import com.chainsys.hotelManagement.service.BillService;


@Controller
@RequestMapping("/bill")
public class BillController {
	@Autowired
	private BillService blservice;
 
	@GetMapping("/addform")
	public String BillAddForm(Model model)
	{
	    Bill bi = new Bill();
	    model.addAttribute("addbill",bi);
	    return "add-bill-form";
	}
	//-------------------------------------
	@PostMapping("/add")
	public String addnewBill(@ModelAttribute("addbill")Bill bi)
	{
		blservice.save(bi);
	  return "redirect:/bill/list";
	}
	//----------------------------------
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("billid") int id,Model model)
	{
	    Bill bi=blservice.findById(id);
	    model.addAttribute("updatebill",bi);
	    return "update-bill";
	}
	//--------------------------------------
	@PostMapping("/updatebill")
	public String updateBill(@ModelAttribute("updatebill") Bill bi) {
	   blservice.save(bi);
	    return "redirect:/bill/list";
	}
	//--------------------------------------
	@GetMapping("/deletehotel")
	public String deleteBill(@RequestParam("billid") int id) {
	    blservice.deleteById(id);
	    return "redirect:/bill/list";
	}
	//----------------------------------
	@GetMapping("/findbyid")
	public String findBillById(@RequestParam("id") int id,Model model) {
	    Bill bi= blservice.findById(id);
	    model.addAttribute("findbillbyid", bi);
	    return "find-bill";
	}
	//-----------------------------------
	@GetMapping("/list")
	public String getAllBill(Model model)
	{
	    List <Bill> bilist =blservice.getBill();
	    model.addAttribute("allbill", bilist);
	    return "list-bill";
	}
	}

