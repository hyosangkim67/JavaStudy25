package ch02;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		// 연습용2 | 우편번호 분석 프로그램
		
		Scanner input = new Scanner(System.in);

		System.out.println("우편번호를 입력하세요");
		System.out.println("예: 02113");
		System.out.printf(">>> ");
		String postcode = input.nextLine(); // 우편번호를 입력 받자
		// 특정 자리를 추출할 거라 string으로

		String region = checkRegion(postcode);
		// postcode에서 지역을 추출

		System.out.println("해당 지역은 " + region + "입니다.");
		System.out.println("Java 공부용 프로그램으로, 해당 결과는 실제 우편번호와 다릅니다!");
	} // main

	private static String checkRegion(String postcode) {
	    String regionCode = postcode.substring(0, 2);
	    return switch (regionCode) {
	        case "01", "02" -> "서울";
	        case "03", "04" -> "경기";
	        case "05" -> "인천";
	        case "06" -> "부산";
	        default -> "등록되지 않은 지역";
	    }; // Switch 종료
		} // 지역 판단 메서드 종료
	
	} // class


