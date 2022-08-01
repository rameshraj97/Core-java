package com.chainsys.hotelManagement.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bill")
public class Bill {
@Id
 private int invoice;
 private int guest_id;
 private int room_charge;
 private Date invoice_date;
 private int res_num;
 private String payment_mode;
 private String invoice_status;
public int getInvoice() {
	return invoice;
}
public void setInvoice(int invoice) {
	this.invoice = invoice;
}
public int getGuest_id() {
	return guest_id;
}
public void setGuest_id(int guest_id) {
	this.guest_id = guest_id;
}
public int getRoom_charge() {
	return room_charge;
}
public void setRoom_charge(int room_charge) {
	this.room_charge = room_charge;
}
public Date getInvoice_date() {
	return invoice_date;
}
public void setInvoice_date(Date invoice_date) {
	this.invoice_date = invoice_date;
}
public int getRes_num() {
	return res_num;
}
public void setRes_num(int res_num) {
	this.res_num = res_num;
}
public String getPayment_mode() {
	return payment_mode;
}
public void setPayment_mode(String payment_mode) {
	this.payment_mode = payment_mode;
}
public String getInvoice_status() {
	return invoice_status;
}
public void setInvoice_status(String invoice_status) {
	this.invoice_status = invoice_status;
}
}