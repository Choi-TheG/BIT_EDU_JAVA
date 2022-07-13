package lesson.day3;

public class MyCalendar {
//	class의 구성 : data + process
//	data --> 변수(필드, 속성)	process --> 메소드
	public void viewMonth() {
		int startDay = 5;
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
