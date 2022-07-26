package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// InterruptedException : Non-Runtime Exception. 반드시 try-catch로 처리해주고 넘어가야한다. 
public class ThreadTest {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e1) {
			System.out.println("Exception!!!");
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // program sleeped 1000 -> 1s
		System.out.println("hello world!");

	}

}
