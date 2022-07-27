package com.book3;

import java.util.ArrayList;

import com.exception.DuplicatedISBNException;
import com.exception.NoResultException;
import com.exception.NoSuchBookException;

// Book을 관리하기 위해 필요한 메소드가 표시된 인터페이스
public interface IBookManager {
	
	void add(Book book) throws DuplicatedISBNException; // add // DuplicatedISBNException // 중복
	void remove(String isbn) throws NoSuchBookException ; // remove // NoSuchBookException
	Book findByIsbn(String isbn) throws NoSuchBookException; // search // NoSuchBookException
	ArrayList<Book> findByTitle(String title) throws NoResultException; // NoResultException
	ArrayList<Magazine> getMagazines() throws NoResultException;// NoResultException
	ArrayList<Novel> getNovels() throws NoResultException;// NoResultException
	int getTotalPrice();
	double getPriceAverage();
	
	ArrayList<Magazine> findMagazineByYear(int year) throws NoResultException;// NoResultException
	ArrayList<Book> findByPrice(int price1,int price2) throws NoResultException;// NoResultException
	ArrayList<Book> findByPublisher(String publisher) throws NoResultException;// NoResultException
	
}
