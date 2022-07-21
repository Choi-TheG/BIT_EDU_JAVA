package lesson.day9;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Stadium {
	private Umpire umpire; // 스타디움에는 심판이 있어야함
	public Stadium() {
		umpire = new Umpire(); // 심판 생성
	}
	public static void main(String[] args) {
		Stadium ncPark = new Stadium();
		ncPark.playBall();
	}
	// 4자리 숫자 생성(1000~9999, 중복X)
	private int makeHiddenNumber() {
		int number = 0;
		Random r = new Random();
		while(true) {
			number = r.nextInt(9000)+1000;
			int[] numbers = umpire.changeArray(number);
			boolean flag = this.isSameNumber(numbers); // 중복 숫자가 있는지 확인
			if(!flag) { //중복 숫자가 없다면
				break;
			}
		}
		System.out.println("hiddenNumber>> "+number);
		return number;
	}
	public boolean isSameNumber(int[] numbers) {
		boolean flag = false;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<numbers.length;i++) {
			set.add(numbers[i]);
		}
		if(set.size()!=4) {
			flag = true;
		}
		return flag;
	}
	// 사용자와의 인터렉션 코드 작성
	public void playBall() {
		int hiddenNumber = this.makeHiddenNumber();
//		1234를 랜덤숫자로 바꾸기(배열 이용하면 전체적으로 쉬움)
		int strike = 0;
		int ball = 0;
		umpire.setHiddenNumber(hiddenNumber);
		Scanner scan = new Scanner(System.in);
		while(true) {
		//사용자로부터 4자리 숫자 입력 받기(1000~9999, 숫자 중복 X)
			System.out.println("input your number > ");
			int tryNumber = scan.nextInt();
		// 입력숫자 판정 요청 결과 수령
			int[] result = umpire.judgeNumber(tryNumber);
		// 결과에 따른 반복 여부 결정
			strike = result[0];
			ball = result[1];
			if(strike==4) {
				System.out.println("Hurray~\n-Game over-");
				break;
			}
			System.out.println(strike+"strike(s), "+ball+"ball(s)");
			System.out.print("Continue? [Yes:1] [No:0]");
			int cmd = scan.nextInt();
			if(cmd==0) {
				System.out.println("Thanks. \n-Game over-");
				break;
			}
		}
		scan.close();
	}
}
