package lesson.day4;

public class PracticeTest {

	public static void main(String[] args) {
		// 객체 생성
		PracticeCode pc = new PracticeCode();
		pc.viewMonth();
		
		// 소수 판별(boolean)
		MethodTest bb = new MethodTest();
		boolean result = bb.isPrimeNumber(7);
		if(result) {
			System.out.println("prime number");
		} else {
			System.out.println("number");
		}
		
		// 각 자릿 수의 합, 소수 판별(void)
		BasicCode a = new BasicCode();
		BasicCode qq = new BasicCode();
		a.testWhile();
		qq.testWhile2();
		
		// 난수 뽑기
		BasicCode _r_ = new BasicCode();
		_r_.testAPI();
		
		// Scanner
//		BasicCode _s_ = new BasicCode();
//		_s_.testAPI2();
		
		BasicCode _s_ = new BasicCode();
		_s_.testAPI3();

	}

}
