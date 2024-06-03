package org.spring.Spring1;

public class Laptop implements Computer {

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Laptop() {
		System.out.println("Laptop delivered...");
	}

	@Override
	public void code() {
		System.out.println("Coding on the Laptop");
	}

	@Override
	public void compile() {
		System.out.println("Compiling on the Laptop...");
	}

	public String toString() {
		return brand;
	}
}
