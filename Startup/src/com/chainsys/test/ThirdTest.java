package com.chainsys.test;

import java.util.Scanner;

public class ThirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
 java.util.Scanner sc= new java.util.Scanner(System.in);
  System.out.println("Enter the Name");
   String Word=sc.nextLine();
   sc.close();
   int StringLength=Word.length();
   System.out.println("Count of the String number:"+StringLength);
   
   
  // java.util.Scanner scanner=new Scanner (System.in);
   System.out.println("Enter the Name");
   String sentence="Tom and Jarry are Good Frind ";
   String sentenceA="";
   
  
   char c[]=sentence.toCharArray();
   for(int b =c.length-1;b>=0;b--) {
	sentenceA=   sentenceA+c[b];
   	System.out.print(c[b]);
   }}


   
 

   }
  
	
  

