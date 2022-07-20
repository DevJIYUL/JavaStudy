package com.object;

public class StringTest {

	public static void main(String[] args) {
		System.out.println();
		String s = "mylimeorange";
		String t = new String("mylimeorange");
		String x = "mylimeorange";
		if (s==t) {
			System.out.println("s == t ¿‘¥œ¥Ÿ." );
		}
		if (s.equals(t)) {
			System.out.println("s.equals(t)");
		}
		if (s==x) {
			System.out.println("s==x");
		}

		String b = s.concat("aaa");
		System.out.println(s);
		System.out.println(b);
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		System.out.println(sb.toString());
	}

}
