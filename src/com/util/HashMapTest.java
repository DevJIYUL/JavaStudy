package com.util;

import java.util.HashMap;
import java.util.Set;

//map : ( key , value )의 쌍으로 이루어진 자료구조, key는 중복되면 안된다.
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map  = new HashMap<String, String>();
		map.put("num", "123");
		map.put("name", "harry poffer");
		map.put("address", "korea");
		// 같은 키에 덮어 쓰기 가능하다.
		map.put("name", "jaen");

		Set<String> keys = map.keySet();
		for (String str : keys) {
			System.out.println(str +" : "+map.get(str));
		}
	}
}
