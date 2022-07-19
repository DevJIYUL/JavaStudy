package com.object;

public class Rect {
	int width,height;
	
	public int getArea() {
		return 4*width;
	}
	public int getCircum() {
		return width * height;
	}
	public static void main(String[] args) {
		Rect r = new Rect();
		r.height = 3;
		r.width = 5;
		System.out.println(r.getArea());
		System.out.println(r.getCircum());
		

	}

}
