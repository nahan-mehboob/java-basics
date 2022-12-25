package com.obsqura.inheritanceprograms;

public class SumDivisibility extends AdditionOfTwoNums{

	
	public SumDivisibility(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	
	public int addition() {
		int c = super.addition();
		if(c%10==0) {
			System.out.println("The sum "+c+" is divisible by 10");
		}
		else {
			System.out.println("The sum "+c+" is not divisible by 10");
		}
		return c;
	}

	
	public static void main(String[] args) {
		SumDivisibility obj1 = new SumDivisibility(10,50);
		obj1.addition();
		SumDivisibility obj2 = new SumDivisibility(34,43);
		obj2.addition();
	}
}
