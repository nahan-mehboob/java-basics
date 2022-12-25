package com.obsqura.aggregationprograms;

public class EmployeeCarBikeList {
	String emp_name;
	int emp_id;
	Car car;
	Bike bike;
	public EmployeeCarBikeList(String emp_name,int emp_id,Car car,Bike bike) {
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.car=car;
		this.bike=bike;
		}
	public void display() {
		System.out.println(emp_name+" : "+emp_id);
		System.out.println(car.car_name+" : "+car.registrtn_no+"/"+car.car_color);
		System.out.println(bike.bike_name+" : "+bike.reg_no);
		}
	public static void main(String[] args) {
		Car c1 = new Car("Bentley",7171,"Titan Grey");
		Bike b1 = new Bike("Pulsar",444);
		EmployeeCarBikeList e1 = new EmployeeCarBikeList("Joan",101,c1,b1);
		e1.display();
		
		Car c2 = new Car("Rolls Royce",1111,"Dark Emerald");
		Bike b2 = new Bike("Duke",606);
		EmployeeCarBikeList e2 = new EmployeeCarBikeList("Anne",102,c2,b2);
		e2.display();
		
		Car c3 = new Car("Mini Cooper",333,"Chilli Red");
		Bike b3 = new Bike("Ducati",916);
		EmployeeCarBikeList e3 = new EmployeeCarBikeList("Dan",106,c3,b3);
		e3.display();
		}}
