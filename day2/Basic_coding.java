package lesson.day2;

public class Basic_coding {
	
	public static void main(String[] args) {
		int amount = 324178;
//		위 금액을 5만원권, 만원권, 오천원권, 천원권, 500원, 100원, 50원, 10원, 5원, 1원짜리
//		화폐권 몇 매(개)로 되어있는지 계산하는 코드를 작성하시오
		int dhaksdnjs = amount / 50000;
//		System.out.println(dhaksdnjs);
		int aksdnjs = (amount - dhaksdnjs * 50000) / 10000;
//		System.out.println(aksdnjs);
		int dhcjsdnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000)) / 5000;
//		System.out.println(dhcjsdnjs);
		int cjsdnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000)) / 1000;
//		System.out.println(cjsdnjs);
		int dhqordnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000 + cjsdnjs * 1000)) / 500;
//		System.out.println(dhqordnjs);
		int qordnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000 + cjsdnjs * 1000 + dhqordnjs * 500)) / 100;
//		System.out.println(qordnjs);
		int dhtlqdnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000 + cjsdnjs * 1000 + dhqordnjs * 500 + qordnjs * 100)) / 50;
//		System.out.println(dhtlqdnjs);
		int tlqdnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000 + cjsdnjs * 1000 + dhqordnjs * 500 + qordnjs * 100 + dhtlqdnjs * 50)) / 10;
//		System.out.println(tlqdnjs);
		int dhdnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000 + cjsdnjs * 1000 + dhqordnjs * 500 + qordnjs * 100 + dhtlqdnjs * 50 + tlqdnjs * 10)) / 5;
//		System.out.println(dhdnjs);
		int dlfdnjs = (amount - (dhaksdnjs * 50000 + aksdnjs * 10000 + dhcjsdnjs * 5000 + cjsdnjs * 1000 + dhqordnjs * 500 + qordnjs * 100 + dhtlqdnjs * 50 + tlqdnjs * 10 + dhdnjs * 5)) / 1;
//		System.out.println(dlfdnjs);
		System.out.println("화폐권 총 매 수는 " + (dhaksdnjs + aksdnjs + dhcjsdnjs + cjsdnjs + dhqordnjs + qordnjs + dhtlqdnjs + tlqdnjs + dhdnjs + dlfdnjs) + " 매 입니다.");

	}

}
