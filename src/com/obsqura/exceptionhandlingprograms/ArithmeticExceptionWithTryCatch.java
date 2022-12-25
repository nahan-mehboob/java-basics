package com.obsqura.exceptionhandlingprograms;

public class ArithmeticExceptionWithTryCatch {
	
	public static void main(String[] args) {
		try {
			int num=1/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("You can't divide a number by zero!");
		}
	}
}
