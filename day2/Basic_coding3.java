package lesson.day2;

public class Basic_coding3 {

	public static void main(String[] args) {
		int total = 0;
		int amount = 324178;
		
		int unit = 50000;
		for(int i=0;i<10;i++) {
			int piece = amount / unit;
			total += piece;
			System.out.println(unit+"$ "+piece+"장");
			amount = amount % unit;
//			System.out.println(amount);
			if(i % 2 == 0) {
				unit = unit /5;
			}else {
				unit = unit /2;
		}
		System.out.println("total is "+total+".");
	}

}

}