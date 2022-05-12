package com.chainsys.learning.File.Demo2;

import java.io.*;

public class BufferedDemo {




public static void main(String[] args) throws Exception {
		
   System.out.println("enter the number");
   InputStreamReader in = new InputStreamReader(System.in);//System.in keyboarad irunthu o/p varavakkiya System.in used pandrom
   BufferedReader br=new BufferedReader(in);//byte iruka irukaradha charcter convert pantrathu used aguthu Bufferedreader 
   int n=Integer.parseInt(br.readLine());
   System.out.println( "you hava enter the number:"+n);
   System.out.println("enter the String");
   String str=br.readLine();
   System.out.println("you hava enter the string:"+str); 
   
   
 System.out.println("enter the number");
 InputStreamReader in1=new InputStreamReader(System.in);
 BufferedReader br1=new BufferedReader(in1);
 int n1=Integer.parseInt(br1.readLine());
 System.out.println("you Have enter the number :"+n1);
 String str1=br.readLine();
 
 
 
 
 
	}

 
}

 