package ch02;

import java.util.Scanner;

public class MethodTest4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.print("첫 번째 숫자를 입력하세요: ");
			int num1 = in.nextInt();

			System.out.print("연산기호(+ - * /): ");
			String operate = in.next();

			System.out.print("두 번째 숫자를 입력하세요: ");
			int num2 = in.nextInt();

			// 입력 받기

			int result = 0;

			switch (operate) {
			case "+" -> result = plus(num1, num2);
			case "-" -> result = minus(num1, num2);
			case "*" -> result = mul(num1, num2);
			case "/" -> result = div(num1, num2);
			default -> System.out.println("잘못된 연산자입니다.");
			} // 연산자에 따른 스위치문

			System.out.println("결과: " + result); // 결과 출력

			System.out.print("계속하시겠습니까? (yes / no): ");
			String answer = in.next();
			if (answer.equalsIgnoreCase("no")) {
				run = false;
			} // 반복 여부 if, no를 입력하면 boolean = false
		} // while문 종료
	} // main 메서드 종료

	private static int plus(int a, int b) { 
		return a + b;
	} // 덧셈

	private static int minus(int a, int b) {
		return a - b;
	}  // 뺄셈

	private static int mul(int a, int b) { 
		return a * b;
	} // 곱셈

	private static int div(int a, int b) { 
		if (b == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return 0; 
		} // 0으로 나누면 예외 처리
		return a / b;
	} // 나눗셈
	
} // class 종료
