package ch02;

import java.util.Scanner;

public class CasePractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("동물의 이름을 입력하세요 >> ");
		String monster = in.nextLine().trim();

		String kind = whoIsIt(monster);
		System.out.printf("%s는 %s 그룹에 포함된 동물입니다.%n", monster, kind);

	}

	static String whoIsIt(String monster) {
		return switch (monster) {
		case "호랑이", "사자", "강아지", "고양이", "고래" -> "포유류";
		case "독수리", "참새", "까마귀", "비둘기", "닭" -> "조류";
		case "고등어", "연어", "참치", "갈치" -> "어류";
		default -> {
			System.out.println("사전에 등록되지 않은 동물입니다.");
			yield "미지의 생물";
		}
		};
	}
}
