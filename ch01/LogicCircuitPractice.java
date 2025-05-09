package ch01;

import java.util.Scanner;

public class LogicCircuitPractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 0508 오후 수업에는 진법 변환, 불대수, 논리회로 등 logic circuit 과목에서 수강했던 것들을 배웠다
		// 0509 if, &&, ||, Scanner 연습
		
		/*
		 
		  수업 시간에 만든 코드
		  
		  Scanner input = new Scanner(System.in); // sc +  컨 슷
		  콘솔을 통해 값을 넣을 객체
		  String 변수명 = input.nextLine(); 
		  
		if((loginid.equals((id)) & loginpw.equals(pw))) {
			System.out.println("id나 pw가 일치합니다.");
			System.out.println("로그인 성공");
		}else {
			System.out.println("id나 pw이 다릅니다.");
			System.out.println("로그인 실패");
		}
		 
		 */
		
		// 아래는 수업 시간에 만든 상단 코드를 응용해서 연습한 코드들
		
		// #1 1P와 2P에게 가위바위보를 입력 받아 결과를 보임
		
		String rock = "바위";
		String paper = "보";
		String scissors = "가위";
		System.out.print("1P는 가위, 바위, 보 중 무엇을 내시겠습니까? ");
		String a = input.nextLine();
		System.out.print("2P는 가위, 바위, 보 중 무엇을 내시겠습니까? ");
		String b = input.nextLine();
		System.out.println("1P는 "+ a + "이고, 2P는 " + b + "입니다.");
		System.out.println("===== 결 과 =====");
		if(a.equals(b)){
			System.out.println("비겼습니다.");
		}else if((rock.equals(a) && scissors.equals(b)) || (scissors.equals(a) && paper.equals(b)) || (paper.equals(a) && rock.equals(b))){
			System.out.println("1P가 이겼습니다.");
		}else if((rock.equals(a) && paper.equals(b)) || (scissors.equals(a) && rock.equals(b)) || (paper.equals(a) && scissors.equals(b))){
		System.out.println("2P가 이겼습니다.");
		}else {
			System.out.println("가위, 바위, 보 중 하나를 입력해 주세요. 프로그램을 다시 실행해 주세요.");
			}
		

		// #2 input 받은 두 정수의 합을 출력 - Scanner 연습
		 
		System.out.println("첫 번째 정수를 입력하세요. : ");
		int number1 = input.nextInt();
		System.out.println("두 번째 정수를 입력하세요. : ");
		int number2 = input.nextInt();
		System.out.println("두 정수의 합은 " + (number1+number2) + "입니다.");
		
		// #3 Scanner, if/else 사용 연습
		
		System.out.println("홀짝을 판단할 정수를 입력해 주세요. >>> ");
		int number3 = input.nextInt();
		if(number3 % 2 == 0) {
			System.out.println(number3 + ": 짝수입니다.");
		}else {
			System.out.println(number3 + ": 홀수입니다.");
		}
		
}
}
