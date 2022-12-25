package com.obsqura.encapsulationprograms;

public class User {

	public static void main(String[] args) {
		int pin;
		Bank obj = new Bank();
		pin = obj.setPinnumber(1212);
		if(pin==1212||pin==1234||pin==1001) {
			System.out.println(obj.getPinnumber()+" is a valid pin");	
		}else {
			System.out.println(obj.getPinnumber()+" is not a valid pin");
		}
		// TODO Auto-generated method stub

	}

}