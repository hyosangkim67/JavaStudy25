package ch02;

import java.util.Scanner;

public class RandomAndSubstring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("프로그램을 시작합니다.");

		// 컴퓨터 숫자 생성
		int a = (int) (Math.random() * 8 + 1);
		int b = (int) (Math.random() * 8 + 1);
		int c = (int) (Math.random() * 8 + 1);
		int d = (int) (Math.random() * 8 + 1);
		int e = (int) (Math.random() * 8 + 1);
		System.out.println("컴퓨터가 랜덤으로 1자리 숫자 5개를 생성했습니다.");

		// 사용자 입력
		System.out.print("당신의 숫자 5자리를 입력하세요 (예: 12345): ");
		String userInput = input.next();

		if (userInput.length() != 5 || !userInput.matches("\\d{5}")) {
			System.out.println("유효한 5자리 숫자를 입력하세요.");
			input.close();
			return;
		}

		int n1 = Integer.parseInt(userInput.substring(0, 1));
		int n2 = Integer.parseInt(userInput.substring(1, 2));
		int n3 = Integer.parseInt(userInput.substring(2, 3));
		int n4 = Integer.parseInt(userInput.substring(3, 4));
		int n5 = Integer.parseInt(userInput.substring(4, 5));

		// 출력
		System.out.println("당신이 입력한 숫자: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
		System.out.println("컴퓨터의 숫자: " + a + " " + b + " " + c + " " + d + " " + e);

		// 비교 여부 선택 (toLowerCase 없이)
		System.out.print("특정 자릿수를 비교하시겠습니까? (y/n) >>> ");
		char yn = input.next().charAt(0);

		if (yn == 'y' || yn == 'Y') {
			System.out.print("비교할 자리 번호를 입력하세요 (1~5) >>> ");
			int pos = input.nextInt();

			if (pos < 1 || pos > 5) {
				System.out.println("1~5 사이의 숫자만 입력 가능합니다.");
			} else {
				int user = 0, com = 0;

				switch (pos) {
					case 1: user = n1; com = a; break;
					case 2: user = n2; com = b; break;
					case 3: user = n3; com = c; break;
					case 4: user = n4; com = d; break;
					case 5: user = n5; com = e; break;
				}

				if (user > com) {
					System.out.println(pos + "번째 숫자는 당신이 더 큽니다.");
				} else if (user < com) {
					System.out.println(pos + "번째 숫자는 컴퓨터가 더 큽니다.");
				} else {
					System.out.println(pos + "번째 숫자는 동일합니다.");
				}
			}
		}

		System.out.println("프로그램을 종료합니다.");
	}
}
