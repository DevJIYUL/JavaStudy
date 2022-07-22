package com.book2;

public class Novel extends Book{
	private String genre;
	
	
	public Novel(String isbn, String title, String author, String publisher, int price, String desc,String genre) {
		super(isbn,title,author,publisher,price,desc);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"genre : "+getGenre()+" ]";
	}
}
