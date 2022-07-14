package lesson.day4;

import java.util.Random;
import java.util.Scanner;

public class BasicCode {

	
	public void testAPI2() {
		// Scanner
		Scanner _s = new Scanner(System.in); // import java.util.Scanner;
		System.out.println("input plz >>>");
		String cmd = _s.nextLine(); // .nextLine() : 빈칸을 포함해 모든 정보를 받아들이겠다.
		System.out.println(cmd);
		_s.close();
	}
	
	
	public void testAPI3() {
		// Scanner
		Scanner _s = new Scanner(System.in); // System.in : 객체 생성 ★
		System.out.println("input plz >>>");
		int cmd = _s.nextInt(); //  int값으로 바꾸면서 nextInt()로 바뀜
		System.out.println(cmd*10); // int로 값이 잘 입력됐나 확인하려고 10을 곱함
		_s.close();
	}
	
	
	public void testAPI() {
		//random
		for(int i=0;i<6;i++) {
			Random  _r = new Random(); // import java.util.Random;
			int num = _r.nextInt(45); // 0 <= num < 45
			System.out.println(num);
		}
	}
	
	
	public void testWhile2() {
		//소수판별
		//소수? 1과 자기자신만으로만 나누어지는 수
		// 나의 답
		int number = 9;
		// number가 소수임을 판별하는 코드
		if(number % 2 != 0 && number % 3 != 0) { // 또는 = &&, ||
			System.out.println(number+" is prime number.");
		}	else {
				System.out.println(number+" isn't prime number.");
			}
		// 강사님 답 2회 이상 나눠지지않는 수 => 소수
		int numb = 7;
		int n = 0;
		int count = 0;
		for(int i=0;i<numb;i++) {
			n += 1;
			if(numb%n==0) { // n = 1 ~ 5
//				System.out.println("나누어 떨어짐 "+n);
				count++;
			}
		}
		if(count==2) {
			System.out.println(numb+" is prime number.");
		} else {
			System.out.println(numb+" isn't prime number.");
		}
		
	}

	
	public void testWhile() {
		int number = 1562489564;
		int total = 0;
//		반복문 중에 while
		boolean isFlag = false; // 값이 정해지지않은 boolean의 기본값은 false (사람마다 기본값 다름 true가 기본값인 사람도 있음)
		while(!isFlag) {
			int splitNumber = number % 10; // splitNumber에는 1의 자릿수만 남음
			System.out.println(splitNumber);
			total = total + splitNumber;
			number = number / 10; 	// number에서 1의 자릿수를 날리고 while문 반복
			if(number==0) { 		// number에 남은 숫자가 없을 때
//				System.out.println(total);
				isFlag = true; // number에 남은 숫자가 없을 때 isFlag값을 바꿔 while문 break
//				break;				// while문 break
			}
		}
		System.out.println(total); // 15열과 같은 결과 출력 if문 안에서 break 전에 출력하냐 while문이 끝나고 출력하냐의 차이
	}

	public static void main(String[] args) {
		BasicCode a = new BasicCode();
		BasicCode qq = new BasicCode();
		a.testWhile();
		qq.testWhile2();
	}

}

/* while문의 기본 구성
 * while(true){
 * 	if(조건){
 * 	break;
 * 	}
 * }
 */