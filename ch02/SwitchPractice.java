package ch02;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		// Switch <조건 제어문>
		// 조건이 맞으면 case: 에 있는 코드가 실행됨
		// if는 true나 false라는 조건만 있지만,
		// switch문은 여러 가지의 조건을 설정할 수 있다는 차이가 있다.

		// 성적 처리 프로그램을 만들자

		// keypoint
		/*
		 * C 생성 R 읽기 U 수정 D 삭제 이 4가지 요소를 고려해야 한다.
		 * 
		 * 교직원: 학생: 성적: 프로그램 종료:
		 */

		// 메뉴 구현 (알파벳을 눌러서 메뉴로 진입)
		Scanner input = new Scanner(System.in);

		////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////

		System.out.println("========성적처리 프로그램 (switch 버전) ========");
		System.out.println("a. 교직원 관리");
		System.out.println("b. 학생 관리");
		System.out.println("c. 성적 관리");
		System.out.println("z. 프로그램 종료");
		System.out.print("네 가지 알파벳 중 하나를 입력해 주세요. 제일 앞 글자만 적용됩니다.");

		////////////////////////////////////////////////////////////////////

		char select = input.next().charAt(0); // 문자 추출
		System.out.println("선택한 문자: " + select); // 입력 확인
		switch (select) { // select = case?

		////////////////////////////////////////////////////////////////////

		case 'a':
		case 'A':
			System.out.println("교직원 관리 메뉴입니다.");
			System.out.println("1. 교직원 등록");
			System.out.println("2. 교직원 보기");
			System.out.println("3. 교직원 수정");
			System.out.println("4. 교직원 삭제");
			int subSelect = input.nextInt();
			switch (subSelect) {
			case 1:
				System.out.println("교직원 등록입니다.");
				break;
			case 2:
				System.out.println("교직원 보기입니다.");
				break;
			case 3:
				System.out.println("교직원 수정입니다.");
				break;
			case 4:
				System.out.println("교직원 삭제입니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break;
			} // 교직원 스위치문 종료
			break; // case A 종료

		////////////////////////////////////////////////////////////////////

		case 'b':
		case 'B':
			System.out.println("학생 관리 메뉴입니다.");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 학생 수정");
			System.out.println("4. 학생 삭제");
			int subSelect2 = input.nextInt();
			switch (subSelect2) {
			case 1:
				System.out.println("학생 등록입니다.");
				break;
			case 2:
				System.out.println("학생 보기입니다.");
				break;
			case 3:
				System.out.println("학생 수정입니다.");
				break;
			case 4:
				System.out.println("학생 삭제입니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break;
			} // 학생 스위치문 종료
			break; // case B 종료

		////////////////////////////////////////////////////////////////////

		case 'c':
		case 'C':
			System.out.println("성적 관리 메뉴입니다.");
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 보기");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			int subSelect3 = input.nextInt();
			switch (subSelect3) {
			case 1:
				System.out.println("성적 등록입니다.");
				break;
			case 2:
				System.out.println("성적 보기입니다.");
				break;
			case 3:
				System.out.println("성적 수정입니다.");
				break;
			case 4:
				System.out.println("성적 삭제입니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break;
			} // 성적 스위치문 종료
			break; // case C 종료

		////////////////////////////////////////////////////////////////////

		case 'z':
		case 'Z':
			System.out.println("프로그램을 종료합니다.");
			break; // case Z 종료
		default:
			System.out.println("메뉴에 없는 항목입니다.");
			break;
		} // 스위치문 종료

		////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////
		// if문으로 틀을 만든다면
		////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////

		System.out.println("========성적처리 프로그램 (if 버전========");
		System.out.println("a. 교직원 관리");
		System.out.println("b. 학생 관리");
		System.out.println("c. 성적 관리");
		System.out.println("z. 프로그램 종료");
		System.out.print("네 가지 알파벳 중 하나를 입력해 주세요.");
		String select2 = input.next(); // 문자 추출

		////////////////////////////////////////////////////////////////////

		if (select2.equalsIgnoreCase("a")) {
			System.out.println("교직원 관리 메뉴입니다.");
			System.out.println("1. 교직원 등록");
			System.out.println("2. 교직원 보기");
			System.out.println("3. 교직원 수정");
			System.out.println("4. 교직원 삭제");
			int subSelect3 = input.nextInt();
			if (subSelect3 == 1) {
				System.out.println("교직원 등록입니다.");
			} else if (subSelect3 == 2) {
				System.out.println("교직원 보기입니다.");
			} else if (subSelect3 == 3) {
				System.out.println("교직원 수정입니다.");
			} else if (subSelect3 == 4) {
				System.out.println("교직원 삭제입니다.");
			} else {
				System.out.println("메뉴에 없는 항목입니다.");
			}

			/// 교직원 메뉴 종료
			////////////////////////////////////////////////////////////////////

		} else if (select2.equalsIgnoreCase("b")) {
			System.out.println("학생 관리 메뉴입니다.");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 학생 수정");
			System.out.println("4. 학생 삭제");
			int subSelect33 = input.nextInt();
			if (subSelect33 == 1) {
				System.out.println("학생 등록입니다.");
			} else if (subSelect33 == 2) {
				System.out.println("학생 보기입니다.");
			} else if (subSelect33 == 3) {
				System.out.println("학생 수정입니다.");
			} else if (subSelect33 == 4) {
				System.out.println("학생 삭제입니다.");
			} else {
				System.out.println("메뉴에 없는 항목입니다.");
			}

			/// 학생 메뉴 종료
			////////////////////////////////////////////////////////////////////

		} else if (select2.equalsIgnoreCase("c")) {
			System.out.println("성적 관리 메뉴입니다.");
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 보기");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			int subSelect333 = input.nextInt();
			if (subSelect333 == 1) {
				System.out.println("성적 등록입니다.");
			} else if (subSelect333 == 2) {
				System.out.println("성적 보기입니다.");
			} else if (subSelect333 == 3) {
				System.out.println("성적 수정입니다.");
			} else if (subSelect333 == 4) {
				System.out.println("성적 삭제입니다.");
			} else {
				System.out.println("메뉴에 없는 항목입니다.");
			}

			/// 성적 메뉴 종료
			////////////////////////////////////////////////////////////////////

		} else if (select2.equalsIgnoreCase("z")) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("a, b, c, z 중 다시 선택해주세요.");
		} /// Z 메뉴 종료

	}// 전체 if문 종료

	//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////

} // Main
