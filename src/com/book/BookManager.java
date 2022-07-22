package com.book;

public class BookManager {
	static int MAX_SIZE =100;
	Book[] books = new Book[MAX_SIZE];
	int size = 0;
	public void add(Book book) {
		if (size < MAX_SIZE) {
			books[size++] = book;
		}else {
			System.out.println("도서 목록 100권이 넘었습니다.");
		}
	}
	public void remove(String isbn) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = books[size-1];
				books[size-1] = null;
				size--;
			}
		}
	}
	public Book[] getList() {
		return books;
	}
	public Book searchByIsbn(String isbn) {
		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				return b;
			}
		}
		return null;
	}
}
