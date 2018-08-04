//Program about file word count
package com.file2;

import java.io.*;
import java.io.FileInputStream;

public class FileCount {  //class declaration

	public static void main(String[] args) throws IOException {  //main function

		File file = new File("C:\\Users\\rakrao\\1.txt");
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(filestream);  //object
		BufferedReader reader = new BufferedReader(input);

		String line;
		int countWord = 0;

		while ((line = reader.readLine()) != null) {
			if (!(line.equals(" "))) {
				String[] wordList = line.split("\\s+");  //condition check
				countWord += wordList.length;
			}
		}
		System.out.println("Total word count = " + countWord);
	}
}
