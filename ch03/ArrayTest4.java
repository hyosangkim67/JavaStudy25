package ch03;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 정렬 실습

		System.out.println("\n몇 개의 수를 입력할까?: ");
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.nextLine();
		// 수의 개수를 입력 받는다

		int[] scores = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("\n" + (i + 1) + "번째 수를 입력하세요! : ");
			scores[i] = in.nextInt();
			in.nextLine();
		}

		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1 - i; j++) {
				if (scores[j] > scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
		}

		// 정렬된 결과 출력
		System.out.printf("\n오름차순: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}

		///////////////////////////////////////////////////////////////////////

		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1 - i; j++) {
				if (scores[j] < scores[j + 1]) {
					int temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
		}

		// 정렬된 결과 출력
		System.out.printf("\n내림차순: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");

		}
	}
}
