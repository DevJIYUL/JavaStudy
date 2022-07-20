package com.ssafy;

public class UserManager {

	private int size = 0;
	
	// 최대 사용자 개수
	private final int MAX_SIZE = 100 ;

	private User[] userList = new User[MAX_SIZE];

	// 사용자 추가
	public void add(User user) {
		
		// 최대 사용자 개수에 도달하지 않았으면 사용자 추가
		if (size < MAX_SIZE) {
			userList[size++] = user;
		} else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}
	
	// 등록된 사용자 리스트 반환
	public User[] getList() {

		return userList;
	}
	
	// 제공된 name과 일치하는 이름을 가진 사용자 객체 반환
	public User searchByName(String name) {
		
		for (int i = 0; i < userList.length ; i++) {
//			System.out.println(userList[i].name);
			if (userList[i] == null) {
				continue;
			}
			if (name.equals(userList[i].name)) {
				return userList[i];
			}
		}

		return null;    
	System.out.println();
	}
	
}
