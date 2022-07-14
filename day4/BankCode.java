package lesson.day4;

import java.util.Scanner;

public class BankCode {
	// 예금 출금 잔액확인 종료가 되는 프로그램 while switch
	
	int balance;
	public static void main(String[] args) {
		BankCode bank = new BankCode();
		bank.openBank();
	}
	
	public void openBank() {
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		int money  = 0;
//		int balance = 0;
		while(!isStop){
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택 >>");
			int cmd = scan.nextInt();
			switch(cmd) {
				case 1:
					System.out.println("예금>>");
					money = scan.nextInt();
					balance += money;
					break;
				case 2:
					System.out.println("출금>>");
					money = scan.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.println("잔액>>"+balance);
					break;
				case 4:
					isStop = true;
					System.out.println("Thanks.");
					break;
			}
		} scan.close();
		
	}
	
		
	

	
}
