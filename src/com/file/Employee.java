//Program to understand serialization
package com.file;

import java.io.Serializable; //packages

public class Employee implements Serializable { // class

	private static final long serialVersionUID = -1038386063463975687L;
	private int id;
	private String name;
	private double salary; // instance member

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { // getter and setter
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, double salary) { // Constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() { // to string method
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
