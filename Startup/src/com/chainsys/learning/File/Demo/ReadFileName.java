package com.chainsys.learning.File.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileName {

	public static void main(String[] args) {

	

            try {
                   File myObj = new File("C:\\Users\\rame3119\\Desktop\\raja\\Chainsys.txt");
                   Scanner myReader = new Scanner(myObj);
                   while (myReader.hasNextLine()) {
                     String data = myReader.nextLine();
                     System.out.println("File reading: "+data);
                   }
                   myReader.close();
                 } catch (FileNotFoundException e) {
                   System.out.println("An error occurred.");
                   e.printStackTrace();
                 }
        }



}
