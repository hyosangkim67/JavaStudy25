package ch02;

import java.util.Scanner;

public class StringEqualsIgnore {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("input your name >>> ");
		String name = input.nextLine();
		if (name.equalsIgnoreCase("kim")) {
			System.out.println("Welcome " + name + "◝(⑅•ᴗ•⑅)◜..°♡");
		} else {
			System.out.println("(T ___T  ; ; ");
		input.close();

			/*
			 * str == "yes" -> str의 주소값이 yes인지를 검증하는 것인데 오류가 난다. str.equals("yes") ->
			 * str문자열의 내용이 yes인지를 검증(대소문자 구분) str.equals("yes") || str.equals("Yes") ||
			 * str.equals("YES") -> 대소문자 구분 안 함 str.equalsIgnoreCase("yes") -> 문자열의 내용이
			 * yes인지 검증(대소문자 구분 안 함)
			 */

		}
	}

}
