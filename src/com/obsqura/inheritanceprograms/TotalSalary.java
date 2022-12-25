package com.obsqura.inheritanceprograms;

public class TotalSalary extends HraAndPf {
	double salary;
	
	public TotalSalary(double basic_pay, double deduction, double bonus) {
		super(basic_pay, deduction, bonus);
		// TODO Auto-generated constructor stub
	}
	
	public void calculateSalary() {
		super.calculateHra();
		super.calculatePf();
		salary = basic_pay+bonus+hra-pf-deduction;
		}
	
	public void salarySlip() {
		System.out.println("The salary slip is as follows");
		System.out.println("The basic pay is: "+basic_pay);
		System.out.println("The bonus is: "+bonus);
		System.out.println("The pf is: "+pf);
		System.out.println("The hra is: "+hra);
		System.out.println("The deduction is: "+deduction);
		System.out.println("The total salary is: "+salary);
	}
	
	public static void main(String[] args) {
		TotalSalary obj = new TotalSalary(basic_pay, deduction, bonus);
		obj.calculateHra();
		obj.calculatePf();
		obj.calculateSalary();
		obj.salarySlip();
	}}
