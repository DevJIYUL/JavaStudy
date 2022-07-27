package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLambda {

	public static void main(String[] args) {
		List<Integer> score =new ArrayList<>(Arrays.asList(7,22,45,84,83,73,32,12,14,33,15,46));
		score.removeIf(nums->nums%2==0||nums%3==0);
		System.out.println(score);
		
		score.replaceAll(nums->nums*10);
		System.out.println(score);
		ArrayList<String> list = new ArrayList<String>();
		list.add("tommy");
		list.add("bill");
		list.add("jack");
		list.add("rauran");
		list.add("tommy");
		list.add("kim");
		// 리스트 안의 내용물에 대해 조건을 체크한 후 조건에 맞으면 삭제해 줌
		list.removeIf(name -> name.contains("a"));
		System.out.println(list);
		
		list.replaceAll(name -> name + " gogo!!");
		System.out.println(list);
		
		
	}

}
