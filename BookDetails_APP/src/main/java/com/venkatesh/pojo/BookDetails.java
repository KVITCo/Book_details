package com.venkatesh.pojo;




public class BookDetails {
	
	private String bookName;
	private double bookPrice;
	private String author;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookDetails [bookName=" + bookName + ", bookprice=" + bookPrice + ", author=" + author + "]";
	}
	
	
	
	
	

}
