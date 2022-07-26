package com.inter;

public interface Sandwich {
	int getCalorie(); // sandwich 칼로리
	String getIngredient();// sandwich 재료
	String getDescription();// sandwich 설명 

	default void info() {
		System.out.println("cal : "+getCalorie());
		System.out.println("ingredient : "+getIngredient());
		System.out.println("desc : "+getDescription());
	}
}
