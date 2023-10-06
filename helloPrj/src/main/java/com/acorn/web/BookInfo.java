package com.acorn.web;


public class BookInfo {

	String title;
	String genre;
	String price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public BookInfo(String title, String genre, String price) {
		super();
		this.title = title;
		this.genre = genre;
		this.price = price;
	}
	
	public BookInfo() {
		// TODO Auto-generated constructor stub
	}
}
