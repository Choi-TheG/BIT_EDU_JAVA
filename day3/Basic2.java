package lesson.day3;

public class Basic2 {
// 구구단
	public static void main(String[] args) {
//		2단
//		교육 방법
//		int n = 1;
//		for(int i=0;i<9;i++) {
//			System.out.println("2 X "+n+" = "+2*n);
//			n = n + 1;
//		}
		// 내가 한 방법	
//		for(int i=1;i<10;i++) {
//			System.out.println("2 X "+i+" = "+2*i);
//		}
//		전체 - 이중 for문으로 반복, 고정 제거
		for(int j=0;j<8;j++) { // 2 to 9 단 반복
			int dan = j+2;
			
			int n = 1;
			for (int i=0;i<9;i++) { // 구구단 반복
				System.out.println(dan+"x"+n+"="+dan*n);
				n += 1;
			}
			System.out.println();
		}

	}

}
