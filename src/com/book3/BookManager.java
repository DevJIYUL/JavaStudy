package com.book3;

import java.util.ArrayList;

import com.exception.DuplicatedISBNException;
import com.exception.NoResultException;
import com.exception.NoSuchBookException;

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
	public void add(Book book) throws DuplicatedISBNException{
		booklist.add(book);
	}
	// 2.book remove
	public void remove(String isbn) throws NoSuchBookException {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getIsbn().equals(isbn)) {
				booklist.remove(i);
				System.out.println(isbn+" is removed ");
				break;
			}
		} 
		
	}
	// 3.isbn Search
	public Book findByIsbn(String isbn) throws NoSuchBookException{
		for (int i = 0; i < booklist.size(); i++) {
			Book b = booklist.get(i);
			if (b.getIsbn().equals(isbn)) {			
				return b;
			}
		}
		throw new NoSuchBookException("찾으시려는 제목 "+isbn+" 의 도서가 존재하지 않습니다.");
	}
	// 4.������� �˻�  : ������ �����ϴ� ��� �˻�
	public ArrayList<Book> findByTitle(String title) throws NoResultException{
		ArrayList<Book> temp = new ArrayList<Book>();
		for (int i = 0; i < booklist.size(); i++) {
			Book b = booklist.get(i);
			if(b.getTitle().contains(title)) {
				temp.add(b);
			}
		}
		throw new NoResultException("찾으시려는 제목 "+title+" 의 도서가 존재하지 않습니다.");
	}
	// 5.���� �˻�
	public ArrayList<Magazine> getMagazines() throws NoResultException{
		ArrayList<Magazine> magazine = new ArrayList<Magazine>();
		int magaindex = 0;
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i) instanceof Magazine ) {
				magazine.add((Magazine) booklist.get(i));
			}
		}
		throw new NoResultException();
	}
	// 6.�Ҽ�å �˻�
	public ArrayList<Novel> getNovels() throws NoResultException{
		ArrayList<Novel> novel = new ArrayList<Novel>();
		for (int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i) instanceof Novel) {
				novel.add((Novel) booklist.get(i));
			}
		}
		throw new NoResultException();
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
	public ArrayList<Magazine> findMagazineByYear(int year) throws NoResultException {
		ArrayList<Magazine> maga = new ArrayList<>();
		ArrayList<Magazine> m = this.getMagazines();
		for (int i = 0; i < m.size(); i++) {
			if (m.get(i).getYear() == year) {
				maga.add(m.get(i));
			}
		}
//		System.out.println(maga);
		throw new NoResultException();
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
