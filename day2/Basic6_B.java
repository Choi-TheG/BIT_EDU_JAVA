package lesson.day2;
//import java.util.*; // method 불러오기

public class Basic6_B {

	public static void main(String[] args) {
		int score = 85; 
//		if(score<90 && score>=80) {
//			System.out.println('B');
//		}
		
		char grade= 'F';
		if(score>=90) {
			grade = 'A';
		} else if(score>=80) {
			grade = 'B';
		} else if(score>=70) {
			grade = 'C';
		} else if(score>=60) {
			grade = 'D';
		} else { 
			grade = 'F';
		}
		
		System.out.println("grade is "+grade);

	}

}
