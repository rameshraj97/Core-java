package com.chainsys.learning.File.Demo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileNew {
	public static void main(String args[])
	{
		copyFile("D:\\temp\\chainsys.txt","D:\\temp\\NewFolder","test.txt");
		
	}
	public static boolean copyFile(String sourcePath,String destFolderPath,  String fileName) {
        boolean fileMoved = true;

         try {

             Files.copy(Paths.get(sourcePath), Paths.get(destFolderPath, fileName),StandardCopyOption.REPLACE_EXISTING);
             System.out.println("File is copy Successful");

         } catch (Exception e) {

             fileMoved = false;
             System.out.println("Error!!!"+e.getMessage());
         }

         return fileMoved;
        }

}
