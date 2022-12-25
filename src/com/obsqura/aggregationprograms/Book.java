package com.obsqura.aggregationprograms;

public class Book {
	String book_name;
	int book_price;
	Author author;
	public Book(String book_name,int book_price,Author author) {
		this.book_name=book_name;
		this.book_price=book_price;
		this.author=author;
	}
	public void display() {
		System.out.println(book_name+" : "+book_price);
		System.out.println(author.author_name+" - "+author.age+" , "+author.place);
		}
	public static void main(String[] args) {
		Author a1 = new Author("Sally Rooney",34,"Canada");
		Book b1 = new Book("Normal People",399,a1);
		b1.display();
		
		Author a2 = new Author("Sidney Sheldon",67,"UK");
		Book b2 = new Book("If Tomorrow Comes",450,a2);
		b2.display();
		
		Author a3 = new Author("George Orwell",88,"UK");
		Book b3 = new Book("Animal Farm",500,a3);
		b3.display();
		}
	}
