package com.sneha.ratingsdataservice.models;

public class Rating {

	private String bookid;
	private int rating;
	
	public Rating(String bookid, int rating) {
		super();
		this.bookid = bookid;
		this.rating = rating;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
}
