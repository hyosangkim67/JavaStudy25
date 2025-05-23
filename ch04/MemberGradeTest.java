package ch04;

import java.util.Scanner;

public class MemberGradeTest {

	public static void main(String[] args) {
		// enum을 사용하여 회원 등급을 결정한다
		Scanner input = new Scanner(System.in);

		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		MemberGrade[] grades = null;

		System.out.println("몇 명의 회원을 등록 하시겠어요?");
		System.out.print(">>>");
		int count = input.nextInt();
		names = new String[count];
		ids = new String[count];
		pws = new String[count];
		grades = new MemberGrade[count];

		System.out.println("회원 가입을 시작합니다!");
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 >>>");
			names[i] = input.next();
			System.out.print("id를 입력해 주세요! >>>");
			ids[i] = input.next();
			System.out.println("pw를 입력해 주세요! >>>");
			pws[i] = input.next();

			System.out.println("등급을 선택하세요!");
			System.out.println("1. GUEST");
			System.out.println("2. USER");
			System.out.println("3. MANAGER");
			System.out.println("4. ADMIN");
			System.out.println(">>>");
			String grade = input.next();
			switch (grade) {
			case "1":
				grades[i] = MemberGrade.GUEST;
				System.out.println("손님 등급입니다.");
				break;
			case "2":
				grades[i] = MemberGrade.USER;
				System.out.println("유저 등급입니다.");
				break;
			case "3":
				grades[i] = MemberGrade.MANAGER;
				System.out.println("관리자 등급입니다.");
				break;

			case "4":
				grades[i] = MemberGrade.ADMIN;
				System.out.println("최고 관리자 등급입니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;

			} // switch

			System.out.println(names[i] + "님 " + grades[i] + "로 가입되었습니다!");
		} // for

		System.out.println("현재 가입 내용입니다!");
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 : " + names[i]);
			System.out.print("id : " + ids[i]);
			System.out.println("암호 : " + pws[i]);
			System.out.println("등급 : " + grades[i]);
		}
	}
}
