package com.obsqura.inheritanceprograms;
import java.util.Scanner;

public class BasicPayDeductionBonus {
	Scanner sc = new Scanner(System.in);
	static double basic_pay;
	static double deduction;
	static double bonus;
	public BasicPayDeductionBonus(double basic_pay, double deduction, double bonus) {
		System.out.println("Enter the basic pay: ");
		this.basic_pay = sc.nextInt();
		System.out.println("Enter the deducted amount: ");
		this.deduction= sc.nextInt();
		System.out.println("Enter the bonus amount: ");
		this.bonus = sc.nextInt();
		}
}
