package com.chainsys.hotelManagement.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="reservation")
public class Reservation {
@Id
private int res_num;
private int guest_id;
private int hotel_code;
private int room_id;
private Date res_date; 
private Date from_date;
private Date to_date;
private int no_of_persons;
private String payment_status;
public int getRes_num() {
	return res_num;
}
public void setRes_num(int res_num) {
	this.res_num = res_num;
}
public int getGuest_id() {
	return guest_id;
}
public void setGuest_id(int guest_id) {
	this.guest_id = guest_id;
}
public int getHotel_code() {
	return hotel_code;
}
public void setHotel_code(int hotel_code) {
	this.hotel_code = hotel_code;
}
public int getRoom_id() {
	return room_id;
}
public void setRoom_id(int room_id) {
	this.room_id = room_id;
}
public Date getRes_date() {
	return res_date;
}
public void setRes_date(Date res_date) {
	this.res_date = res_date;
}
public Date getFrom_date() {
	return from_date;
}
public void setFrom_date(Date from_date) {
	this.from_date = from_date;
}
public Date getTo_date() {
	return to_date;
}
public void setTo_date(Date to_date) {
	this.to_date = to_date;
}
public int getNo_of_persons() {
	return no_of_persons;
}
public void setNo_of_persons(int no_of_persons) {
	this.no_of_persons = no_of_persons;
}
public String getPayment_status() {
	return payment_status;
}
public void setPayment_status(String payment_status) {
	this.payment_status = payment_status;
}
}