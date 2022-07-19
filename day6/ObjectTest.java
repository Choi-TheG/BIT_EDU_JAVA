package lesson.day6;
// 다형성
public class ObjectTest {
	public void compareTest() {
		int a = 10;
		int b = 10;
		if(a==b) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
	}
	public void compareTest2() {
		String a = new String("10");
		String b = new String("10");
		System.out.println(a.toString()); // toString method
		if(a==b) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
//		>>> a!=b why? 비교 기준이 명확하지않아서 객체 자체를 비교함(객체의 유일성으로 객체 a와 b에 들어간 10은 다름)
		
		if(a.equals(b)) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
//		>>> equals why? 객체 자체가 아닌 문자열을 비교함(override)
	}
	public void compareTest3() {
		String a = "10";
		String b = "10";
		if(a==b) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
//		new로 생성하지않았기 때문에 값이 만들어져있는 것을 확인하고 같은 값을 줌
		
		if(a.equals(b)) {
			System.out.println("equals");
		} else {
			System.out.println("!equals");
		}
//		String 비교할 땐 항상 equals를 쓰도록 함
	}
}
