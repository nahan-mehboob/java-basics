package com.obsqura.inheritanceprograms;

public class Employee {
	double basic;
	
	public Employee(double basic) {
		this.basic = basic;
	}

	public void calculateSalary() {
		double da= basic*12/100d;
		double hra = basic*40/100d;
		double salary = basic+da+hra;
		System.out.println("The salary amount is: "+salary);
	}
	
	public void calculateBonus() {
		double bonus = basic*10/100d;
		System.out.println("The bonus amount is: "+bonus);
	}

}
