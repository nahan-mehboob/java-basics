package com.obsqura.inheritanceprograms;

public class OffSeason extends OnSeason{
	private double discount_offseason = 15/100d;
	public double discount() {
		double final_price = bill*discount_offseason;
		return final_price;
	}

	public static void main(String[] args) {
		OffSeason os = new OffSeason();
		System.out.println("The final amount during offseason is: ");
		System.out.println(os.discount());
		// TODO Auto-generated method stub
	}
}
