package lesson.day5;

public class Account {
	private int balance;
//	★★★
	// getter
	public int getBalance() { // balance type
		return balance; // 필드에 int를 줬기 때문에 return
	}
	
	// setter
	public void setBalance(int balance) { // 외부에서 쓰지 않기 때문에 private으로 써도 됨
		this.balance = balance; // this. 를 붙이지않으면 갈색(parameter)으로 인식 
								//	this.를 붙이며 파란색(field)으로 인식시킴
	}
	// 입금 deposit
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	// 출금 withdraw
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}

}
