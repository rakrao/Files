package com.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException; //packages
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ser {

	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>(); // ArrayList
		MyClass m1 = new MyClass(101, "Rakshith", 20000);
		MyClass m2 = new MyClass(102, "Harshith", 30000);// Objects
		MyClass m3 = new MyClass(103, "Rao", 10000);
		MyClass m4 = new MyClass(104, "Rakesh", 60000);
		MyClass m5 = new MyClass(105, "Ram", 50000);

		list.add(m1);
		list.add(m2);// Adding to list
		list.add(m3);
		list.add(m4);
		list.add(m5);

		String fileName = "list.ser"; // file declaration

		try (FileOutputStream fos = new FileOutputStream(fileName); // try block
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
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
