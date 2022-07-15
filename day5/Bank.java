package lesson.day5;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.openBank();

	}
	public void openBank() {
		Account account = new Account();
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		while(!isStop) {
			
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			
			System.out.println("선택 >> ");
//			Scanner scan = new Scanner(System.in);
			int cmd = scan.nextInt();
			
			switch(cmd) {
			case 1:
				System.out.println("예금>");
				account.deposit(scan.nextInt());
				break;
			case 2:
				System.out.println("출금>");
				account.withdraw(scan.nextInt());
				break;
			case 3:
				System.out.println("잔액>"+account.getBalance());
				break;
			case 4:
				isStop = true;
				System.out.println("Thank you.");
				break;
			}
			
		}
		scan.close();
	} 
}
