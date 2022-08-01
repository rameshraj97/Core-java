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

import com.chainsys.hotelManagement.pojo.Employee;
import com.chainsys.hotelManagement.pojo.Hotel;
import com.chainsys.hotelManagement.service.EmployeeService;
import com.chainsys.hotelManagement.service.HotelService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService empservice;


@GetMapping("/addform")
public String EmployeeAddForm(Model model)
{
    Employee emp = new Employee();
    model.addAttribute("addemployee",emp);
    return "add-employee-form";
}
//--------------------------------------------------
@PostMapping("/add")
public String addnewEmployee(@ModelAttribute("addemployee")Employee emp)
{
	empservice.save(emp);
  return "redirect:/employee/list";
}
//---------------------------------------------
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("employeeid") int id,Model model)
{
    Employee emp=empservice.findById(id);
    model.addAttribute("updateemployee", emp);
    return "update-employee";
}
//-----------------------------------------
@PostMapping("/updateemployee")
public String updateEmployee(@ModelAttribute("updateemployee") Employee emp) {
   empservice.save(emp);
    return "redirect:/employee/list";
}
//-----------------------------------------------------
@GetMapping("/deleteemployee")
public String deleteEmployee(@RequestParam("employeeid") int id) {
    empservice.deleteById(id);
    return "redirect:/employee/list";
}
//-------------------------------------------------
@GetMapping("/findbyid")
public String findEmployeeById(@RequestParam("id") int id,Model model) {
    Employee emp= empservice.findById(id);
    model.addAttribute("findemployeebyid", emp);
    return "find-employee";
}
//----------------------------------------------------------
@GetMapping("/list")
public String getAllEmployee(Model model)
{
    List <Employee> emplist =empservice.getEmployee();
    model.addAttribute("allemployee", emplist);
    return "list-employee";
}
}
