package com.obsqura.interfaceprograms;

public class Rectangle implements Polygon{

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.getArea(12, 19);
		// TODO Auto-generated method stub
	}

	@Override
	public void getArea(int length, int breadth) {
		int area = length*breadth;
		System.out.println("The area of the rectangle with length = "+length+" and breadth = "+breadth+" is: "+area);
				// TODO Auto-generated method stub
			}
}
