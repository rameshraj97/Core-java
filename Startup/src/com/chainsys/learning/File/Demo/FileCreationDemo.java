package com.chainsys.learning.File.Demo;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args) {

		File file1 = new File("C:\\Users\\rame3119\\Desktop\\raja\\test1.txt");
		boolean Present = file1.exists();
		if (Present == false)
			try {
				boolean created = file1.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
	}

}
