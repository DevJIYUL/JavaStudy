package com.member;
// ȸ�� ���� Ŭ����(ȸ�� ���,ȸ�� ����, ȸ�� �˻�...)
public class MemberManager {
	
	// ȸ�� ������ ������ �迭
	Member[] members;
	
	// �ִ� ȸ�� ��
	int max = 10;
	// ȸ�� �߰��� ���� �ε���
	int index = 0;
	// ����Ǿ� �ִ� ȸ����
	int cnt;
	// ������
	public MemberManager() {
		members = new Member[max];
	}
	// ȸ�� �߰�
	boolean addMember(Member m) {
		if (cnt < max) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] == null) {
					members[i] = m;
					cnt++;
					return true;
				}
			}			
		}
		return false;
		
		
	}
	// ȸ�� ����
	void deleteMember(int num) {
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNum() == num) {
				members[i] = members[cnt-1];
				members[cnt-1] = null;
				--cnt;
				break;
			}
		}
	}
	// ��� ȸ�� ����
	// �ο� �� Ȯ�� -> �迭�� �־��ֱ�
	Member[] getMembers(){
		Member[] tmp = new Member[cnt];
		int idx = 0;
		for (Member member : members) {
			if (member != null) {
				tmp[idx++] = member;
			}else {
				break;
			}
		}
		
		
		return tmp;
	}
	// ȸ���˻�
	Member findByNum(int num){
		for (Member m : members) {
			if (m == null) {
				break;
			}
			if (m.getNum() == num) {
				if (m == null) continue;
				return m;
				
			}
		}
		return null;
	}
	Member[] findByname(String name) {
		Member[] tmp = new Member[max];
		int index = 0;
		for (Member m : members) {
			if (m == null) {
				return tmp;
			}
			if (m.getName().equals(name)) {
				tmp[index++] = m;
			}
		}
		return null;
	}
	Member updateAddress(int num,String addre) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				break;
			}
			if (members[i].getNum() == num) {
				members[i].setAddress(addre);
				return members[i];
			}
		}
		return null;
	}
}
