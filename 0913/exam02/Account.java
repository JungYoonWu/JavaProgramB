package kr.ac.kopo.day03.exam02;

public class Account {
	private String accountNum;
	private String accountHolder;
	private int accountMoney;
	
	
	public Account(String accountNum, String accountHolder, int accountMoney) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.accountMoney = accountMoney;
	}
	
	public void withdraw(int money) {
		if(money > accountMoney) {
			System.out.println("잔액이 부족합니다.");
		}else {
			accountMoney -= money;
			System.out.println("출금이 성공되었습니다.");
		}
	}
	
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountMoney() {
		return accountMoney;
	}

	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
	
	
}
