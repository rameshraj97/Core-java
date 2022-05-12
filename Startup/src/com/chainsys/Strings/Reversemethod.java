package com.chainsys.Strings;

import java.util.Scanner;

public class Reversemethod {

public static void reverse (){
java.util.Scanner scanner=new Scanner (System.in);
System.out.println("Enter the Name");
String sentence="";
//String sentenceA="";
try {
	sentence=scanner.nextLine();
}finally {
	scanner.close();
}
char c[]=sentence.toCharArray();
for(int i=c.length-1;i>=0;i--) {
	System.out.println(c[i]);
}}


	public static void verify(String s1) {
		if (null==s1)
		{
	  System.out.println("String is Null");
	  return;
	  
		}
		else
			System.out.println("String is Not Null"+s1);
		
    if(!s1.isEmpty()) 
    	System.out.println("\t Not Empty"+s1);
    else
    		System.out.println("\t String is Empty");
    }}