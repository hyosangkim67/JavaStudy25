/*
 * 수업 시간에 만든 예제를 참고용으로 옮긴 것
 */

package ch01;

import java.util.Scanner; // 외부 라이브러리

public class LogicalExam {

	public static void main(String[] args) {
		// 논리 연산자는 크게 5가지 유형이 있다.
		// &: 논리 곱 -> -이고 (2가지 변수가 모두 참일 경우, 참)
		// | : 논리 합 -> -이거나 (2가지 중 하나라도 참인 경우, 참)
		// ! : 논리 부정 -> 참과 거짓을 반전한다.
		// ^ : 배타적 논리 합 -> 논리 합의 마지막이 1+1=0으로 결론 남
		
		String loginid = "kkw";
		String loginpw = "1234";
		
		Scanner input = new Scanner(System.in);
		// 콘솔을 통해 값을 넣을 객체
		System.out.print("로그인 할 id를 입력하세요. : ");
		String id = input.nextLine();
		System.out.println("입력하신 id: " + id + "입니다.");
		System.out.print("로그인할 암호를 입력하세요. : ");
		String pw = input.nextLine();
		System.out.println("=== 검증 중입니다. ===");
		
		if((loginid.equals((id)) & loginpw.equals(pw))) {
			System.out.println("id나 pw가 일치합니다.");
			System.out.println("로그인 성공");
		}else {
			System.out.println("id나 pw이 다릅니다.");
			System.out.println("로그인 실패");
		} //if문 종료

	} // main 종료

} // 클래스 종료