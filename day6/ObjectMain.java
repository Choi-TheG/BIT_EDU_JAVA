package lesson.day6;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectMain b = new ObjectMain(); 	// static 없을 시. 객체(object)를 통해 아는 것
		b.test2();
//		ObjectMain.test1(); // static 있을 시. class를 통해 아는 것
		b.testPointV2();
	}
	public void testAbstract() {
		TestClass tc = new TestSubClass();
		tc.eat();
		tc.work();
//		tc.sleep(); // tc는 TestClass이기 때문에 TestSubClass에 있는 sleep은 불러오지 못함
		TestSubClass tsc = (TestSubClass)tc;
		tsc.sleep(); // tc의 타입을 강제전환하여 sleep을 불러오도록 함
		
	}
	public void testPoint() {
		//Point 객체 생성해서 출력하는 코드 작성
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		System.out.println(p1); 
		System.out.println(p2); 
//		Point의 객체(p1,p2)가 동일한 좌표를 가지는지 확인하는 코드
//		if(p1==p2) { // 오답
//			System.out.println("correct");
//		} else {
//			System.out.println("not correct");
//		}
		if(p1.getX()==p2.getX()&&p1.getY()==p2.getY()) {
			System.out.println("correct");
		} else {
			System.out.println("discorrect");
		} // 답은 나오지만 좋진않음
	}
	public void testPointV2() { // 좋은방법
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		
		boolean flag = p1.equals(p2);
		if(flag) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
	}
	public static void test1() {
		ObjectTest a = new ObjectTest();
		a.compareTest();
	}
	public void test2() {
		ObjectTest a = new ObjectTest();
		a.compareTest2(); 
	}
	public void test3() {
		ObjectTest a = new ObjectTest();
		a.compareTest3();
		System.out.println(a.toString()); // 주소값 나옴
	}
}
