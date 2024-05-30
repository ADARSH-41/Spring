package org.spring.Spring1;

import java.beans.ConstructorProperties;

public class Alien {

	private String aname;
	private int age;
	private Computer computer1;
	int salary;

	public Alien() {
		System.out.println("Alien Object Created");
	}

	@ConstructorProperties({ "aname", "age", "computer1", "salary" })
	public Alien(String aname, int age, Computer computer1, int salary) {
		this.aname = aname;
		this.age = age;
		this.computer1 = computer1;
		this.salary = salary;
	}

	public Alien(String aname, int age, Computer computer1) {
		this.aname = aname;
		this.age = age;
		this.computer1 = computer1;
		System.out.println("3arg constructor...");
	}

	public Computer getcomputer1() {
		return computer1;
	}

	public void setcomputer1(Computer computer1) {
		this.computer1 = computer1;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void code() {
		System.out.println("Coding");
		computer1.compile();
	}

	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", age=" + age + ", computer=" + computer1 + ", salary=" + salary + "]";
	}

}
