package lesson.day4;

public class MethodTest {
	
	public boolean isPrimeNumber(int num) {
		boolean result = false;
		
		int n = 0;
		int count = 0;
		for(int i=0;i<num;i++) {
			n += 1;
			if(num%n==0) { // n = 1 ~ 5
//				System.out.println("나누어 떨어짐 "+n);
				count++;
			}
		}
		if(count==2) {
			result = true;
		} return result;
		
	}
	public static void main(String args[]) {
		
	}
}
