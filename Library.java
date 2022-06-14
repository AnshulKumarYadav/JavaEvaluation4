package com.eval4;
import java.util.List;
import java.util.ArrayList;
public class Library {
	List<Book> bookList = new ArrayList<>();
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added successfully");
	}
	public boolean isEmpty() {
			if(bookList.size()==0)
			{
				return true;
			}
			else {
				return false;
			}
	}
	public List<Book> viewAllBooks(){
		return bookList;
	}
	public  List<Book> viewBooksByAuthor(String author ){
		List<Book> listofBook = new ArrayList<>();
		for(Book b: bookList)
		{
			if(b.getAuthor().equals(author))
			{
				listofBook.add(b);
			}
		}
		return listofBook;
	}
	public int countNoOfBook(String bookName) {
		int count = 0;
		for(Book b: bookList)
		{
		if(b.getBookName().equals(bookName))
		{
			count++;
		}
		}
		return count;
	}
}
