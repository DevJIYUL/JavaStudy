package com.inter;

public class IshapeUser {
	public static void main(String[] args) {
		Ishape[] is = new Ishape[3];
		is[0] = new Icircle(2);
		is[1] = new Irect(23,89);
		is[2] = new Irect(20,5);
		
		for(Ishape i : is) {
			System.out.println(i.getClass().getName());
			System.out.println("면적 : " + i.getArea());
			System.out.println("둘레 : " + i.getCircum());
			System.out.println();
		}
	}
}
