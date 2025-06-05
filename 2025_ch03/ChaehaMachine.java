package ch03;

/*
 
 *  최대한 수업 시간에 배운 내용만 사용함!
 *  나중에 try-catch를 배우면, 변수 타입이 맞지 않아 발생하는 오류를 잡을 수 있을 것
 
 			==========================================
			메서드 검색용  (Ctrl + F로 찾아서 이동하세요!)
			==========================================

			사용자 모드: userMode

			viewMenu // 메뉴 보기
			purchaseMenu // 구매
			showMoney // 가진 돈 보기
			depositMoney // 입금
			withdrawMoney // 출금
			viewHistory // 구매 내역 보기
			
			==========================================
						
			관리자 모드: managerMode
			
			addMenu // 메뉴 추가
			changePrice // 제품 가격 변경
			refillStock // 재고 리필하기
			deleteMenu // 메뉴를 개별 삭제하기
			resetMenu // 메뉴 초기화
			checkMargin // 마진 확인
			
			번외: checkPassword // 관리자 암호

 */

import java.util.Scanner;

public class ChaehaMachine {

	static boolean run = true; // while용
	static Scanner in = new Scanner(System.in);

	static String[] itemNames = new String[5]; // 메뉴 이름(str)을 넣을 배열
	static int[] itemPrices = new int[5]; // 메뉴의 가격(int)을 넣을 배열
	static int[] itemStock = new int[5]; // 메뉴의 재고 수(int)를 넣을 배열
	// 자판기가 터질 수 있으니 메뉴 5개까지만 합시다

	static String[] shopHistory = new String[100];
	static int shopCount = 0;
	// 0520 업데이트. 구매 내역(str)/거래 횟수(int)를 저장할 배열과 변수

	static int itemCount = 0; // item 수량에 쓸 변수
	static int userMoney = 0; // 사용자가 가진 돈
	static int margin = 0; // 총 판매액

	static String password = "1228";
	// 비밀번호는 제 생일
	// 숫자지만 int 처리할 필요 없어요, final 안 배웠기 때문에 안 씀

	
	
	// ===================== Main =====================

	
	
	public static void main(String[] args) {

		while (run) {
			System.out.println("\n ================ Welcome! ================");
			System.out.println("자판기를 이용해주셔서 감사합니다!");
			System.out.println("무엇을 도와드릴까요?");
			System.out.println("\n1. 사용자 모드");
			System.out.println("2. 관리자 모드");
			System.out.println("3. 각 모드별 설명!");
			System.out.println("0. 프로그램 종료!");
			System.out.print("\n>>> ");
			int select = in.nextInt();
			switch (select) {
			case 1: // 사용자 모드
				userMode();
				break;
			case 2: // 관리자 모드. checkPassword() → managerMode()가 됩니다
				checkPassword();
				break;
			case 3: // 각 모드를 설명해 줍시다
				System.out.println("\n어떤 모드에 대한 설명이 필요하신가요?");
				System.out.println("1. 사용자 모드");
				System.out.println("2. 관리자 모드");
				System.out.println("설명이 필요 없으시면 0을 눌러 주세요!");
				int select2 = in.nextInt();
				switch (select2) {
				case 1:
					System.out.println("\n사용자 모드에 대한 설명이 필요하시군요!");
					System.out.println(
							"사용자 모드에서는 메뉴 보기, 메뉴 구매하기, 지갑 잔금 보기, 지갑에 돈 추가하기 및 빼기, 지금까지의 구매 내역 확인하기, 관리자 호출하기가 가능합니다.");
					break;
				case 2:
					System.out.println("\n관리자 모드에 대한 설명이 필요하시군요!");
					System.out.println(
							"관리자 모드에서는 메뉴 추가하기, 메뉴 가격 변경하기, 재고 리필하기, 메뉴 삭제하기, 메뉴 및 재고를 초기화하기, 판매액 확인하기가 가능합니다.");
					break;
				case 0:
					System.out.println("\n메인 메뉴로 돌아갈게요!");
					break;
				default:
					System.out.println("\n존재하지 않는 번호를 입력하신 것 같아요!");
					break;
				} // mode 설명용 switch
				break;
			case 0: // 종료
				System.out.println("\n프로그램을 종료할게요!");
				run = false;
				break;
			default: // 지정되지 않은 숫자
				System.out.println("\n입력하신 숫자를 다시 확인해주세요!");
				break;
			} // 메인 메뉴 switch
		} // while

	} // main

	
	
