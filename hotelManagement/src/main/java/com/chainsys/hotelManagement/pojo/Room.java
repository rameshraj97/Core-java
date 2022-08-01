package com.chainsys.hotelManagement.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
@Id
private int room_id;
private String room_type;
private String capacity;
private String status;
private int pay_dayrate;
private String with_toilet;
public int getRoom_id() {
	return room_id;
}
public void setRoom_id(int room_id) {
	this.room_id = room_id;
}
public String getRoom_type() {
	return room_type;
}
public void setRoom_type(String room_type) {
	this.room_type = room_type;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getPay_dayrate() {
	return pay_dayrate;
}
public void setPay_dayrate(int pay_dayrate) {
	this.pay_dayrate = pay_dayrate;
}
public String getWith_toilet() {
	return with_toilet;
}
public void setWith_toilet(String with_toilet) {
	this.with_toilet = with_toilet;
}
}
