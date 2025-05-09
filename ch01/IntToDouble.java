/*
 * IntToFloat 와 비교해서 보기
 */


package ch01;


public class IntToDouble {
	public static void main(String[] args) {
		// int와 float 모두 32비트지만 정수와 실수라는 차이가 있다.
		// 따라서 두 타입은 값의 범위가 다르다.
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; // int > double
		num2 = (int) num3; // double > int
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		/*
		num1 : 123456780
		num2 : 123456780
		num3 : 1.2345678E8
		E는 지수 형식으로, E 뒤의 숫자는 소수점 위치를 뜻함
		 */
		
		int result = num1 - num2 ;
		System.out.println("double로 변환했기 때문에 num1 > num2 값의 변화가 없음.");
		System.out.println("num1 - num2: " + result);

		
	}

}
