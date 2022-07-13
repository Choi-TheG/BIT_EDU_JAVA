package lesson.day2;

public class Basic2 {
	
	public static void main(String[] args) {
//		시간과 분을 변수에 할당한 후 분으로 변경하여 출력하는 코드 작성
//		예) 3시간 3분은 183분으로 출력
//		int hour = 3;
//		int min = hour * 60;
//		System.out.println(hour + min + "분");
		int hour = 3;
		int min = 3;
		
		int result = hour*60 + min;
		System.out.println("요청한 계산은 " + result + "입니다.");

	}

}
