package com.Chain.dataLesson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.crypto.Data;


public class WorkingwithData {
public static void displayCurrentData() {
	Calendar calendar=Calendar.getInstance();
    Date data=calendar.getTime();
    System.out.println(data);
    SimpleDateFormat dataFormat=new SimpleDateFormat("YYYY-MM-DD");
	System.out.println(data);
	}
public static void displayDor()	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Dor: (YYYY-MM-DD)");
	String dod =sc.nextLine();
	sc.close();
	int year=Integer.parseInt(dod.substring(0,4));
	int month=Integer.parseInt(dod.substring(5,7))-1;
	int day=Integer.parseInt(dod.substring(8,10));
	System.out.println(year+" "+month+" "+day+" ");
	
	Calendar data=new GregorianCalendar(year,month,day);
	Date dob=data.getTime();

	
	SimpleDateFormat f1=new SimpleDateFormat("YYYY-MM-DD");
	System.out.println("dor"+f1.format(dob));
	//retirement data
	data.add(Calendar.YEAR,60);
	data.add(Calendar.MONTH,7);
	data.add(Calendar.DAY_OF_MONTH,1);
	data.add(Calendar.DATE,1);
	System.out.println("DOB"+f1.format(data.getTime()));

	
	
	
	
	
	
	
}
}

