package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CarTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Car c = new Car(1234,"solid pro","Bazzi");
		
		// file 저장
		FileOutputStream fos = new FileOutputStream("car.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//process stream
		oos.writeObject(c);//객체가 파일에 저장이 됨.
		
		System.out.println("saved...");
		
		FileInputStream fis = new FileInputStream("car.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);//process stream
		c = (Car)ois.readObject();//객체가 파일에 저장이 됨.
		System.out.println(c.getNum());
		System.out.println(c.getModel());
	}

}
