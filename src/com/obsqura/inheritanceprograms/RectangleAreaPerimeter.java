package com.obsqura.inheritanceprograms;

public class RectangleAreaPerimeter {
	static int length;
	static int breadth;
	public RectangleAreaPerimeter(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int findArea() {
		int area = length*breadth;
		System.out.println("The area of Rectangle will be: "+area);
		return area;
		}
	
	public int findPerimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("The perimeter of Rectangle will be: "+perimeter);
		return perimeter;
		
	}
}
