package lesson.day5;

import java.util.Random;

public class LessonCode5 {

	public void testArray() {
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] lastDays2 = new int[12];
		lastDays2[0] = 31;
		lastDays2[1] = 28;
		lastDays2[2] = 31;
		lastDays2[3] = 30;
		lastDays2[4] = 31;
		lastDays2[5] = 30;
		lastDays2[6] = 31;
		lastDays2[7] = 31;
		lastDays2[8] = 30;
		lastDays2[9] = 31;
		lastDays2[10] = 30;
		lastDays2[11] = 31;
	}
	public void checkSameNumber() {
		//1~ 45사이 6개의 임의의 숫자를 출력할 때 중복이 생성되지 않도록 한다
		
		Random r = new Random();
		int[] balls = new int[6];
		for(int i=0;i<6;i++) { // 6개 뽑기
			int num = r.nextInt(45)+1;
			boolean flag = false;
			for(int j=0;j<i;j++) { // j를 0번부터 i번까지 반복
				if(balls[j] == num) { // balls[j]는 balls[0]부터 balls[i]번 째 까지 num과 같은 수가 있는지 확인
					flag = true; // 
					break;	
				}
			}
			// flag 정보 이용하여 결정
			if(!flag) {
				balls[i] = num;
			} else {
				i--; //while문으로 바꿔보기
			}
//			System.out.println(num);
		}
		for(int i=0;i<6;i++) {		
			System.out.print(balls[i]+" ");
		}
	}
}
