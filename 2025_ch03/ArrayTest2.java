package ch03;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 해당 코드는 MethodTest3에서 Array 기능을 추가하여 만듦 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("몇 명의 점수를 확인하시겠습니까?");
		System.out.println("숫자로만 입력해 주세요! ₍̫̫ᵔ ˲   ̫ ˱ ᵔ₎ ̫̫ (예: 1, 2, 3)");
		System.out.println(">>> ");
		int count = in.nextInt();

		String[] names = new String[count];
		int[] scores = new int[count];
		
		for (int i = 0; i<count; i++) {
			System.out.println((i+1)+"번째 학생 이름을 입력하세요! : ");
			names[i] = in.next();
			System.out.println((i+1)+"번째 학생의 점수를 입력하세요! : ");
			scores[i] = in.nextInt();
		}
		
		// 학생 입력 받기

		int maxScore = getMaxScore(scores);
		String maxStudent = getTopStudent(scores, names, maxScore);

		System.out.println("1등 학생:" + maxStudent);
		System.out.println("점수는 " + maxScore + "점입니다!");
		System.out.println("축하합니다! ☆*: .｡. o(≧▽≦)o .｡.:*☆");

	} // main 종료

	private static int getMaxScore(int[] scores) {
		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			max = scores[i];
			if (scores[i] > max) {
				max = scores[i];
			} 
		}
		return max;
	} // 점수 3개 중에 가장 높은 점수를 반환하는 메서드 종료

	private static String getTopStudent(int[] scores, String[] names, int MaxScore) {
		String result = "";
		for (int i = 0; i < scores.length; i++) {
			if (MaxScore == scores[i]) {
				result = result + " " + names[i];
			}
		}
		return result;
	} // 가장 높은 점수의 주인 찾기 메서드 종료
		// 동점자 대비하여 결과에 공백 추가

} // class 종료
