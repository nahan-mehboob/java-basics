package com.obsqura.inheritanceprograms;

public class SquareAreaPerimeter extends RectangleAreaPerimeter {
	
	public SquareAreaPerimeter() {
		super(length, breadth);
		}
	
	public int findArea() {
		int area = length*2;
		System.out.println("The area of Square will be: "+area);
		return area;
	}
	
	public int findPerimeter() {
		int perimeter = 4*length;
		System.out.println("The perimeter of Square will be: "+perimeter);
		return perimeter;
	}

	public static void main(String[] args) {
		RectangleAreaPerimeter obj1 = new RectangleAreaPerimeter(12,8);
		obj1.findArea();
		obj1.findPerimeter();
		
		SquareAreaPerimeter obj2 = new SquareAreaPerimeter();
		obj2.findArea();
		obj2.findPerimeter();	
		}}
