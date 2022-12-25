package com.obsqura.inheritanceprograms;

public class Square extends Rectangle{
	public void printDisplay() {
		System.out.println("Square is a rectangle");
	}
	public void printMethod() {
	super.printMethod();
	}

	public static void main(String[] args) {
		Square obj = new Square();
		obj.printMethod();
		obj.printShape();
		// TODO Auto-generated method stub
	}
}
