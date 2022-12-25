package com.obsqura.inheritanceprograms;

public class HraAndPf extends BasicPayDeductionBonus {
	double hra;
	double pf;
	
	public HraAndPf(double basic_pay, double deduction, double bonus) {
		super(basic_pay, deduction, bonus);
		// TODO Auto-generated constructor stub
	}

	public void calculateHra() {
		hra = basic_pay*5/100d;
	}
	
	public void calculatePf() {
		pf = basic_pay*20/100d;
	}
}


