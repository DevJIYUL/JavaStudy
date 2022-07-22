package com.member;

// 이름 으로 검색 하는 메소드 : findByname()
// 주소로 검색하는 메소드 : findByname()
// 번호 기준으로 주소를 수정하는 메소드 : updateAddress()
public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager manager = new MemberManager();
		Member m1 = new Member(100,"윌 스미스","seoul",30);
		Member m2 = new Member(200,"코난","paris",40);
		Member m3 = new Member(300,"바이든","seattle",70);
		
		boolean flag = manager.addMember(m1);
		if (!flag) {
			System.out.println("더 이상 추가가 안됩니다.");
		}
		flag = manager.addMember(m2);
		if (!flag) {
			System.out.println("더 이상 추가가 안됩니다.");
		}
		flag = manager.addMember(m3);
		if (!flag) {
			System.out.println("더 이상 추가가 안됩니다.");
		}
		flag = manager.addMember(new Member(555,"jim carry","LA",52));
		if (!flag) {
			System.out.println("더 이상 추가가 안됩니다.");
		}
		System.out.println("추가된 회원들===================================");
		Member[] list = manager.getMembers();
		printMembers(list);
		System.out.println();
//		for (Member member : list) {
//			System.out.println(member);
//		}
		System.out.println("회원 삭제======================================");
		manager.deleteMember(300);
		printMembers(manager.getMembers());
		System.out.println();
		System.out.println("회원 검색======================================");
		Member find;
		find=manager.findByNum(555);
		if (find == null) {
			System.out.println("해당 회원을 찾을수 없습니다");
		}else {
			System.out.println(find);
		}
		System.out.println();
		System.out.println("회원 검색======================================");
		Member[] findbname = manager.findByname("윌 스미스");
		if (findbname == null) {
			System.out.println("해당 회원을 찾을수 없습니다");
		}else {
			for (Member fbn : findbname) {
				if (fbn == null) {
					break;
				}
				System.out.println(fbn);
				
			}
		}
		System.out.println();
		System.out.println("회원 정보 수정검색======================================");
		find = manager.updateAddress(200, "Vancouver");
		if (find == null) {
			System.out.println("해당 회원을 찾을수 없습니다");
		}else {
			System.out.println(find);
		}
	}
	
	static void printMembers(Member[] list) {
		for (Member member : list) {
			System.out.println(member);
		}
	}

}
