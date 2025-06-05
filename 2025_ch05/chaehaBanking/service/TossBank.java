package ch05.chaehaBanking.service;

import java.util.Scanner;
import ch05.chaehaBanking.DTO.AccountDTO;

public class TossBank extends InheritanceCode {

	public void tossmenu(Scanner in, AccountDTO[] tossbank, AccountDTO[] kakaobank) {
		boolean loop = true;
		while (loop) {
			System.out.println("\n토스 뱅크 관리 메서드입니다.");
			System.out.println("1. 계좌 생성하기");
			System.out.println("2. 보유한 계좌 확인하기");
			System.out.println("3. 입금하기");
			System.out.println("4. 출금하기");
			System.out.println("메인 메뉴로 돌아가려면 나머지 번호를 눌러 주세요.");
			System.out.print(">>> ");

			String select = in.next();
			switch (select) {
			case "1":
				System.out.println("\n계좌 생성하기 메뉴입니다.");
				createAccount(in, tossbank, "토스");
				break;
			case "2":
				System.out.println("\n보유한 계좌 확인하기 메뉴입니다.");
				checkAccount(in, tossbank);
				break;
			case "3":
				System.out.println("\n입금하기 메뉴입니다.");
				deposit(in, tossbank);
				break;
			case "4":
				System.out.println("\n출금하기 메뉴입니다.");
				withdraw(in, tossbank);
				break;
			default:
				System.out.println("\n메인 메뉴로 돌아갑니다.");
				loop = false;
				break;
			}

		}
	}
}