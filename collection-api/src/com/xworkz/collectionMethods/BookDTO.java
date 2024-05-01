package com.xworkz.collectionMethods;

import java.io.Serializable;

public class BookDTO implements Serializable ,Comparable<BookDTO>
{
	private static final long serialVersionUID = 1L;

		//fields
	 private String bookName;
	 private short noOfPages;
	 private String author;
	 private int price;
	 private short publishedYear;
	 private String publisher;
	 private String type;


	public  BookDTO() 
	{

	System.out.println("no arg constructor");

	}

	public BookDTO(String bookName,short noOfPages,String author,int price,short publishedYear,String publisher,String type)  // parameter is a declaration of variables within the method braces
	{
		    this.bookName=bookName; 
			this.noOfPages=noOfPages;
			this.author=author;
			this.price=price;
			this.publishedYear=publishedYear;
			this.publisher=publisher;
			this.type=type;
			
	}

	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public short getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(short noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public short getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(short publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BookDTO [bookName=" + bookName + ", noOfPages=" + noOfPages + ", author=" + author + ", price=" + price
				+ ", publishedYear=" + publishedYear + ", publisher=" + publisher + ", type=" + type + "]";
	}
	
	

	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			
			if(obj instanceof BookDTO)
			{
				BookDTO a=(BookDTO)obj;
			
				return this.getPublisher().equalsIgnoreCase(a.getPublisher()) && this.getNoOfPages()==a.getNoOfPages();
			}
		}

		return false ;
	}
	@Override
	public int compareTo(BookDTO o) 
	{
		
		return this.getBookName().compareToIgnoreCase(o.bookName);
	}

}
