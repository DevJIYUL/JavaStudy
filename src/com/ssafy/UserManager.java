package com.ssafy;

public class UserManager {

	private int size = 0;
	
	// �ִ� ����� ����
	private final int MAX_SIZE = 100 ;

	private User[] userList = new User[MAX_SIZE];

	// ����� �߰�
	public void add(User user) {
		
		// �ִ� ����� ������ �������� �ʾ����� ����� �߰�
		if (size < MAX_SIZE) {
			userList[size++] = user;
		} else {
			System.out.println("������ ���� 100�� �Ѿ����ϴ�. ��� �Ұ�.");
		}
	}
	
	// ��ϵ� ����� ����Ʈ ��ȯ
	public User[] getList() {

		return userList;
	}
	
	// ������ name�� ��ġ�ϴ� �̸��� ���� ����� ��ü ��ȯ
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
	}
	
}
