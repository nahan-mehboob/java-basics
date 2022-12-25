package com.obsqura.interfaceprograms;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		Hdfc obj= new Hdfc();
		obj.recurringDeposite(1229.5, 60);
		// TODO Auto-generated method stub
	}

	@Override
	public void recurringDeposite(double principal, int duration) {
		double amount = (principal*interest_rate*duration)/100;
		System.out.println("The amount for a period of 5 years will be: "+amount);
		// TODO Auto-generated method stub
		}
}
