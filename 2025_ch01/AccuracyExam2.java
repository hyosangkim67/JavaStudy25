/*
 * 정확한 계산은 정수를 사용하는 것이 좋다!
 * 실수값을 내가 임의로 정수로 만들어서 계산하는 예제다.
 * double(실수)로 계산하는 경우는 accuracyExam1를 확인하자
 */

package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// accuracyExam1과 같은 내용이지만 사과 1개를 10으로 치환해서
		// 사과 1조각을 정수 1로 만든다. 소수점 처리 없이 int 타입을 활용한다.
		
		int apple = 1;
		int tempPiece = apple * 10;
		int number = 7;
		double result = (tempPiece - number) / 10.0 ;
		double result2 = (tempPiece - number) / 10 ;
		double result3 = (tempPiece - number) / (double)10 ;
		double result4 = (tempPiece - number) / (int)10.0 ;
		// 왜 / 10.0이 아니라 10을 하면 0이 나오나
		// 정수연산은 int 타입을 기본으로 하기 때문에 result가 int 타입이 되어버리고
		// 그래서 소수점 연산은 안 되는 것 같다.
		System.out.println("남은 사과 조각 수: " + result);
		System.out.println("남은 사과 조각 수: " + result2);
		System.out.println("남은 사과 조각 수: " + result3);
		System.out.println("남은 사과 조각 수: " + result4);

	}

}
