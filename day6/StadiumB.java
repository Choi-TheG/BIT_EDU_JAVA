package lesson.day6;

import java.util.Scanner;

public class StadiumB {
	public static void main(String[] args) {
		StadiumB sd = new StadiumB();
		sd.playBall();
	}
	// 사용자와의 인터렉션 코드 작성
	public void playBall() {
		//4자리 숫자 생성(1000~9999, 숫자 중복 X)
		int hiddenNumber = 1234; // hardcoding
//		1234를 랜덤숫자로 바꾸기(배열 이용하면 전체적으로 쉬움)
		int strike = 0;
		UmpireA umpire = new UmpireA(hiddenNumber);
		Scanner scan = new Scanner(System.in);
		while(true) {
		//사용자로부터 4자리 숫자 입력 받기(1000~9999, 숫자 중복 X)
			System.out.println("input your number > ");
			int tryNumber = scan.nextInt();
		// 입력숫자 판정 요청 결과 수령
			int[] result = umpire.judgeNumber(tryNumber);
		// 결과에 따른 반복 여부 결정
			strike = result[0];
			if(strike==4) {
				break;
			}
			System.out.println(result[0]+"strike(s), "+result[1]+"ball(s)");
			System.out.print("Continue? [Yes:1] [No:0]");
			int cmd = scan.nextInt();
			if(cmd==0) {
				System.out.println("Thanks. \n-Game over-");
				break;
			}
		}

	}
}
