package lesson.test1;

public class review {
	public static void main(String[] args){
		int number = 1;
		int total = 0;
	    for(int i=0;i<5;i++){
	    	number += i;
	    	total += number;
	    	System.out.print(total+" ");
	    }System.out.println(total);
	    
	}
//	public void sepCal() {
//		System.out.println("2022Y 09M");
//		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
//		int startDay = 4;
//		int lastDay = 30;
//		int day = 1;
//		for(int i=0;i<startDay;i++) {
//			System.out.print("\t");
//		}
//		for(int i=0;i<lastDay;i++) {
//			day = 1 + i;
//			System.out.print(day+"\t");
//			if((day+startDay)%7==0) {
//				System.out.println();
//			}
//			
//		}
//	}
//		// 주어진 구구단을 출력하는 코드 작성
//		// 클래스와 메소드를 만들어야 하지만 메소드만 생성하도록 한다.
//		public void printDan(int dan) {
//			dan = 2;
//			for(int i=0;i<9;i++) {
//				System.out.println(dan+"X"+dan+"="+dan*i);
//			}
//		
//	}
//	// code sum 1 to 100
//	public void printSum() {
//		int a = 1;
//		int total = 0;
//		for(int i=0;i<100;i++) {
//			total = a + total;
//			a = a + i;
//			
//		}
//		System.out.println(total);
//	}
//	// code sum 1 to 100 expert
//	public void returnSum() {
//		
//	}
//	// code sum 1 to n
//	public int printSum(int n) {
//		int result = 0;
//		
//		return result;
//	}
//	// code sum 1 to n expert
//	public int returnSum(int n) {
//		int result = 0;
//		
//		return result;
//	}

}
