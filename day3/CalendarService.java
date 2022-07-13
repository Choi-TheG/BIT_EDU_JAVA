package lesson.day3;

public class CalendarService {

	public static void main(String[] args) {
//		new MyCalendar(); // MyCalendar의 객체, 변수 할당(선언)하기 전에는 사용 못함

//		MyCalendar cal; // cal을 MyCalendar type으로 변수 선언
//		cal = new MyCalendar(); // MyCalendar --> 생성자
//		cal.viewMonth();

//		MyCalendar cal = new MyCalendar();
//		cal.viewMonth();
		
		CodePractice cp = new CodePractice();
		cp.calcuSum();
		int result = cp.calcuSum(100);
		System.out.println(result);
	}

}
