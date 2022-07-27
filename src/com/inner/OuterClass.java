package com.inner;
//1.static inner class : can construct inner class without contructor outer class
public class OuterClass { // out class. top-level class
	static int num = 256;
	
	static class Inner{ // inner class
		public void go() {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Inner i = new Inner();
		i.go();
		System.out.println(i.getClass().getSimpleName());
	}

}
