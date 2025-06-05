package ch05.chaehaBanking;

import ch05.chaehaBanking.service.TossBank;
import ch05.chaehaBanking.service.KakaoBank;
import ch05.chaehaBanking.DTO.AccountDTO;
import java.util.Scanner;

public class BankMain {

	// 필드
	static Scanner in = new Scanner(System.in);
	static AccountDTO[] kakaobank = new AccountDTO[3];
	static AccountDTO[] tossbank = new AccountDTO[3];
	// static AccountDTO login = null;

	// 샘플 데이터
	static {
		AccountDTO accountDTO0 = new AccountDTO("1228", "채하", 20000, "카카오");
		kakaobank[0] = accountDTO0;
		AccountDTO accountDTO1 = new AccountDTO("1228", "채하", 10000, "토스");
		tossbank[0] = accountDTO1;
	}

	public static void main(String[] args) {
		// 테스트 코드
		System.out.println("kakao: " + kakaobank[0]);
		System.out.println("toss: " + tossbank[0]);

		TossBank toss = new TossBank();
		KakaoBank kakao = new KakaoBank();

		boolean running = true;
		while (running) {
			System.out.println("\n내 계좌 관리 시스템에 오신 것을 환영합니다!");
			System.out.println("1. 카카오뱅크");
			System.out.println("2. 토스 뱅크");
			System.out.println("3. 프로그램 종료");
			String select = in.next();
			switch (select) {
			case "1":
				System.out.println("카카오뱅크 메뉴로 이동할게요!");
				kakao.kakaomenu(in, kakaobank, tossbank);
				break;
			case "2":
				System.out.println("토스 뱅크 메뉴로 이동할게요!");
				toss.tossmenu(in, tossbank, kakaobank);
				break;
			case "3":
				System.out.println("프로그램을 종료합니다.");
				running = false;
				break;
			default:
				System.out.println("올바른 번호를 입력해주세요.");
				break;
			}

		}
	}
}
