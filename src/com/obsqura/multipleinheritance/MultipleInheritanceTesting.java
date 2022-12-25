package com.obsqura.multipleinheritance;

public class MultipleInheritanceTesting implements Interface1,Interface2 {

	public static void main(String[] args) {
		MultipleInheritanceTesting obj = new MultipleInheritanceTesting();
		obj.display();
		// TODO Auto-generated method stub
	}

	@Override
	public void display() {
		Interface1.super.display();// TODO Auto-generated method stub
		Interface2.super.display();
	}
}