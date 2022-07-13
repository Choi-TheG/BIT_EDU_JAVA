package lesson.day2;

public class Basic3 {

	public static void main(String[] args) {
		// 5칙 연산자( + - * / % )를 사용하여 각 자릿 수를 추출하고 합계도 출력하시오
		int number = 2398;
		int total = 0;
		System.out.println(number % 10); // 10으로 나눈 나머지
		total = total + (number % 10); // total += number % 10
		System.out.println(number % 100 / 10); // 100으로 나눈 나머지의 10으로 나눈 몫
		total = total + (number % 100 / 10);
		System.out.println(number % 1000 / 100);
		total = total + (number % 1000 / 100);
		System.out.println(number % 10000 / 1000);
		total = total + (number % 10000 / 1000);
		System.out.println("합계 : " + total);


	}

}
