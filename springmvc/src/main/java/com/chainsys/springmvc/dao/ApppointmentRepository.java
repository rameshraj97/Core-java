package com.chainsys.springmvc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.springmvc.pojo.Appointment;

public interface ApppointmentRepository extends CrudRepository<Appointment,Integer>
{
Appointment findByid(int id);
Appointment save(Appointment app);

void deleteById (int app_id);
List <Appointment>findAll();
//define netive query for  this method 
int getNextId();
}
