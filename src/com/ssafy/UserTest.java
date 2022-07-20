package com.ssafy;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		// ����� ��ü�� ��� ���� �̸��� ���� ���� �����ϴ� ��� setter �޼ҵ带 ����Ͽ� �� ����
		User user1 = new User("user1", "user1", "�����", "ssafy1@ssafy.com", 38);
		// user1._____("user1");
		// user1._____("user1");
		// user1._______("�����");
		// user1._______("ssafy1@ssafy.com");
		// user1._____(27);

		User user2 = new User("user2", "user2", "�ڽ���", "ssafy2@ssafy.com", 28);
		
		UserManager um = new UserManager();
		
		um.add(user1);
		um.add(user2);
		
		// toString �� ���� ��ϵ� ����� ����Ʈ ���
		User[] geli = um.getList();
		for (User user : geli) {
			if(user == null) break;
			System.out.println(user);
		}
		
		// "�����" ��� �̸��� ���� ����ڰ� ������ ã�Ƽ� ���
		
		System.out.println(um.searchByName("�����"));
		
		// ��ϵ� ����� �� ��� ( size �� private �̹Ƿ� ��� x )
		System.out.println(um.getList().length);
		
	}

}