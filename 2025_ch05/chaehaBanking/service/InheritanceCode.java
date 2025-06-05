package ch05.chaehaBanking.service;

import ch05.chaehaBanking.DTO.AccountDTO;
import java.util.Scanner;

public class InheritanceCode {

	protected AccountDTO findAccount(String ano, AccountDTO[] bank) {
		for (int i = 0; i < bank.length; i++) {
			if (bank[i] != null && bank[i].getAno().equals(ano)) {
				return bank[i];
			}
		}
		return null;
	}

	protected void createAccount(Scanner input, AccountDTO[] bank, String bankName) {
		System.out.println("\n--- 계좌 생성 ---");
		AccountDTO accountDTO = new AccountDTO();

		System.out.print("계좌번호: ");
		accountDTO.setAno(input.next());

		System.out.print("예금주 이름: ");
		accountDTO.setOwner(input.next());

		System.out.print("초기 입금액: ");
		accountDTO.setBalance(input.nextInt());

		accountDTO.setBankname(bankName);

		for (int i = 0; i < bank.length; i++) {
			if (bank[i] == null) {
				bank[i] = accountDTO;
				System.out.println("계좌 생성 완료: " + accountDTO);
				return;
			}
		}
		System.out.println("더 이상 계좌를 추가할 수 없습니다.");
	}

	protected void deposit(Scanner input, AccountDTO[] bank) {
		System.out.print("입금할 계좌번호: ");
		String ano = input.next();

		System.out.print("입금 금액: ");
		int money = input.nextInt();

		AccountDTO accountDTO = findAccount(ano, bank);
		if (accountDTO == null) {
			System.out.println("계좌 없음");
			return;
		}
		accountDTO.setBalance(accountDTO.getBalance() + money);
		System.out.println("입금 성공, 잔액: " + accountDTO.getBalance() + "원");
	}

	protected void withdraw(Scanner input, AccountDTO[] bank) {
		System.out.print("출금할 계좌번호: ");
		String ano = input.next();

		System.out.print("출금 금액: ");
		int money = input.nextInt();

		AccountDTO accountDTO = findAccount(ano, bank);
		if (accountDTO == null) {
			System.out.println("계좌 없음");
			return;
		}
		if (accountDTO.getBalance() < money) {
			System.out.println("잔액 부족");
			return;
		}
		accountDTO.setBalance(accountDTO.getBalance() - money);
		System.out.println("출금 성공, 잔액: " + accountDTO.getBalance() + "원");
	}

	protected void checkAccount(Scanner input, AccountDTO[] bank) {
		System.out.print("조회할 계좌번호: ");
		String ano = input.next();
		AccountDTO accountDTO = findAccount(ano, bank);
		if (accountDTO == null) {
			System.out.println("계좌 없음");
		} else {
			System.out.println("계좌 정보: " + accountDTO);
		}
	}
}

