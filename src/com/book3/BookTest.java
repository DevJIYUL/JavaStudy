package com.book3;

import java.util.ArrayList;

import com.exception.DuplicatedISBNException;
import com.exception.NoResultException;
import com.exception.NoSuchBookException;

public class BookTest {

	public static void main(String[] args) {
//		Book b1 = new Book("21424","Java pro","���ϳ�","jaen.kr",15000,"Java �⺻ ����");
//		Book b2 = new Book("21425","Java pro2","���ϳ�","jaen.kr",25000,"Java ����");
//		Book b3 = new Book("35355","�м�����","�ҳ���","jaen.kr",30000,"SW �𵨸�");
		Book b4 = new Magazine("45234", "TIME", "JIM CARRY", "TIME.KR", 2000, "WORLD ISSUE", 2022, 4);
		Book b5 = new Magazine("34985", "Victory secret", "WEEKEND.KR", "WEEK", 1000, "FASHION MAGAZINE", 2022, 5);
		Book b6 = new Magazine("56218", "FOX", "CONAN", "FOR.KR", 4000, "COMEDY", 2021, 4);
		Book b7 = new Novel("65218", "FOX_SECRET", "MONET", "MONET.KR", 8000, "ANIMAL","INFOMATION");
		Book b8 = new Novel("79218", "OLD MAN AND OCEAN", "FRANCESS", "OCEAN.KR", 10000, "SURVIVE","HORROR");
		BookManager bm = BookManager.getInstance();
		addException(bm,b4);
		addException(bm, b5);
		addException(bm, b6);
		addException(bm, b7);
		addException(bm, b8);
//		System.out.println(bm);
		String removebn = "45234";
		System.out.println("**************************remove book : "+ removebn +" **************************");
		removeException(bm,removebn);
		;
		String findIsbn = "3498500";
		System.out.println("**************************search :"+findIsbn+"**************************");
		findByIsbnException(bm,findIsbn);
		String findByTitle = "FOXㅌㅌ";
		System.out.println("**************************search title "+findByTitle+" **************************");
		findByTitleException(bm,findByTitle);
		System.out.println("************************** MAGAZINE **************************");
		
		try {
			System.out.println(bm.getMagazines());
		} catch (NoResultException e) {
			System.out.println("Magazines 도서는 존재하지 않습니다.");
			e.printStackTrace();
		}
		System.out.println("**************************NOVEL **************************");
		try {
			for (Novel nov : bm.getNovels()) {
				System.out.println(nov);
			}
		} catch (NoResultException e) {
			System.out.println("Novels 도서는 존재하지 않습니다.");
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("**************************total price : "+bm.getTotalPrice()+"**************************");
		System.out.println("**************************total price avg : "+bm.getPriceAverage()+"**************************");
		int year = 2022;
		System.out.println("************* magazine year"+year+" search*****************");
		ArrayList<Magazine> temp;
		try {
			temp = bm.findMagazineByYear(year);
			for (Magazine m : temp) {
				System.out.println(m.toString());
			}
		} catch (NoResultException e) {
			System.out.println("해당 "+year+"년도의 도서가 존재하지 않습니다.");
			e.printStackTrace();
		} 
		int price1 = 2000;
		int price2 = 8000;
		System.out.println("************* price between "+price1+" and "+price2+" *****************");
		for (Book b : bm.findByPrice(price1, price2)) {
			System.out.println(b);
		}
		String pub = "MONET.KR";
		System.out.println("************************ publisher : "+pub+" ************************");
		for (Book b : bm.findByPublisher(pub)) {
			System.out.println(b);
		}
	}

	private static void findByTitleException(BookManager bm, String findByTitle) {
		try {
			System.out.println(bm.findByTitle(findByTitle));
		} catch (NoResultException e) {
//			System.out.println("찾으시려는 제목 "+findByTitle+" 의 도서가 존재하지 않습니다.");
			e.printStackTrace();
		}

		
	}

	private static void findByIsbnException(BookManager bm, String findIsbn) {
		try {
			System.out.println(bm.findByIsbn(findIsbn));
		} catch (NoSuchBookException e) {
//			System.out.println("찾으실려는 "+findIsbn+"의 도서가 존재하지 않습니다.");
			e.printStackTrace();
		}
		
	}

	private static void removeException(BookManager bm, String removebn) {
		try {
			bm.remove(removebn);
		} catch (NoSuchBookException e) {
			System.out.println("지울려는 도서 "+removebn+"가 없습니다.");
			e.printStackTrace();
		}
		
	}

	private static void addException(BookManager bm, Book b) {
		try {
			bm.add(b);
		} catch (DuplicatedISBNException e) {
			System.out.println("이미 등록된 책입니다.");
			e.printStackTrace();
		}
		
	}


}
