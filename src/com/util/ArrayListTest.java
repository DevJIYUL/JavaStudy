package com.util;

import java.util.ArrayList;
// list
import com.abst.Circle;
import com.abst.Rect;
import com.abst.Shape;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Shape> slist = new ArrayList<Shape>();
		slist.add(new Rect(4, 3));
		slist.add(new Circle(6));
		slist.add(new Circle(8));
		
		for (Shape s : slist) {
			System.out.println(s.getClass().getSimpleName());
			System.out.println(s.getArea());
			System.out.println(s.getCircum());
			System.out.println();
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // list.add(new Integer(100)); 와 같다 자동으로 기본형 -> 객체형 해준다.
		list.add(200); // auto-boxing 이 일어난다.
		list.add(300);
		list.add(400);
		System.out.println(list);
//		for (Integer itg : list) {
//			System.out.println(itg);
//		}
	}

}
