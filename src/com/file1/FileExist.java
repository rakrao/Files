//Program about File existing
package com.file1;

import java.io.File;

public class FileExist {  //File class

	public static void main(String[] args) {   //main function
		File file = new File("C:\\Users\\rakrao");  //object
		if (file.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File doesnot exists");
		}
	}
}
