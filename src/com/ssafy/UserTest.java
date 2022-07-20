package com.ssafy;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		// 사용자 객체의 멤버 변수 이름을 통해 직접 접근하는 대신 setter 메소드를 사용하여 값 설정
		User user1 = new User("user1", "user1", "김싸피", "ssafy1@ssafy.com", 38);
		// user1._____("user1");
		// user1._____("user1");
		// user1._______("김싸피");
		// user1._______("ssafy1@ssafy.com");
		// user1._____(27);

		User user2 = new User("user2", "user2", "박싸피", "ssafy2@ssafy.com", 28);
		
		UserManager um = new UserManager();
		
		um.add(user1);
		um.add(user2);
		
		// toString 을 통해 등록된 사용자 리스트 출력
		User[] geli = um.getList();
		for (User user : geli) {
			if(user == null) break;
			System.out.println(user);
		}
		
		// "김싸피" 라는 이름을 가진 사용자가 있으면 찾아서 출력
		
		System.out.println(um.searchByName("김싸피"));
		
		// 등록된 사용자 수 출력 ( size 는 private 이므로 출력 x )
		System.out.println(um.getList().length);
		
	}

}