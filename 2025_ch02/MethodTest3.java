package ch02;

import java.util.Scanner;

public class MethodTest3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("1번째 학생 이름을 입력하세요. : ");
		String name1 = in.nextLine();
		System.out.println("점수를 입력하세요 : ");
		int score1 = in.nextInt();
		in.nextLine();

		System.out.println("2번째 학생 이름을 입력하세요. : ");
		String name2 = in.nextLine();
		System.out.println("점수를 입력하세요 : ");
		int score2 = in.nextInt();
		in.nextLine();

		System.out.println("3번째 학생 이름을 입력하세요. : ");
		String name3 = in.nextLine();
		System.out.println("점수를 입력하세요 : ");
		int score3 = in.nextInt();
		in.nextLine();

		// 학생 입력 받기

		int maxScore = getMaxScore(score1, score2, score3);
		String maxStudent = getTopStudent(name1, name2, name3, score1, score2, score3, maxScore);

		System.out.println("1등 학생:" + maxStudent);
		System.out.println("점수는 " + maxScore + "점입니다!");
		System.out.println("축하합니다! ☆*: .｡. o(≧▽≦)o .｡.:*☆");

	} // main 종료

	private static int getMaxScore(int score1, int score2, int score3) {
		int max = score1;
		if (score2 > max) {
			max = score2;
		}
		if (score3 > max) {
			max = score3;
		}
		return max;
	} // 점수 3개 중에 가장 높은 점수를 반환하는 메서드 종료

	private static String getTopStudent(String name1, String name2, String name3, int score1, int score2, int score3,
			int maxScore) {
		String result = "";
		if (maxScore == score1) {
			result = result + " " + name1;
		}
		if (maxScore == score2) {
			result = result + " " + name2;
		}
		if (maxScore == score3) {
			result = result + " " + name3;
		}
		return result;
	} // 가장 높은 점수의 주인 찾기 메서드 종료
		// 동점자 대비하여 결과에 공백 추가

} // class 종료
