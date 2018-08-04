//Program about Line count in file
package com.file3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLineCount {

	public static void main(String[] args) throws IOException { // main function

		File file = new File("C:\\Users\\rakrao\\1.txt");
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(filestream); // object
		BufferedReader reader = new BufferedReader(input);

		String line;
		int countSentence = 0;

		while ((line = reader.readLine()) != null) {
			if (!(line.equals(" "))) {
				String[] sentenceList = line.split("[!?.:]+"); // condition check
				countSentence += sentenceList.length;
			}
		}
		System.out.println("Total Line count = " + countSentence);
	}
}
