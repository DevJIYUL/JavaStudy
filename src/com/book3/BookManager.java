package com.book3;

import java.util.ArrayList;

/**  도서 리스트를 ArrayList로 유지하며 관리하는 클래스 :**/
public class BookManager implements IBookManager{
	
	private ArrayList<Book> booklist;
//	private int size=0;
	
	private static BookManager instance;
	private BookManager() {
		booklist = new ArrayList<>();
	}
	public static BookManager getInstance() {
		if (instance == null) {
			instance = new BookManager();
		}
		return instance;
	}
	// 1.book add
	public void add(Book book) {
		booklist.add(book);

	}
	// 2.book remove
	public void remove(String isbn) {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getIsbn().equals(isbn)) {
				booklist.remove(i);
				System.out.println(isbn+" is removed ");
				break;
			}
		} 
		
	}
	// 3.isbn Search
	public Book findByIsbn(String isbn) {
		for (int i = 0; i < booklist.size(); i++) {
			Book b = booklist.get(i);
			if (b.getIsbn().equals(isbn)) {			
				return b;
			}
		}
		return null;
	}
	// 4.������� �˻�  : ������ �����ϴ� ��� �˻�
	public ArrayList<Book> findByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (int i = 0; i < booklist.size(); i++) {
			Book b = booklist.get(i);
			if(b.getTitle().contains(title)) {
				temp.add(b) ;
			}
		}
		return temp;
	}
	// 5.���� �˻�
	public ArrayList<Magazine> getMagazines() {
		ArrayList<Magazine> magazine = new ArrayList<Magazine>();
		int magaindex = 0;
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i) instanceof Magazine ) {
				magazine.add((Magazine) booklist.get(i));
			}
		}
		return magazine;
	}
	// 6.�Ҽ�å �˻�
	public ArrayList<Novel> getNovels() {
		ArrayList<Novel> novel = new ArrayList<Novel>();
		for (int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i) instanceof Novel) {
				novel.add((Novel) booklist.get(i));
			}
		}
		return novel;
	}
	// 7.����� ��� å ������ ��
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < booklist.size(); i++) {
			sum += booklist.get(i).getPrice();
		}
		return sum;
	}
	// 8.����� ��� å ������ ���
	public double getPriceAverage() {
		double sum = 0;
		for (int i = 0; i < booklist.size(); i++) {
			sum += booklist.get(i).getPrice();
		}
		return sum/booklist.size();
	}
	@Override
	public ArrayList<Magazine> findMagazineByYear(int year) {
		ArrayList<Magazine> maga = new ArrayList<>();
		ArrayList<Magazine> m = this.getMagazines();
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).getYear() == year) {
				maga.add(m.get(i));
			}
		}
		System.out.println(maga);
		return maga;
	}
	@Override
	public ArrayList<Book> findByPrice(int price1, int price2) {
		ArrayList<Book> pr = new ArrayList<Book>();
		for (int i = 0; i < booklist.size(); i++) {
			if (price1 < booklist.get(i).getPrice() && booklist.get(i).getPrice() < price2) {
				pr.add(booklist.get(i));
			}
		}
		return pr;
	}
	@Override
	public ArrayList<Book> findByPublisher(String publisher) {
		ArrayList<Book> pub = new ArrayList<Book>();
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getPublisher().equals(publisher)) {
				pub.add(booklist.get(i));
			}
		}
		return pub;

	}
}
