package com.venkatesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK_DTL")
public class BookDetailsEntity {
	
	@Id
    @GeneratedValue
    @Column(name="BOOK_ID")
	private int id;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="BOOK_PRICE")
	private double bookPrice;
	
	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Column(name="AUTHOR_NAME")
	private String author;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookDetailsEntity [id=" + id + ", bookName=" + bookName + ", bookprice=" + bookPrice + ", author="
				+ author + "]";
	}
	
	
	
}
