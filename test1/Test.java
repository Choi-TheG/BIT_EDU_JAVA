package test1;

public class Test {
	
//		1. object의 equals와 toString을 오버라이드하는 코드 예제로서 
// 		x좌표와 y좌표 데이터를 갖는 Point 클래스를 작성하시오
//	--> 다형성. equals : object의 값이 같은지 비교. toString : object의 값을 다른 메소드 없이 표현. hashCode : object가 유일한지 확인
	private int x;
	private int y;
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
		}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
//	2. 자바의 기본 데이터 타입 8가지에 대한 변수를 선언하고 기본 값을 할당하시오
//	Wrapper class-읽기전용(수정 안됨). valueOf()
//	상수 - 한 번 결정되면 변경되지않는 수. final. Enum.
		public static void main(String[] args) {
			byte a = 0;
			short b = 0;
			int c = 0;
			char d = ' ';
			long e = 0;
			float f = 0.0f;
			double g = 0.0;
			boolean h = false;
		}
/*	3. 인스턴스변수, 정적변수에 대한 예제코드 */
		public void testArray() {
			int[] a = {1,2,3,4,5};
			int[] b = new int[4];
			b[0] = 1; b[1] = 2; b[2] = 3; b[3] = 4; b[4] = 5;
		}
		
//	4. 실행 메소드에서 객체를 거치지 않고 바로 접근할 수 있는 
//		메소드를 선언하고 호출하시오
 		
				
// 5. 제어문의 예를 코드로 작성하시오
 
				
// 6. 추상클래스를 선언하고 하위클래스에서 상속받아 오버라이드하는 코드 작성
		public abstract class appleBasic{
			String attack = "Swing";
			private int level;
		}
		public class curryBasic extends appleBasic {
			String attack = "Kick";
		}
				
// 7. 싱글톤을 설명하는 코드 작성
		//Instance
		private static Test instance = new Test();
		
		//private construct
		private Test() {}
		
		public static Test getInstance() {
			return instance;
		}
				
// 8. 2가지 예외사항(null, index)을 직접처리하는 코드를 작성하시오
// (try~catch~finally)
 
				
// 9. generic, autoboxing, autounboxing 코드로 작성하시오
// ArrayList CRuD

				
// 10. List, 배열, Map, Set을 설명하는 코드

		
}