	// ===================== 사용자 모드 =====================

	
	
	private static void userMode() {
		while (true) {
			System.out.println("\n사용자 모드에 진입하셨습니다!");
			System.out.println("원하시는 메뉴를 선택해 주세요!");
			System.out.println("\n=====================");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 메뉴 구매하기");
			System.out.println("3. 지갑 확인하기");
			System.out.println("4. 지갑에 입금하기");
			System.out.println("5. 지갑에서 돈 빼기");
			System.out.println("6. 지금까지의 구매 내역 확인하기");
			System.out.println("7. 관리자 호출하기");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("\n >>> ");

			int select = in.nextInt();

			switch (select) {
			case 1:
				viewMenu();
				break; // 메뉴 보기
			case 2:
				purchaseMenu();
				break; // 구매하기
			case 3:
				showMoney();
				break; // 지갑 보기
			case 4:
				depositMoney();
				break; // 입금
			case 5:
				withdrawMoney();
				break; // 돈 빼기
			case 6:
				viewHistory();
				break; // 관리자 호출
			case 7:
				checkPassword();
				break; // 관리자 호출
			case 0:
				System.out.println("\n메인 메뉴로 돌아갈게요!");
				return; // userMode() 종료 → main의 while로 돌아감
			default:
				System.out.println("\n해당하는 항목이 없어요!");
				break;
			}
		}
	}

	private static void viewHistory() {
		// 지금까지의 구매 내역을 확인해 볼까요 (0520 업데이트)
		System.out.println("지금까지의 구매 내역을 보여드릴게요!");
		for (int i = 0; i < shopCount; i++) {
			System.out.println(shopHistory[i]);
		} // for로 거래 내역 출력
		System.out.println("총" + margin + "원 소비하셨네요!");
	} // viewHistory

	private static void viewMenu() {
		// 메뉴를 출력만 해 봅시다 (0520 업데이트)
		if (itemCount == 0) {
			System.out.println("\n아직 등록된 메뉴가 없습니다.");
		} else {
			System.out.println("\n현재 등록된 메뉴:");
			for (int i = 0; i < itemCount; i++) {
				System.out.printf("%d. %s (가격: %d원, 재고: %d개)\n", i + 1, itemNames[i], itemPrices[i], itemStock[i]);
			} // for
		} // if
	} // viewMenu

