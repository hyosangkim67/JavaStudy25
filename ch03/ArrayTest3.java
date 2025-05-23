package ch03;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean run = true;

		String[] menus = null;
		// count를 입력받기 전에는
		// 예제처럼 String[] menus = count를 할 수 없으므로 null로 설정함
		// menu에 복수형이 없는 거 아는데, 습관 들이려고 변수를 menus로 씀

		while (run) {
			System.out.println("\n❤❤ 점심 메뉴 추천 프로그램 (∩｡•ｏ•｡)っ.∅｡ ❤❤");
			System.out.println("1. 고민되는 메뉴 입력하기!");
			System.out.println("2. 입력한 전체 메뉴를 보기!");
			System.out.println("3. ❤ 메뉴 추첨 ❤");
			System.out.println("4. 메뉴 삭제하기!");
			System.out.println("9. 프로그램 종료!");
			System.out.print("당신의 선택은? >>> ");

			int select = in.nextInt();
			in.nextLine();

			switch (select) {
			case 1:
				menus = enterMenu(in);
				break;
			case 2:
				watchMenu(menus);
				break;
			case 3:
				randomMenu(menus);
				break;
			case 4:
				menus = deleteMenu();
				break;
			case 9:
				System.out.println("\n❤❤ 프로그램을 종료합니다! ❤❤");
				run = false;
				break;
			default:
				System.out.println("⚠️ 1, 2, 3, 4, 9 중에서 선택해주세요!");
			} // switch 종료
		} // while 종료
	} // main 종료

	///////////////////////////////////////////////////////////////////////////////////

	private static String[] enterMenu(Scanner in) {
		System.out.println("\n❤ 메뉴를 몇 가지 입력하실래요?");
		System.out.print("숫자로만 입력해 주세요 >>> ");
		int count = in.nextInt();
		String[] menus = new String[count];
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 메뉴 이름을 입력해주세요: ");
			menus[i] = in.next();
			in.nextLine();
		} // 메뉴를 count만큼 입력하고
			// menus 배열에 추가하는 for문
		System.out.println("\n메뉴 입력이 완료되었습니다!");
		return menus;
	} // Enter 종료

	private static void watchMenu(String[] menus) {
		if (menus == null || menus.length == 0) {
			System.out.println("\n⚠️ 아직 메뉴가 없습니다. 먼저 1번으로 메뉴를 등록해주세요!");
		} else {
			System.out.println("\n현재 등록된 메뉴:");
			for (int i = 0; i < menus.length; i++) {
				String menu = menus[i];
				System.out.println(menu);
			}
		} // 정상적으로 메뉴가 있을 때는 메뉴 출력
	} // Watch 종료

	private static void randomMenu(String[] menus) {
		if (menus == null || menus.length == 0) {
			System.out.println("\n⚠️ 추천할 메뉴가 없습니다. 먼저 메뉴를 입력해주세요!");
		} // 추첨 역시 마찬가지로
			// 메뉴를 등록하지 않으면 오류메세지 출력
		else {
			int i = (int) (Math.random() * menus.length);
			System.out.println("\n오늘의 점심 추천은? " + menus[i] + "!");
		}
	}// menus에 등록한 개수만큼 Math.random()으로 추첨하고
		// int로 타입 변환
		// Random 종료

	private static String[] deleteMenu() {
		System.out.println("\n메뉴를 모두 삭제합니다!");
		return null;
	} // Delete 종료

} // class 종료 ❤❤
