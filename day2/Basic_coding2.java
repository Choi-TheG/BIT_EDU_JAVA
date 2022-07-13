package lesson.day2;

public class Basic_coding2 {

	public static void main(String[] args) {
		int amount = 324178;
		int total = 0;
//		위 금액을 5만원권, 만원권, 오천원권, 천원권, 500원, 100원, 50원, 10원, 5원, 1원짜리
//		화폐권 몇 매(개)로 되어있는지 계산하는 코드를 작성하시오
		System.out.println("오만원권 " + amount / 50000 +" 매");
		total = amount / 50000; // amount 를 5만으로 나눈 몫 (화폐권 수)
		amount = amount % 50000; // amount 를 5만으로 나눈 나머지 (남은 금액)
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("만원권 " + amount / 10000 + " 매");
		total = total + (amount / 10000);
		amount = amount % 10000;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("오천원권 " + amount / 5000 + " 매");
		total = total + (amount / 5000);
		amount = amount % 5000;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("천원권 " + amount / 1000 + " 매");
		total = total + (amount / 1000);
		amount = amount % 1000;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("오백원권 " + amount / 500 + " 개");
		total = total + (amount / 500);
		amount = amount % 500;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("백원권 " + amount / 100 + " 개");
		total = total + (amount / 100);
		amount = amount % 100;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("오십원 " + amount / 50 + " 개");
		total = total + (amount / 50);
		amount = amount % 50;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("십원 " + amount / 10 + " 개");
		total = total + (amount / 10);
		amount = amount % 10;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("오원 " + amount / 5 + " 개");
		total = total + (amount / 5);
		amount = amount % 5;
		System.out.println("남은 금액 " + amount + " 원");
		System.out.println("일원 " + amount + " 개");
		total = total + amount;
		amount = amount % 1;
		System.out.println("남은 금액 " + amount + "원");
		

		System.out.println("총 화폐권 수는 " + total +" 장 입니다.");
	

	}

}
