package com.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream; //packages
import java.util.ArrayList;

public class Deser {
	public static void main(String[] args) { // main method
		ArrayList<MyClass> list;

		try (FileInputStream fis = new FileInputStream("list.ser"); // try block
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			list = (ArrayList<MyClass>) ois.readObject(); // object
			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
