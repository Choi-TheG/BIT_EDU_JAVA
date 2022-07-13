package lesson.day3;

public class Basic1 {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1;i<=100;i++) {
//			if(i%2==0) { // i가 짝수일 때 실행
//			if(i%2!=0) { // i가 홀수일 때 실행
			if(i%3==0) { // i가 3의 배수일 때 실행
				total += i;
			}
				
		}
		System.out.println(total);
	}


}
