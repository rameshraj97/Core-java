package com.chainsys.learning.File.Demo;

import java.io.File;
import java.io.IOException;

public class FileRename {

	public static void main(String[] args) {
		
		  File file3 =new File ("C:\\Users\\rame3119\\Desktop\\raja\\test1.txt");
		  try {
			file3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  File newname= new File("C:\\Users\\rame3119\\Desktop\\raja\\Chainsys.txt") ; 
		    boolean renameSuccess=file3.renameTo(newname) ;
		  System.out.println("rename success"+renameSuccess );
	}

}
