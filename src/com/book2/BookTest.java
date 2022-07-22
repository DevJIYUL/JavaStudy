package com.book2;

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
		
		addInfo(bm.add(b4));
		addInfo(bm.add(b5));
		addInfo(bm.add(b6));
		addInfo(bm.add(b7));
		addInfo(bm.add(b8));
		String removebn = "45234";
		System.out.println("**************************���� "+ removebn +" ����**************************");
		removeinfo(bm.remove(removebn));
		String findIsbn = "34985";
		System.out.println("**************************�������:"+findIsbn+"**************************");
		printBookInfo(bm.findByIsbn(findIsbn));
		String findByTitle = "FOX";
		System.out.println("**************************���� ���� "+findByTitle+"�� ���� ��� **************************");
		printBookInfo(bm.findByTitle(findByTitle));
		System.out.println("**************************���� MAGAZINE ���**************************");
		printBookInfo(bm.getMagazines());
		System.out.println("**************************���� NOVEL ���**************************");
		printBookInfo(bm.getNovels());
		System.out.println("**************************�� ������ ����"+bm.getTotalPrice()+"**************************");
		System.out.println("**************************�� ������ ����"+bm.getPriceAverage()+"**************************");
	}

	static void addInfo(Boolean flag) {
		if (flag) {
			System.out.println("������ �߰��Ǿ����ϴ�");
		}else {
			System.out.println("���� 100���� �Ѿ����ϴ�.");
		}
	}
	static void removeinfo(Boolean flag) {
		if(flag) {
			System.out.println("�ش� ������ �����Ǿ����ϴ�");
		}else {
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
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
			if (b instanceof Magazine) {
				System.out.printf("%-8s | %-10s | %-5s | %-8s | %-8d | %-10s | %-4d | %-2d  %n",b.getIsbn(),b.getTitle(),b.getAuthor(),b.getPublisher(),b.getPrice(),b.getDesc(),((Magazine) b).getYear(),((Magazine) b).getMonth());
			}else if (b instanceof Novel) {
				System.out.printf("%-8s | %-10s | %-5s | %-8s | %-8d | %-10s | %-10s %n",b.getIsbn(),b.getTitle(),b.getAuthor(),b.getPublisher(),b.getPrice(),b.getDesc(),((Novel) b).getGenre());
			}
		}
	}
}
