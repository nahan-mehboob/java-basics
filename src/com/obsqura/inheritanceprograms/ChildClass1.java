package com.obsqura.inheritanceprograms;

public class ChildClass1 extends ParentClass {
	public void method() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		ChildClass1 obj2 = new ChildClass1();
		obj2.method();//method of child class by object of child class
		// TODO Auto-generated method stub

	}

}
