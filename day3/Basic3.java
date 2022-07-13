package lesson.day3;

public class Basic3 {

	public static void main(String[] args) {
//		달력 하드코딩
/*		System.out.println("2022Y 5M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
		System.out.println("29\t30\t31");
*/		
//		2022Y calendar
		
/*		학생 ver.
  		int month = 8;
		int blank = 1;
		int lastday = 31;
		System.out.println("2022Y "+month+"M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");		
		for(int n=0;n<blank;n++) {
			System.out.print("\t");
		}
		for(int i=1;i<=lastday;i++) {
			System.out.print(i+"\t");
			if((i+blank) % 7 == 0) {
				System.out.println();
			}
		}
*/
//		강사님 ver.
/*		System.out.println("2022Y 5M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int day = 1; // 변수 초기화(선언)하는 이유: for문에 변수(로직)을 넣지않고 반복문으로서의 역할만 수행하도록 하기 위해
		for(int i=0;i<=31;i++) { // for문에는 반복만을 위한 변수 i만을 넣는다고 생각하자
									(i는 반복하는 수로만 쓰고 day의 개념을 넣지 않기 위해) 
									-> 아직 많이 알지 못하니 이정도로만 알면 됨
			day = i + 1;
			System.out.print(day+"\t");
			if(day%7==0) {
				System.out.println();
			}
		}
		
*/		int startDay = 5;
		int lastDay = 31;
		System.out.println("2022Y 7M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int day = 1;
		for(int i=0;i<startDay;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			day = i + 1;
			System.out.print(day+"\t");
			if((day+startDay)%7==0) { // 7은 7칸을 뜻함. 즉, 해당 변수가 7번째 칸일 때 아래 실행문을 실행하도록 설정.
				System.out.println();
			}
		}
	}

}
