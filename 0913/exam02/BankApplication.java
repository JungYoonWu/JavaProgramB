package kr.ac.kopo.day03.exam02;

import java.util.Scanner;

public class BankApplication {
	
	private Account[] accounts = new Account[100];
	private int accountCnt = 0;
	
	String[] menuList = {"1.계좌생성", "2.계좌목록", "3.예금", "4.출금", "5.종료"};
	
	public void start() {
		int menu;
		
		Scanner input = new Scanner(System.in);
		do {
			showMenuList();
			System.out.print("선택>> ");
			menu = Integer.parseInt(input.nextLine());
			switch(menu) {
			case 1 -> createAccount();
			case 2 -> showAccountList();
			case 3 -> savingAccount();
			case 4 -> withdrawAccount();
			case 5 -> exit();
			default -> showMessage("없는 메뉴 번호입니다.");
			}
		}while(menu != 5);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public void showMenuList() {
		System.out.println("----------------------------------");
		for(int i = 0; i < menuList.length-1; i++) {
			System.out.print(menuList[i]+"|");
		}System.out.println(menuList[menuList.length-1]);
		System.out.println("----------------------------------");
	}
	
	public void createAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println("[계좌생성 실행 결과]");
		System.out.print("계좌번호 : ");
		String accountNum = input.nextLine();
		System.out.print("계좌주 : ");
		String accountHolder = input.nextLine();
		System.out.print("초기입금액 : ");
		int accountMoney = Integer.parseInt(input.nextLine());
		
		Account act = new Account(accountNum, accountHolder, accountMoney);
		accounts[accountCnt++] = act;
		System.out.println("계좌가 성공적으로 생성되었습니다.");
	}
	
	public void showAccountList() {
		System.out.println("[계좌목록 실행 결과]");
		for(int i = 0; i < accountCnt; i++) {
			System.out.println(accounts[i].getAccountNum() + "   " + accounts[i].getAccountHolder() + "   " + accounts[i].getAccountMoney());
		}
	}
	
	public void savingAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println("[계좌목록 실행 결과]");
		System.out.print("계좌번호 : ");
		String accountNum = input.nextLine();
		
		System.out.print("예금액 : ");
		int money = Integer.parseInt(input.nextLine());
		
		Account account = findAccount(accountNum);
		if(account != null) {
			account.setAccountMoney(account.getAccountMoney() + money);
			System.out.println("예금이 성공적으로 완료되었습니다.");
		}else {
			System.out.println("일치하는 계좌번호가 존재하지 않습니다.");
		}
	}
	
	public void withdrawAccount() {
		System.out.println("[계좌목록 실행 결과]");
		Scanner input = new Scanner(System.in);
		System.out.print("계좌번호 : ");
		String accountNum = input.nextLine();
		System.out.print("출금액 : ");
		int money = Integer.parseInt(input.nextLine());
		
		Account account = findAccount(accountNum);
		if(account != null) {
			account.withdraw(money);
		}else {
			System.out.println("일치하는 계좌번호가 존재하지 않습니다.");
		}
	}
	
	public void exit() {
		System.out.println("프로그램 종료");
	}
	
	private Account findAccount(String accountNum) {
		for(int i = 0; i < accountCnt; i++) {
			if(accounts[i].getAccountNum().equals(accountNum)) {
				return accounts[i];
			}
		}
		return null;
	}
}
