/*
 * 정확한 계산은 정수를 사용하는 것이 좋다!
 * 정수 계산에 실수 타입을 사용하는 경우 예제다.
 * 정수로 계산하는 경우는 accuracyExam2를 확인하자
 */

package ch01;

public class AccuracyExam1 {
	public static void main(String[] args) {
		// 정수 계산에 실수 타입을 사용하는 예제
		int apple = 1; // 사과 1개
		double onePiece = 0.1; // 10등분해서 하나를 0.1조각으로 설정
		int number = 7; // 조각 개수. 여기서는 7조각이 있다고 하자
		
		double result = apple - number * onePiece;
		// 사과 1개 - 조각 개수 x 한 조각(0.1)
		System.out.println("사과 1개를 10등분 한 뒤, 7조각을 빼면 " + result);
		System.out.println("사과 1개를 10등분 했다. 그 중 7조각의 값은 " + number * onePiece);
		// 실행 결과: 사과 1개를 10등분 한 뒤, 7조각을 빼면 0.29999999999999993
		// 실행 결과: 사과 1개를 10등분 했다. 그 중 7조각의 값은 0.7000000000000001
		
		/*
		 * 결론은, 정확한 계산은 정수를 사용하는 것이 좋다.
		 * double은 무한한 부동소수점을 근사치로 계산해서 그런 것 같다.
		 */
		

	}

}
