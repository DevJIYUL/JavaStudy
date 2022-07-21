package com.book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("21424","Java pro","김하나","jaen.kr",15000,"Java 기본 문법");
		Book b2 = new Book("21425","Java pro2","김하나","jaen.kr",25000,"Java 응용");
		Book b3 = new Book("35355","분석설계","소나무","jaen.kr",30000,"SW 모델링");
		BookManager bm = new BookManager();
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		System.out.println("**************************도서목록**************************");
		Book[] books = bm.getList();
		printBookInfo(books);
		String findIsbn = "21424";
		System.out.println("**************************도서목록:"+findIsbn+"**************************");
		printBookInfo(bm.searchByIsbn(findIsbn));
		String removeIsbn = "21424";
		System.out.println("**************************도서목록:"+removeIsbn+"**************************");
		System.out.println("**************************도서목록**************************");
		printBookInfo(books);
	}
	static void printBookInfo(Book book) {
		Book[] t = new Book[1];
		t[0] = book;
		printBookInfo(t);
	}
	static void printBookInfo(Book[] book) {
		for (Book b : book) {
			if (b == null) {
				break;
			}
			System.out.printf("%-8s | %-10s | %-5s | %-8s | %-8d | %-10s %n",b.isbn,b.title,b.author,b.publisher,b.price,b.desc);
		}
	}
}