	private static void purchaseMenu() {
		// 메뉴를 구매해 봅시다!
		if (itemCount == 0) {
			System.out.println("\n아직 등록된 메뉴가 없습니다. 관리자를 호출하세요!");
			return;
		} // 아무것도 없을 때
		System.out.println("\n구매할 메뉴를 선택해주세요! : ");
		for (int i = 0; i < itemCount; i++) {
			System.out.printf("%d. %s (가격: %d원, 재고: %d개)\n", i + 1, itemNames[i], itemPrices[i], itemStock[i]);
		} // 메뉴를 보여줍시다
		System.out.print("\n메뉴 번호를 입력하세요! >>> ");
		int select = in.nextInt();
		in.nextLine();
		if (select < 1 || select > itemCount) {
			System.out.println("\n잘못된 번호예요!");
			return;
		} // 빈 번호를 선택한 경우
		System.out.print("\n몇 개를 구매하시겠어요? >>> ");
		int userCount = in.nextInt();
		in.nextLine();
		if (userCount <= 0) {
			System.out.println("\n1개 이상부터 구매가 가능합니다!");
			return;
		} // 0개나 음수 개수를 구매하려 할 때
		int totalPrice = itemPrices[select - 1] * userCount;
		if (itemStock[select - 1] < userCount) {
			System.out.println("\n재고가 부족합니다! \n현재 재고: " + itemStock[select - 1] + "개");
			return;
		} // 원하는 개수보다 재고가 적을 때
		if (userMoney < totalPrice) {
			System.out.println("\n잔액이 부족합니다! \n현재 잔액: " + userMoney + "원, \n필요한 금액: " + totalPrice + "원");
			return;
		} // 돈이 없을 때
		userMoney = userMoney - totalPrice; // 내 돈이 줄어듭니다
		itemStock[select - 1] -= userCount; // 재고가 줄어듭니다
		margin = margin + totalPrice; // 이익이 생겼어요
		System.out.printf("\n%s을(를) %d개 구매했습니다!\n", itemNames[select - 1], userCount);
		System.out.printf("남은 잔액: %d원\n", userMoney);
		// 친절하게 출력해 주기
		shopHistory[shopCount] = itemNames[select - 1] + "------" + userCount + "개";
		shopCount++;
		// (0520 업데이트) 구매 내역을 배열에 저장하고, 쇼핑 횟수를 +1 해 줍니다
	} // purchaseMenu

	private static void showMoney() {
		// 지갑에 얼마가 있을까요
		System.out.println("\n지갑에는 " + userMoney + "가 있네요!");
	} // showMoney

	private static void depositMoney() {
		// 돈을 넣어 봅시다
		System.out.println("\n얼마를 넣을까요?");
		System.out.println("현재 잔액: " + userMoney);
		int select = in.nextInt();
		in.nextLine();
		if (select > 10000) {
			System.out.println("\n한 번에 만 원만 넣을 수 있어요!");
		} // 너무 큰 수를 넣지 않도록 최대 금액을 정합시다
		else if (select <= 0) {
			System.out.println(select + "원은 존재하지 않아요!");
		} // 0원이나 음수는 넣을 수 없어요
		else {
			userMoney = userMoney + select;
			System.out.println("\n잔액이 " + userMoney + "원이 되었어요!");
		} // 추가 후 잔액을 보여 줍시다
	} // depositMoney

	private static void withdrawMoney() {
		// 돈을 뺍시다
		System.out.println("\n얼마를 뺄까요?");
		System.out.println("현재 잔액: " + userMoney);
		int select = in.nextInt();
		in.nextLine();
		if (select > userMoney) {
			System.out.println("\n해당 금액은 지갑에 있는 돈보다 많아요!");
		} // 지갑에 있는 돈보다 큰 돈은 뺄 수 없어요
		else if (select <= 0) {
			System.out.println(select + "원은 존재하지 않아요!");
		} // 0원이나 음수는 뺄 수 없어요
		else {
			userMoney = userMoney - select;
			System.out.println("\n잔액이" + userMoney + "가 되었어요!");
		} // 출금 후 잔액을 보여 줍시다
	} // withdrawMoney

	
	
	// ===================== 관리자 모드 =====================

	
	
	private static void managerMode() {
		while (true) {
			System.out.println("\n관리자 모드에 진입하셨습니다!");
			System.out.println("원하시는 메뉴를 선택해 주세요!");
			System.out.println("\n=====================");
			System.out.println("1. 메뉴 종류 추가하기");
			System.out.println("2. 메뉴 가격 변경하기");
			System.out.println("3. 재고 리필하기");
			System.out.println("4. 메뉴 삭제하기");
			System.out.println("5. 메뉴 및 재고 초기화하기");
			System.out.println("6. 판매액 확인하기");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("\n>>> ");

			int select = in.nextInt();

			switch (select) {
			case 1:
				addMenu();
				break; // 메뉴 추가
			case 2:
				changePrice();
				break; // 가격 변경
			case 3:
				refillStock();
				break; // 리필
			case 4:
				deleteMenu();
				break; // 메뉴 개별 삭제
			case 5:
				resetMenu();
				break; // 초기화
			case 6:
				checkMargin();
				break; // 판매액 확인
			case 0:
				System.out.println("\n메인 메뉴로 돌아갈게요!");
				return; // managerMode() 종료 → main의 while로 돌아감
			default:
				System.out.println("\n해당하는 항목이 없어요!");
				break;
			}
		}
	}

