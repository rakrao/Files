package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //packages
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization { // class
	
	public static void main(String[] args) { // main method
		Employee employee;
		
		try (FileInputStream fis = new FileInputStream("employee.ser"); // try block
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			employee = (Employee) ois.readObject(); // object
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
