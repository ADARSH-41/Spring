package org.spring.Spring1;

public class Desktop implements Computer {

	private String brand;

	public Desktop() {
		System.out.println("Destop delivered...");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void code() {
		System.out.println("Coding using Desktop");

	}

	@Override
	public void compile() {
		System.out.println("Compiling using Desktop");

	}

	public String toString() {
		return brand;
	}

}
