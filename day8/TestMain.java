package lesson.day8;

public class TestMain {
//	공공	   정적	  리턴타입없음	문자열[](보조정보)
	public static void main(String[] args) {
// Run -> Configurations -> lesson.day8의 TestMain 클래스 찾아 argument에 값 넣음(args 안에 들어감) 객체 나누는 기준 : 띄워쓰기
		TestMain tm = new TestMain();
//		tm.test2(args); // arguments
		tm.test4();
	}
	public void test4() {
		DateTimeService dts = new DateTimeService();
		String now = dts.getDateTimeV2(DateTimeServiceType.TIME_ONLY);
//		String now = dts.getDateTime(DateTimeService.TIME_ONLY);
		System.out.println(now);
	}
	public void test3() {
		TestCode tc = new TestCode();
		tc.testDate();
	}
	public void test1(String[] args) { // String[] args = parameter(선언하는 것) args = arguments(실질적인 것)
		try {
			System.out.println(args);
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		}catch(ArithmeticException ae) {
			System.out.println("can't divide 0");
		}catch(IndexOutOfBoundsException io) {
			System.out.println("Index Error!"+io.getMessage());
//			io.printStackTrace(); // 에러 나타내기
		}
	}
	public void test2(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
