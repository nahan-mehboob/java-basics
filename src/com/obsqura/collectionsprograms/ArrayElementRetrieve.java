package com.obsqura.collectionsprograms;

import java.util.ArrayList;

public class ArrayElementRetrieve {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("orange");
		arr.add("yellow");
		arr.add("purple");
		arr.add("black");
		System.out.println("Lets retrieve some elements!");
		System.out.println("The first element in this list is: "+arr.get(0));
		System.out.println("The second element in this list is: "+arr.get(1));
		System.out.println("The third element in this list is: "+arr.get(2));
		System.out.println("The fourth element in this list is: "+arr.get(3));
		// TODO Auto-generated method stub
	}
}
