package com.abst;

public class ShapeUser {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Circle(7);
		s[1] = new Rect(5, 6);
		s[2] = new Circle(8);
		for (Shape shape : s) {
			System.out.println("---------"+shape.getClass().getSimpleName()+"---------");
			System.out.println("면적 : "+shape.getArea());
			System.out.println("둘레 : "+shape.getCircum());
		}
	}

}
