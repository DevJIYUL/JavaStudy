package com.book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("21424","Java pro","���ϳ�","jaen.kr",15000,"Java �⺻ ����");
		Book b2 = new Book("21425","Java pro2","���ϳ�","jaen.kr",25000,"Java ����");
		Book b3 = new Book("35355","�м�����","�ҳ���","jaen.kr",30000,"SW �𵨸�");
		Book b4 = new Magazine("45234", "TIME", "JIM CARRY", "TIME", 2000, "WORLD ISSUE", 2022, 4);
		BookManager bm = new BookManager();
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(b4);
		System.out.println("**************************�������**************************");
		Book[] books = bm.getList();
		printBookInfo(books);
		String findIsbn = "21424";
		System.out.println("**************************�������:"+findIsbn+"**************************");
		printBookInfo(bm.searchByIsbn(findIsbn));
		String removeIsbn = "21424";
		System.out.println("**************************�������:"+removeIsbn+"**************************");
		System.out.println("**************************�������**************************");
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
			System.out.printf("%-8s | %-10s | %-5s | %-8s | %-8d | %-10s %n",b.getIsbn(),b.getTitle(),b.getAuthor(),b.getPublisher(),b.getPrice(),b.getDesc());
		}
	}
}
