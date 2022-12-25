package com.obsqura.aggregationprograms;

public class LineItem {
	int quantity;
	Product product;
	public LineItem(int quantity,Product product) {
		this.quantity=quantity;
		this.product=product;
	}
	public void display() {
		System.out.println(product.product_name+": "+product.product_id+" ; "+quantity+"no's");
		System.out.println("Description: "+product.product_descrptn);
	}

	public static void main(String[] args) {
		Product p1 = new Product("Utensils",9999,"Kitchen Appliances");
		LineItem li1 = new LineItem(200,p1);
		li1.display();
		
		Product p2 = new Product("Notebooks",9801,"Stationary");
		LineItem li2 = new LineItem(350,p2);
		li2.display();
		
		Product p3 = new Product("Refrigerator",8546,"Home Appliances");
		LineItem li3 = new LineItem(150,p3);
		li3.display();
		
		Product p4 = new Product("Mineral Water",9749,"Food and Bevarages");
		LineItem li4 = new LineItem(500,p4);
		li4.display();
		// TODO Auto-generated method stub
	}
}
