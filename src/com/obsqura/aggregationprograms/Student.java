package com.obsqura.aggregationprograms;

public class Student {
	String student_name;
	int rollno;
	Address address;
	public Student(String student_name,int rollno,Address address) {
		this.student_name = student_name;
		this.rollno = rollno;
		this.address=address;
		}
	public void display() {
		System.out.print(student_name+":"+rollno+" /");
		System.out.println(address.district+", "+address.state+", "+address.country);
	}
	public static void main(String[] args) {
		Address a1 = new Address("Thrissur","Kerala","India");
		Student s1 = new Student("Varun",1271,a1);
		s1.display();
		
		Address a2 = new Address("Kannur","Kerala","India");
		Student s2 = new Student("Maitreyi",1272,a2);
		s2.display();
		
		Address a3 = new Address("Kottayam","Kerala","India");
		Student s3 = new Student("Joshua",1270,a3);
		s3.display();
		// TODO Auto-generated method stub
	}
}
