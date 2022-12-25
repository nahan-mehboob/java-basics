package com.obsqura.inheritanceprograms;

public class EmployeeForMemberClass extends Member {
	String deptmnt;
	String specialization;
	public EmployeeForMemberClass(String name, int age, int phone_num, String address, double salary, String deptmnt,
			String specialization) {
		super(name, age, phone_num, address, salary);
		this.deptmnt = deptmnt;
		this.specialization = specialization;
	}

	public void display() {
		super.printSalary();
	}
	public static void main(String[] args) {
		EmployeeForMemberClass efmc = new EmployeeForMemberClass("Raj",25,88665544,"Kerala",450000,"IT","Technical Support");
		efmc.display();
		
		// TODO Auto-generated method stub

	}

}
