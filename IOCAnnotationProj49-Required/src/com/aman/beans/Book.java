package com.aman.beans;

import org.springframework.beans.factory.annotation.Required;

public class Book {
	
	private int bookid;
	private String bookname;
	private String author;
	
	
	@Required
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	@Required
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + "]";
	}
	
	
	
	

}
