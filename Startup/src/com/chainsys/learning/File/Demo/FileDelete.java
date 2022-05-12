package com.chainsys.learning.File.Demo;

import java.io.File;

public class FileDelete {

	     public static void main(String[] args) {
		 File file2 =new File ("C:\\Users\\rame3119\\Desktop\\raja\\test1.txt");
		 boolean present1=file2.delete() ;
		 System.out.println("file present delete:"+present1);
		 
	}

}
