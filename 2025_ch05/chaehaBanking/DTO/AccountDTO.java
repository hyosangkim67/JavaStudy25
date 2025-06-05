package ch05.chaehaBanking.DTO;

public class AccountDTO {

	// 필드
	private String ano; // account number
	private String owner;
	private int balance;
	private String bankname;

	// 생성자
	public AccountDTO(String ano, String owner, int balance, String bankname) {
		super(); // source - generate constructor using fields
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
	}

	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}

	// 메서드
	// getter & setter ; source - generate getters & setters
	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	// toStirng
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + ", bankname=" + bankname + "]";
	}

}
