package com.obsqura.inheritanceprograms;

public class ManagerForMemberClass extends Member {
	String deptmnt;
	String specialization;
	public ManagerForMemberClass(String name, int age, int phone_num, String address, double salary, String deptmnt,
			String specialization) {
		super(name, age, phone_num, address, salary);
		this.deptmnt = deptmnt;
		this.specialization = specialization;
	}

	public void display() {
		super.printSalary();
	}

	public static void main(String[] args) {
		ManagerForMemberClass mfmc = new ManagerForMemberClass("Ajith",45,81661541,"Kerala",1350000,"Sales","Regional Sales");
		mfmc.display();
		// TODO Auto-generated method stub

	}

}