	private static void addMenu() {
		// 메뉴를 추가해 봅시다
		int leftSlot = itemNames.length - itemCount; // 남은 자리
		if (leftSlot == 0) {
			System.out.println("\n더 이상 추가할 수 없어요!");
			return;
		}
		System.out.printf("\n현재 %d개까지 추가할 수 있어요.\n", leftSlot);
		System.out.print("추가할 메뉴 개수를 입력해 주세요! : ");
		int count = in.nextInt();
		in.nextLine();
		if (count <= 0 || count > leftSlot) {
			System.out.println("\n최대 " + leftSlot + "개까지만 추가할 수 있어요!");
			return;
		} // 0보다 작거나 같은 수를 추가하거나, 상한(5종류)를 추가하는 경우 (0520 업데이트)
		for (int i = 0; i < count; i++) {
			if (itemCount >= itemNames.length) {
				System.out.println("\n더 이상 추가할 수 없어요!");
			} // 최대 5개만 추가할 수 있어요
			else {
				System.out.print((i + 1) + "번째 메뉴 이름: ");
				itemNames[itemCount] = in.next();
				System.out.print("가격: ");
				itemPrices[itemCount] = in.nextInt();
				System.out.print("재고 수량: ");
				itemStock[itemCount] = in.nextInt();
				itemCount++;
				System.out.println("\n메뉴가 추가되었습니다!\n");
			} // if/else
		} // for
	} // AddMenu

	private static void changePrice() {
		// 가격을 바꿔요
		if (itemCount == 0) {
			System.out.println("\n아직 메뉴가 없습니다. 먼저 1번으로 메뉴를 등록해주세요!");
		} // 메뉴가 비었을 때
		else {
			System.out.println("\n가격을 변경할 메뉴를 선택하세요! : ");
			for (int i = 0; i < itemCount; i++) {
				System.out.printf("%d. %s (현재 가격: %d원)\n", (i + 1), itemNames[i], itemPrices[i]);
			} // 메뉴를 쭉 보여 줍시다
			System.out.print("\n변경할 메뉴 번호를 입력하세요! : ");
			int select = in.nextInt();
			if (select < 1 || select > itemCount) {
				System.out.println("\n잘못된 번호예요!");
				return;
			}
			in.nextLine();
			System.out.print("\n새 가격을 입력하세요! : ");
			int newPrice = in.nextInt();
			if (newPrice <= 0) {
				System.out.println("\n가격은 0보다 커야 해요!");
			} // 공짜 음료는 안 되겠죠
			else {
				itemPrices[select - 1] = newPrice;
			} // if/else
			System.out.printf("\n'%s'의 가격이 %d원으로 변경되었습니다!\n", itemNames[select - 1], newPrice);
		} // for
	} // ChangePrice

	private static void resetMenu() {
		// 메뉴 이름, 가격, 재고를 전부 초기화합시다!
		System.out.println("\n메뉴를 모두 초기화합니다!");
		itemCount = 0;
		itemNames = new String[5];
		itemPrices = new int[5];
		itemStock = new int[5];
	} // ResetMenu

	private static void checkMargin() {
		// 이익을 확인합니다
		System.out.println("\n지금까지 판매 금액은 " + margin + "원이에요!");
	} // checkMargin

