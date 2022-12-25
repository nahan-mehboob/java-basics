package com.obsqura.inheritanceprograms;

public class TestMain {

	public static void main(String[] args) {
		Manager obj_m = new Manager(750000);
		obj_m.calculateSalary();
		obj_m.calculateBonus();
		
		Accountant obj_a  = new Accountant(450000);
		obj_a.calculateSalary();
		obj_a.calculateBonus();
		}

}
