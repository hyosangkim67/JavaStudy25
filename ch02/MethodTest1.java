package ch02;

import java.util.Scanner;

public class MethodTest1 {

	public static void main(String[] args) {
		// 연습용 | 주민등록 번호 분석 프로그램

		Scanner input = new Scanner(System.in);

		System.out.println("주민등록번호를 입력하세요.");
		System.out.println("예: 011228-4123456");
		System.out.printf(">>> ");
		String idnum = input.nextLine(); // 주민등록 번호 입력 받음
		// 특정 자리를 추출할 거라 string으로

		String birthday = birthdayExtract(idnum);
		// idnum에서 생년월일을 추출한 문자열
		String gender = genderExtract(idnum);
		// idnum으로 성별을 판별한 문자열

		System.out.println("Your Birthday: " + birthday);
		System.out.println("Your Gender: " + gender);

	}
	
	// 0 1 1 2 2 8 - 4
	// 0 1 2 3 4 5 6 7 자릿수 헷갈려서 메모용

	private static String birthdayExtract(String idnum) {
		// 생일 추출
		String year = idnum.substring(0, 2); // 년
		String month = idnum.substring(2, 4); // 월
		String date = idnum.substring(4, 6); // 일
		String year3 = "";
		char year2 = idnum.charAt(7);
		switch (year2) {
		case '1', '2' -> year3 = "19";
		case '3', '4' -> year3 = "20";
		default -> year3 = "??";
		}
		return year3 + year + "년 " + month + "월 " + date + "일 ";
	} // 생일 추출 메서드 종료

	private static String genderExtract(String idnum) {
		char gendernumber = idnum.charAt(7);
		int num = Character.getNumericValue(gendernumber);
		return (num % 2 == 0) ? "female" : "male";
	} // 성별 판별 메서드 종료

} // class 종료
