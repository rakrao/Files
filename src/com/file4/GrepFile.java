//program about grep using file
package com.file4;

import java.util.*;
import java.io.*; //packages

public class GrepFile {

	public static void main(String[] args) throws FileNotFoundException { // main function
		int count = 0, notFound = 0;
		File file = new File("C:\\Users\\rakrao\\1.txt");
		Scanner scanner = new Scanner(System.in); // input accepting
		Scanner input = new Scanner(file);

		System.out.println("Please enter the search string");
		String name = scanner.nextLine();

		System.out.println("Please enter the file name");
		String file1 = scanner.nextLine();

		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.contains(name)) { // logic
				count += 1;
				System.out.println("String " + name + " occurs at line/s " + line + " found at line number " + count);
			} else {
				count += 1;
				notFound++;
			}
		}
		if (count == notFound) {
			System.out.println("String " + name + " not found");
		}
	}
}
