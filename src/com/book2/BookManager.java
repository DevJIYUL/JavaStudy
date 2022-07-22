package com.book2;

public class BookManager {
	private static int MAX_SIZE =100;
	private Book[] books = new Book[MAX_SIZE];
	private int size=0;
	
	private static BookManager instance;
	private BookManager() {
		books= new Book[MAX_SIZE];
	}
	public static BookManager getInstance() {
		if (instance == null) {
			instance = new BookManager();
		}
		return instance;
	}
	// 1.도서 추가
	public boolean add(Book book) {
		if (size < 100) {
			books[size++] = book;
			return true;
		}
		return false;
			
	
	}
	// 2.도서 삭제:삭제할 도서를 찾은 경우 해당 도서 위치에 저장된 제일 마지막 도서를 옮겨 놓음
	public boolean remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				books[i] = books[size-1];
				books[size-1] = null;
				size += -1;
				return true;
			}
		}
		return false;
	}
	// 3.isbn기준 검색
	public Book findByIsbn(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				return books[i];
			}
		}
		return null;
	}
	// 4.제목기준 검색  : 제목을 포함하는 경우 검색
	public Book[] findByTitle(String title) {
		Book[] temp = new Book[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if(books[i].getTitle().contains(title)) {
				temp[index++] = books[i];
			}
		}
		return temp;
	}
	// 5.잡지 검색
	public Book[] getMagazines() {
		Book[] magazine = new Book[size];
		int magaindex = 0;
		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine ) {
				magazine[magaindex++] = books[i];
			}
		}
		return magazine;
	}
	// 6.소설책 검색
	public Book[] getNovels() {
		Book[] novel = new Book[size];
		int novelindex = 0;
		for (int i = 0; i < size; i++) {
			if(books[i] instanceof Novel) {
				novel[novelindex++] = books[i];
			}
		}
		return novel;
	}
	// 7.저장된 모든 책 가격의 합
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += books[i].getPrice();
		}
		return sum;
	}
	// 8.저장된 모든 책 가격의 평균
	public double getPriceAverage() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += books[i].getPrice();
		}
		return sum/size;
	}
}
