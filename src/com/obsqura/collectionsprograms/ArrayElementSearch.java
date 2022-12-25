package com.obsqura.collectionsprograms;

import java.util.ArrayList;

public class ArrayElementSearch {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("orange");
		arr.add("yellow");
		arr.add("purple");
		arr.add("black");
		System.out.println("Lets check whether the following elements are present in arr or not!");
		System.out.println(arr.contains("purple"));
		System.out.println(arr.contains("blue"));
		System.out.println(arr.contains("lavender"));
		System.out.println(arr.contains("orange"));
				// TODO Auto-generated method stub
	}
}
