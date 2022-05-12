package edu.Lesson.day8.exception.ex1;

import java.util.Scanner;

public class NestedTry {
static String[]data;
public static void main(String []args) {
	int num=0;
	int numvalue=0;
	data=new String[2];
	java.util.Scanner sc=null;
	try {
		sc=new Scanner(System.in);
		try {
			System.out.println("enter value for x");
			data[6]=sc.nextLine();
			numvalue=Integer.parseInt(data[0]);
			System.out.println("the square is "+numvalue*numvalue);
		}catch(NumberFormatException nb) {
			System.out.println("not a number");
		}
		num=data.length;
		System.out.println("Array length"+num);
	}catch(ArrayIndexOutOfBoundsException ne) {
		System.out.println("Array indexoutof bounds noargments given");
	}
	catch(Exception er)
	{
		System.out.println("Exception  "+er.getMessage());
	}
}
}
