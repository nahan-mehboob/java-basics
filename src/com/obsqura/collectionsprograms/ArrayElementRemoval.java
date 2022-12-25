package com.obsqura.collectionsprograms;

import java.util.ArrayList;

public class ArrayElementRemoval {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("orange");
		arr.add("yellow");
		arr.add("purple");
		arr.add("black");
		System.out.println("The ArrayList arr: ");
		System.out.println(arr);
		arr.remove(2);
		System.out.println("The ArrayList arr after updation: ");
		System.out.println(arr);
				// TODO Auto-generated method stub
	}
}
