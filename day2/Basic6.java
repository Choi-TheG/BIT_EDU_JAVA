package lesson.day2;

public class Basic6 {

	public static void main(String[] args) {
		/*
		 * 90점 이상은 A
		 * 80~89점은 B
		 * 70~79점은 C
		 * 60~69점은 D
		 * 0~59점은 F
		 */
		int score = 82; // 왼쪽 점수의 등급을 출력하는 코드 작성 
		if(score>=90) {
			System.out.println('A');
		}
		else if(score>=80) {
			System.out.println('B');
		}
		else if(score>=70) {
			System.out.println('C');
		}
		else if(score>=60) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}


	}
		
}

