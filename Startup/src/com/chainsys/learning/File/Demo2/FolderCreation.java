package com.chainsys.learning.File.Demo2;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {

		{

			
			  File file =new File("C:\\Users\\rame3119\\Desktop\\raja"); 
			  boolean present=file.exists();
			 
			  System.out.println("Folder present:"+present);
			  if(present== false) file.mkdir();
			  present =file.exists();
			  System.out.println("present folder:"+present);
			  
			

			File file1 = new File("C:\\Users\\rame3119\\Desktop\\raja");
			boolean present1 = file.exists();
			System.out.println("Folder present:" + present);
			if (present == false)
				file.mkdir();
			present = file.exists();
			System.out.println("present folder:" + present);

		}

	}
}
