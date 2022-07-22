package com.member;
// 회원 관리 클래스(회원 등록,회원 삭제, 회원 검색...)
public class MemberManager {
	
	// 회원 정보를 저장할 배열
	Member[] members;
	
	// 최대 회원 수
	int max = 10;
	// 회원 추가를 위한 인덱스
	int index = 0;
	// 저장되어 있는 회원수
	int cnt;
	// 생성자
	public MemberManager() {
		members = new Member[max];
	}
	// 회원 추가
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
	// 회원 삭제
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
	// 모든 회원 정보
	// 인원 수 확인 -> 배열에 넣어주기
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
	// 회원검색
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
