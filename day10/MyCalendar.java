package lesson.day10;

import java.util.Calendar;

public class MyCalendar {
//	Calendar 불러오기
	Calendar cal = Calendar.getInstance();
//	Calendar
	public void viewMonth(int year, int month) {
		////////////API에서 얻은 만년달력에 필요한 정보////////////////
		cal.set(year, month-1, 1);
		// 요일정보 가져오기
		int date = cal.get(Calendar.DAY_OF_WEEK);
		int startDay = date-1;
		// 월의 마지막일 정보 가져오기
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(date+" "+lastDay); // date랑 lastDay 정보 확인 후 startDay랑 lastDay 관계 파악
		//////////////////////////////////////////////////////
		System.out.println(year+"Y "+month+"M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int day = 1;
		for(int i=0;i<startDay;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			day = i + 1;
			System.out.print(day+"\t");
			if((day+startDay)%7==0) {
				System.out.println();
			}
		}
	}
	
//	2022Y Calendar
	public void viewMonth(int month) {
		// 주어진 월의 첫날 정보와 마지막날 정보 ?
		int[] startD = {6,2,2,5,0,3,5,1,4,6,2,4};
		int[] lastD = {31,28,31,30,31,30,31,31,30,31,30,31}; // 결정된 값 넣을땐 { }
		int startDay = startD[month-1];
		int lastDay = lastD[month-1];
		System.out.println(cal.get(Calendar.YEAR)+"Y "+month+"M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int day = 1;
		for(int i=0;i<startDay;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			day = i + 1;
			System.out.print(day+"\t");
			if((day+startDay)%7==0) {
				System.out.println();
			}
		}
	}
//	class의 구성 : data + process
//	data --> 변수(필드, 속성)	process --> 메소드

//	프로그래밍 할 내용(해야 할 작업)을 알고(이해하고) 있는가?
//	공공	   리턴없음 기본메소드생성
	public void viewMonth() {
//		변수 선언(초기화)
//		type
		int startDay = 5;
		int lastDay = 31;
//		출력문
		System.out.println("2022Y 7M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");//이스케이프 문자
		int day = 1;
//		for반복문(초기화,조건식,증감식), ++ 1증가 -- 1감소
		for(int i=0;i<startDay;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			day = i + 1;
			System.out.print(day+"\t");
//			로직은 출력로직(7칸마다 한 줄 띄우기)
//			if조건문(조건식), a%b a를 b로 나누었을 때 나머지, a==b a와 b가 같을 때
			if((day+startDay)%7==0) { // 7은 7칸을 뜻함. 즉, 해당 변수가 7번째 칸일 때 아래 실행문을 실행하도록 설정.
				System.out.println();
			}
		}
	}
}
