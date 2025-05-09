package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// 자동 타입 변환 연습
		// float보다는 double 사용, float는 접미사 F
		// 21억 개 이상 경우의 수는 long 사용, 접미사 L
		
		byte byteValue = 10; // 바이트는 8비트짜리
		int intValue = byteValue; // 자동 타입 변환
		System.out.println("자동타입 된 int:" + intValue);
		char charValue = '가';
		intValue = charValue; // 자동 타입 변환
		System.out.println("자동타입 된 int:" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println("자동타입 된 int:" + longValue);
		double doubleValue = intValue;
		System.out.println("자동타입 된 int:" + doubleValue);

	}

}
