package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		// 우리가 숫자 타입을 키보드로 입력 받아 처리하는 것이 원칙.
		// 입력값을 사전체크로 제어할 필요가 있다.
		// main 메서드 이외에 또 다른 함수(메서드)를 추가하여 사용하자.

		int result = safeAdd(70, 80);
		System.out.println(result);

	} // main 메서드 종료

	public static int safeAdd(int left, int right) {
		if (right > 0) { // true일 때
			if (left > (Integer.MAX_VALUE - right)) {
				// (Integer.MAX_VALUE)는 int 타입의 최대값. 약 21억
				// int 타입의 최대값에서 오른쪽 값을 뺀 것이 왼쪽 값보다 작아야 함
				throw new ArithmeticException("Overflow");
				// 예외 처리 오류 발생용 코드
			}
		} else { // false일 때
			if (left < (Integer.MIN_VALUE - right)) {
				// min_value는 int 타입의 최소값, 약 -21억
				throw new ArithmeticException("Overflow");
			}
		}
		return left + right;
	} // safeAdd 메서드 종료
}// class 종료