	private static void deleteMenu() {
		// 초기화하지 말고 메뉴를 개별로 삭제해 봅시다 (0520 업데이트)
		// 사실상 고민을 가장 많이 한 메서드인데
		// java의 array는 방 개수가 불가변적이기 때문에, 특정 값을 어떻게 제거할지 생각해 봤어요
		// 선생님 조언으로 str array는 null, int array는 0으로 만들었는데
		// 중간값을 삭제한 경우 사용자가 null을 호출하면 오류가 발생합니다.
		// 그래서 사용자가 선택한 항목을 배열의 맨 끝방으로 보내 버리고
		// 마지막 값을 null로 만들었어요
		if (itemCount == 0) {
			System.out.println("\n아직 메뉴가 없습니다. 먼저 1번으로 메뉴를 등록해주세요!");
		} // 메뉴가 비었을 때
		else {
			System.out.println("\n삭제할 메뉴를 선택하세요! : ");
			for (int i = 0; i < itemCount; i++) {
				System.out.printf("%d. %s (현재 가격: %d원)\n", (i + 1), itemNames[i], itemPrices[i]);
			} // 메뉴를 쭉 보여 줍시다
			System.out.print("\n변경할 메뉴 번호를 입력하세요! >>> ");
			int select = in.nextInt();
			in.nextLine();
			if (select < 1 || select > itemCount) {
				System.out.println("\n잘못된 번호예요!");
			} else {
				for (int i = select - 1; i < itemCount - 1; i++) {
					itemNames[i] = itemNames[i + 1];
					itemPrices[i] = itemPrices[i + 1];
					itemStock[i] = itemStock[i + 1];
				} // 사용자가 선택한 값을 배열의 제일 끝으로 보냄
				itemNames[itemCount - 1] = null;
				itemPrices[itemCount - 1] = 0;
				itemStock[itemCount - 1] = 0;
				itemCount = itemCount - 1;
				System.out.println("\n선택한 메뉴가 삭제되었습니다!");
			} // 가장 마지막 값을 초기화하고, str은 null로 만듦
		} // 사용자가 선택한 번호에 따른 if/else
	} // deleteMenu

	private static void refillStock() {
		// 재고를 추가해봅시다 (0520 업데이트)
		if (itemCount == 0) {
			System.out.println("\n아직 메뉴가 없습니다. 먼저 1번으로 메뉴를 등록해주세요!");
		} // 메뉴가 비었을 때
		else {
			System.out.println("\n재고를 추가할 메뉴를 선택해주세요!");
			for (int i = 0; i < itemCount; i++) {
				System.out.printf("%d. %s (현재 가격: %d원)\n", (i + 1), itemNames[i], itemPrices[i]);
			} // 메뉴를 쭉 보여 줍시다
			System.out.print("\n변경할 메뉴 번호를 입력하세요! : ");
			int select = in.nextInt();
			in.nextLine();
			if (select < 1 || select > itemCount) {
				System.out.println("\n잘못된 번호예요!");
			} else {
				System.out.println(itemNames[select - 1] + "를 몇 개 리필하시겠어요? :");
				int count = in.nextInt();
				in.nextLine();
				if (count <= 0 || count > 100) {
					System.out.println("한 번에 1개부터 100개까지만 리필할 수 있어요!");
				} else {
					itemStock[select - 1] = itemStock[select - 1] + count;
					System.out.printf("%s을(를) %d개 리필했어요!\n", itemNames[select - 1], count);
					System.out.printf("%s의 현재 개수는 %d개입니다!", itemNames[select - 1], itemStock[select - 1]);
				} // count 개수에 따른 if/else
			} // 선택한 메뉴 번호에 따른 if/else
		} // 메뉴 등록 유무에 따른 if/else (아무것도 등록되지 않은 경우)
	} // refillStock

	
	
	// ===================== 관리자 비밀번호 =====================

	
	
	private static void checkPassword() {
		// 관리자 모드 진입 전 비밀번호 확인!
		System.out.print("\n관리자 비밀번호를 입력하세요! : ");
		String input = in.next();
		if (input.equals(password)) {
			System.out.println("\n인증되었습니다! 어서 오세요, 관리자님!");
			managerMode();
		} // 인증되면 관리자 모드 실행
		else {
			System.out.println("\n비밀번호가 틀렸어요!");
		}
	} // checkPassword

	
	
	
	
} // class
