package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList(Arrays.asList("joyful", "profession", "jdk", "java"));

		// 1.스트림 사용하지 않은 경우
		long count = 0;
		for (String name : names) {
			if (name.contains("j")) {
				count++;
			}
		}
		System.out.println(count);
		// 2.스트림 사용하는 경우
		count = 0;
		// filter() : 중간연산, count() : 최종연산
		count = names.stream().filter(name -> name.contains("j")).count();
		System.out.println(count);
		System.out.println();
		names.stream().filter(name->name.contains("o")).forEach(x -> System.out.println(x));
		System.out.println();
		//map() : 스트림 내의 요소들을 하나씩 특정값으로 변환해줌
		names.stream().map(x -> x.concat("qq")).forEach(x -> System.out.println(x));
		
		System.out.println();
		
		List<Integer> ilist = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Stream<Integer> ss = ilist.parallelStream().filter(x -> x >3).limit(3);
		ss.forEach(x -> System.out.print(x+" "));
		
	}

}
