package com.obsqura.inheritanceprograms;

public class Member {
	String name;
	int age;
	int phone_num;
	String address;
	double salary;
	public Member(String name, int age, int phone_num, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phone_num = phone_num;
		this.address = address;
		this.salary = salary;
	}
	public void printSalary() {
	System.out.println(name+":"+age+", "+salary+" / "+address);
	System.out.println(phone_num);
	}
}
