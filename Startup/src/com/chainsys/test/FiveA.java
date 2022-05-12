package com.chainsys.test;

import java.util.Scanner;

public class FiveA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the Number");
    int value=sc.nextInt(); 
    sc.close();
    
	int a=value/100;
	int b=value%100;
	int c=b/10;
	int e=value%100;
	int z=e%10;
	 int tamp=((a*a*a)+(c*c*c)+(z*z*z));
		
	
	      
		if(tamp==value)
			System.out.println	("armstrong  number ");    
		else    
			System.out.println	("not armstrong number");    
	
		
		}
}