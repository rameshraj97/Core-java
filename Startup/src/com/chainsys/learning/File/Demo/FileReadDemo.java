package com.chainsys.learning.File.Demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		File file =new File("C:\\Users\\rame3119\\Desktop\\raja\\preethi.txt");
		try {
			file.createNewFile();
			
	   FileWriter writer=new FileWriter(file);
	   writer.write(98 );// mukkiyamanathu writer panna pothu flush, close kutukkanum
	   writer.write("how are you");
	   writer.flush();// flush ena enaah thallivitrathu,writer kaila irukaratha ellam contant ellam file thallivitum
	   writer.close();
	   
	/*   
	   FileReader filereader=new FileReader(file);
	   int output=filereader.read();
	   while(output!=-1) {
		   System.out.println((char)output);
		   output= filereader.read();*/
		   
		   
	  FileReader filereader1= new FileReader(file);
	  char[] ch= new char[(int) file.length()];
	  System.out.print(ch.length);
	  filereader1.read(ch);
	  for(char ch1:ch)
		  System.out.println(ch1 );
	  
		   
	   
		}catch(

	IOException e)
	{

		e.printStackTrace();
	}

}

}
