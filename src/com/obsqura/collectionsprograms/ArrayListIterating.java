package com.obsqura.collectionsprograms;

import java.util.ArrayList;

public class ArrayListIterating {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("orange");
		arr.add("yellow");
		arr.add("purple");
		arr.add("black");
		for(int i = 0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		// TODO Auto-generated method stub
	}
}
