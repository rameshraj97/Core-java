package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.pojo.Employee;
import com.chainsys.springmvc.service.DoctorService;
@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService drservice;

    
   
    
    @GetMapping("/addform")
    public String doctorAddForm(Model model)
    {
        Doctor doc = new Doctor();
        model.addAttribute("adddoctor",doc);
        return "add-doctor-form";
    }
    @PostMapping("/add")
    public String addnewdoctor(@ModelAttribute("adddoctor")Doctor doc)
    {
    	drservice.save(doc);
      return "redirect:/doctor/list";
    }
    @GetMapping("/updateform")
    public String showUpdateForm(@RequestParam("doctorid") int id,Model model)
    {
        Doctor doc=drservice.findById(id);
        model.addAttribute("updatedoctor", doc);
        return "update-doctor-form";
    }
    @PostMapping("/updatedoctor")
    public String updatedoctor(@ModelAttribute("updatedoctor") Doctor doc) {
        drservice.save(doc);
        return "redirect:/doctor/list";
    }
    @GetMapping("/deletedoctor")
       public String deletedoctor(@RequestParam("docid") int id) {
           drservice.deleteById(id);
           return "redirect:/doctor/list";
       }
       @GetMapping("/finddoctorbyid")
       public String findDoctorById(@RequestParam("doctorid") int id,Model model) {
           Doctor doc= drservice.findById(id);
           model.addAttribute("finddoctorbyid", doc);
           return "find-doctor-id-form";
       }
       @GetMapping("/list")
       public String getAllDoctors(Model model)
       {
           List <Doctor> doclist = drservice.getDoctors();
           model.addAttribute("alldoctor", doclist);
           return "list-doctor";
       }
       @GetMapping("/getdocapp")
       public String getAppointments(@RequestParam("id") int id,Model model)
       {
           DoctorAppointmentsDTO dto=drservice.getDoctorAndAppointments(id);
           model.addAttribute("getdoc", dto.getDoctor());
           model.addAttribute("applist",dto.getAppointments() );
           return "list-doctor-appointments";
       } 
     //localhost:8080/doctor/trans?id=220
       @GetMapping("/trans")
       public void testTransaction(@RequestParam("id") int id) {
           DoctorAppointmentsDTO dto= new DoctorAppointmentsDTO();
           Doctor dr=new Doctor();
           dr.setDoctor_id(id);
           dr.setDoctor_name("ram");
           Date drdob=new Date(92,7,16);
           dr.setDob(drdob);
           dr.setCity("ooty");
           dr.setPhone_no(123456789);
           dr.setSpeciality("heart");
           dr.setStandard_fees(800);
           dto.setDoctor(dr);
           List<Appointment> applist=new ArrayList<Appointment>();
           int nextAppId=drservice.getNextAppointmentId();
             for(int i=nextAppId;i<=nextAppId+2;i++) 
               {
                   Appointment app=new Appointment();
                   app.setApp_id(i);
                   Date appdt=new Date(22,7,25);
                   app.setApp_date(appdt); 
                   app.setDoc_id(id);
                   app.setPatient_name("Strac");
                   app.setFees_collected(dr.getStandard_fees());
                   app.setFees_catagery("low");
                   dto.addAppointment(app);
               }
             drservice.addDoctorAndAppointments(dto);
             System.out.println("Successfully completed");
           
           
       }
   }