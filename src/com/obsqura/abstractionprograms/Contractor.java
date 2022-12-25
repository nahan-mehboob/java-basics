package com.obsqura.abstractionprograms;

public class Contractor extends Employee {

	public static void main(String[] args) {
		Contractor obj = new Contractor();
		obj.calculateSalary(500);
	// TODO Auto-generated method stub
}

	@Override
	void calculateSalary(int payment) {
		int working_hours=12;
		int salary = payment*working_hours;
		System.out.println("The total salary after 10 hours is: "+salary);
		// TODO Auto-generated method stub
		
	}
	
		
	}


