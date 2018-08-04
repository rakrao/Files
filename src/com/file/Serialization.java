package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; //packages
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization { // class
	
	public static void main(String[] args) { // main method
		
		Employee employee = new Employee(101, "Rao", 30000); // object
		String fileName = "employee.ser"; // file declaration
		
		try (FileOutputStream fos = new FileOutputStream(fileName); // try block
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(employee);
			System.out.println("Serialization successful...");
		} catch (FileNotFoundException e) { // catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
