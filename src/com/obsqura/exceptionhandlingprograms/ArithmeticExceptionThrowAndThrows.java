package com.obsqura.exceptionhandlingprograms;

public class ArithmeticExceptionThrowAndThrows {
	public static void method() throws ArithmeticException{
		int num = 1/0;
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		try {
			method();
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Number cannot be divided by zero");
		}
	}

}
