package ch02;

import java.util.Scanner;

public class WhilePractice {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		boolean run = true;

		answer = (int) (Math.random() * 10) + 1; // 정답을 1부터 10 사이로 설정

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("1부터 10 사이의 정수를 입력하세요");
			input = scan.nextInt();
			if (input > answer) {
				System.out.println("Down (입력한 숫자가 정답보다 큽니다)");
			} else if (input < answer) {
				System.out.println("Up (입력한 숫자가 정답보다 작습니다)");
			} else if (input == answer) {
				System.out.println(input + "은 정답입니다!");
				i = 3;
				break;
			} // if 닫힘
			System.out.println("기회가 " + (2 - i) + "번 남았습니다.");
			if (i == 2) {
				System.out.println("실패입니다!");
			}

		} // for

	} // main
} // class
