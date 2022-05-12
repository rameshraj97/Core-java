package com.chainsys.learning.File.Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendDataToFile {

	public static void main(String[] args) {
		
        {
        try(FileWriter fw = new FileWriter("D:Filekjdsjdsjb.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw))
            {
                out.println("the text");
                //more code
                out.println("more tegsdgdgdsxt");
                //more code
                System.out.println("Data added");
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
}
	}

	}
}
