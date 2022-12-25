package com.obsqura.inheritanceprograms;

public class OnSeason {
	public double bill = 4885.98;
	private double discount_onseason = 40/100d;
	public double discount() {
		double final_price = bill*discount_onseason;
		return final_price;
	}
	
	public static void main(String[] args) {
		OnSeason os = new OnSeason();
		System.out.println("The final amount during onseason is: ");
		System.out.println(os.discount());
		// TODO Auto-generated method stub

	}

}
