package ch04;

import java.util.Scanner;

public class Member {
	public int mno;
	public String id;
	public String pw;
	public String name;
	public MemberGrade grade;

	public Member() {
	}

	public Member memberAdd(Scanner input) {
		Member member = new Member();

		System.out.println("회원가입용 메서드입니다.");
		System.out.print("회원번호 >>> ");
		member.mno = input.nextInt();
		input.nextLine();

		System.out.print("이름 >>> ");
		member.name = input.nextLine();

		System.out.print("ID >>> ");
		member.id = input.next();

		System.out.print("PW >>> ");
		member.pw = input.next();

		System.out.println("등급을 선택하세요!");
		System.out.println("1. GUEST | 2. USER | 3. MANAGER | 4. ADMIN");
		System.out.print(">>> ");
		String gradeInput = input.next();

		switch (gradeInput) {
		case "1":
			member.grade = MemberGrade.GUEST;
			break;
		case "2":
			member.grade = MemberGrade.USER;
			break;
		case "3":
			member.grade = MemberGrade.MANAGER;
			break;
		case "4":
			member.grade = MemberGrade.ADMIN;
			break;
		default:
			System.out.println("잘못 입력하여 GUEST로 설정됩니다.");
			member.grade = MemberGrade.GUEST;
		}

		return member;
	}

	@Override
	public String toString() {
		return "회원번호: " + mno + ", 이름: " + name + ", ID: " + id + ", PW: " + pw + ", 등급: " + grade;
	}
}
