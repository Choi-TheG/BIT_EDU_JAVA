package lesson.day9;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class StadiumV2 {
	
	public static void main(String[] args) {
		StadiumV2 ncPark = new StadiumV2();
		ncPark.playBall();
	}
	
	private int makeHiddenNumber() {
		// 4자리 숫자 생성(1000~9999, 중복X)
		int number = 0;
		Random r = new Random();
		while(true) {
			number = r.nextInt(9000)+1000;
			int[] numbers = this.changeArray(number);
			boolean flag = this.isSameNumber(numbers); // 중복 숫자가 있는지 확인
			if(!flag) { //중복 숫자가 없다면
				break;
			}
		}
		System.out.println("hiddenNumber>> "+number);
		return number;
	}
	public int[] changeArray(int number) {
		int[] result = new int[4];
		int index = 3;
		for(int i=0;i<result.length;i++) {
			int splitNumber = number % 10;
			result[index--] = splitNumber;
			number = number / 10;
		}
		
		return result;
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
		UmpireV2 umpire = new UmpireV2(this.changeArray(hiddenNumber));
		Scanner scan = new Scanner(System.in);
		while(true) {
		//사용자로부터 4자리 숫자 입력 받기(1000~9999, 숫자 중복 X)
			System.out.println("input your number > ");
			int tryNumber = scan.nextInt();
		// 입력숫자 판정 요청 결과 수령
			int[] result = umpire.judgeNumber(this.changeArray(tryNumber));
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
