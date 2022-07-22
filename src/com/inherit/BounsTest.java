package com.inherit;

public class BounsTest {
	void printBouns(Employee who) {
		System.out.println(who.getBouns());
	}
	public static void main(String[] args) {
		BounsTest bt = new BounsTest();
		Employee tom = new Employee(100, "tom", 3000);
		bt.printBouns(tom);
		
		Manager bill = new Manager(200, "bill", 5000, 111);
		bt.printBouns(bill);
	}

}
