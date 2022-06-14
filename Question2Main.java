package com.eval4;

import java.util.Scanner;

public class Question2Main {
	public static void main(String[] args) {
		
		Library library = new Library();
//		Book book = new Book();
	while(true)
	{
		System.out.println("Enter the choice from the following options:");
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Count Number of books- by book name");
		System.out.println("5.Exit");
		
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter the isbn no:");
			int isbn = sc.nextInt();
			System.out.println("Enter the book name:");
			String bookName= sc.next();
			System.out.println("Enter the author name:");
			String authorString = sc.next();
			library.addBook(new Book(isbn, bookName, authorString));
		}
		else if(choice==2)
		{
			System.out.println(library.viewAllBooks());
		}
		else if(choice ==3)
		{
			System.out.println("Enter the author name:");
			String authorString = sc.next();
			System.out.println(library.viewBooksByAuthor(authorString));
		}
		else if(choice==4)
		{
			System.out.println("Enter the book name:");
			String bookName= sc.next();
			System.out.println(library.countNoOfBook(bookName));
		}
		else {
			System.out.println("Thank You!");
			break;
		}
	}
	}
}


//1.Add Book
//2.Display all book details
//3.Search Book by author
//4.Count number of books - by book name
//5.Exit
//Enter your choice:
//1
//Enter the isbn no:
//123
//Enter the book name:
//Java
//Enter the author name:
//Bruce Eckel
