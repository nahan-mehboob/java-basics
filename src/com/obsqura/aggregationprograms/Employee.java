package com.obsqura.aggregationprograms;

public class Employee {
	String emp_name;
	int emp_id;
	Car car;
	public Employee(String emp_name,int emp_id,Car car) {
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.car=car;
	}
	public void display() {
		System.out.println(emp_name+" : "+emp_id);
		System.out.println(car.car_name+" : "+car.registrtn_no+"/"+car.car_color);
		}

	public static void main(String[] args) {
		Car c1 = new Car("Bentley",7171,"Titan Grey");
		Employee e1 = new Employee("Joan",101,c1);
		e1.display();
		
		Car c2 = new Car("Rolls Royce",1111,"Dark Emerald");
		Employee e2 = new Employee("Anne",102,c2);
		e2.display();
		
		Car c3 = new Car("Mini Cooper",333,"Chilli Red");
		Employee e3 = new Employee("Dan",106,c3);
		e3.display();
		// TODO Auto-generated method stub

	}

}
