package com.obsqura.exceptionhandlingprograms;

public class InvalidAgeException {
	static int age;
	static void ageValidity(int age) {
		if(age>=18) {
			System.out.println("Age valid");
		}
		else {
			System.out.println("Age invalid");
		}
	}

	public static void main(String[] args) {
		try {
			ageValidity(9);
		}
		catch(ArithmeticException ae) {
			System.out.println("The age is invalid!");
		}
	}
}
