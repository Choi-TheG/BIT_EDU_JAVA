package test1;

public class TestMain {
	private int age;
	public static final String firstName = "choi";
	public static void main(String[] args) {
//		System.out.println(age);
//		System.out.println(this.age);
//		System.out.println(firstName);
//		System.out.println(TestMain.firstName);
//		TestMain.firstName = "Lee";
//		test1();
//		TestMain.test1();
		TestMain tm = new TestMain();
//		tm.test1();
		tm.test3();
	}
	public void test4() {
		Person choi = new Student();
	}
	public void test2() {
		System.out.println(this.age);
	}
	public static void test1() {
		TestMain tm = new TestMain();
		System.out.println(tm.age);
		System.out.println(TestMain.firstName);
		System.out.println(tm.firstName);
	}
	public void test3() {
		// for, while, do - while
		// if
		int a = 10;
		if(a>10) {
			System.out.println("a is bigger than 10");
		} else {
			System.out.println("a isn't bigger than 10");
		}
		String result = a > 10 ? "a is bigger than 10":"a isn't bigger than 10";
		int value = a > 10 ? a*10 : a/10;
		System.out.println(value);
	}
}
