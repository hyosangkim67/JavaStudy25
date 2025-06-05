/*
 * IntToFloat 와 비교해서 보기
 */

package ch01;

public class IntToFloat {

	public static void main(String[] args) {
		// float은 32비트로 된 부동 소수점 연산에 사용된다.
		// 정수 타입을 실수 타입으로 변환할 때 손실이 발생한다.
		// int(32bit) = float(32bit) bit는 같지만 float는 소수점이 존재하기 때문에 값의 범위가 다르다.
		
		int num1 = 123456780 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ; // int 타입 값을 float에 넣음
		num2 = (int) num3 ; // float > int
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3); // num3 : 1.23456784E8 < E는 지수형식이고 E 뒤의 숫자는 부동 소수점 처리
		// 																			 12. 3456784E7 E 뒤의 숫자는 소수점의 위치를 나타낸다.
		int result = num1 - num2 ;
		System.out.println("float으로 다녀온 후에 num2 값이 변경됨.");
		System.out.println("num1 - num2: " + result);
	}

}
