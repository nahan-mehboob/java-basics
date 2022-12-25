package com.obsqura.abstractionprograms;

public class FullTimeEmployee extends Employee{

	public static void main(String[] args) {
		FullTimeEmployee obj = new FullTimeEmployee();
		obj.calculateSalary(650);
	// TODO Auto-generated method stub

	}

	@Override
	void calculateSalary(int payment) {
		int working_hours=8;
		int salary = payment*working_hours;
		System.out.println("The total salary after "+working_hours+" hrs is: "+salary);
		// TODO Auto-generated method stub
	}

}
