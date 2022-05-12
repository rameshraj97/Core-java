package com.chainsys.learning.File.Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ModifyFile {

	public static void main(String[] args) throws IOException{
        {
        	
          String source = ("C:\\Users\\rame3119\\Desktop\\raja\\Chainsys.txt");
           Scanner sc = new Scanner(new File(source));
           StringBuffer buffer1 = new StringBuffer();
           while (sc.hasNextLine()) {
              buffer1.append(sc.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer1.toString();
            System.out.println("Contents of the file: "+fileContents);
            sc.close();
            String oldLine = "rame";
            String newLine = "I am a Naughty boy";
            fileContents = fileContents.replaceAll(oldLine, newLine);
            FileWriter writer = new FileWriter(source);
            System.out.println("");
            System.out.println("new data: "+fileContents);
            writer.append(fileContents);
            writer.flush();
        }
	}
	
}
