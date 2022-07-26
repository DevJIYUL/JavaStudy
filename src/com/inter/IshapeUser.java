package com.inter;

public class IShapeUser {
	public static void main(String[] args) {
		IShape[] is = new IShape[3];
		is[0] = new ICircle(2);
		is[1] = new IRect(23,89);
		is[2] = new IRect(20,5);
		
		for(IShape i : is) {
			System.out.println(i.getClass().getName());
			System.out.println("면적 : " + i.getArea());
			System.out.println("둘레 : " + i.getCircum());
			System.out.println();
		}
	}
}
