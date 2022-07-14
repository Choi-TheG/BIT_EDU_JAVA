package lesson.day4;

import java.util.Scanner;

public class Bank {
	// 사용자에게 메뉴를 보여주고 선택한 메뉴에 맞게 처리 하는 것
	// 사용자에게 입력 받고 내용을 바탕으로 작업한다.(잔액의 변화, 잔액의 출력)
	int balance;
	

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.openBank();

	}
	// interface
/*	public void openBank() {
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		while(!isStop) {
			// 메뉴를 보여준다.
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			// 선택을 기다린다.
			System.out.println("선택 >> ");
//			Scanner scan = new Scanner(System.in);
			int cmd = scan.nextInt();
			// 선택에 맞는 작업을 한다.
			switch(cmd) {
			case 1:
				System.out.println("예금>");
				break;
			case 2:
				System.out.println("출금>");
				break;
			case 3:
				System.out.println("잔액>");
				break;
			case 4:
				isStop = true;
				System.out.println("Thank you.");
				break;
			}
			
		}
		scan.close();
	} // interface end
*/	
	
/*	// logic
	
	
	// logic end
*/ 	
	// interface + logic
	public void openBank() {
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		int money = 0;
		int balance = 0;
		while(!isStop) {
			// 메뉴를 보여준다.
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			// 선택을 기다린다.
			System.out.println("선택 >> ");
//			Scanner scan = new Scanner(System.in);
			int cmd = scan.nextInt();
			// 선택에 맞는 작업을 한다.
			switch(cmd) {
			case 1:
				System.out.println("예금>");
				money = scan.nextInt();
				balance += money;
				break;
			case 2:
				System.out.println("출금>");
				money = scan.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("잔액>"+balance);
				break;
			case 4:
				isStop = true;
				System.out.println("Thank you.");
				break;
			}
			
		}
		scan.close();
	} // interface + logic end
}
