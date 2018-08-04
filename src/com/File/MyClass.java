//program to understand serialization using arraylist
package com.File;

import java.io.Serializable; //packages
import java.util.ArrayList;

public class MyClass implements Serializable { // class

	private static final long serialVersionUID = 8409972767134272654L;
	private int id;
	private String name; // instance member
	private double salary;

	public MyClass(int id, String name, double salary) { // constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() { // to string method
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
