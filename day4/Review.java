package lesson.day4;

public class Review {

	public static void main(String[] args) {
		System.out.println("2022Y 09M");
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		int startDay = 4;
		int lastDay = 30;
		int day = 1;
		for(int i=0;i<startDay;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			day = 1 + i;
			System.out.print(day+"\t");
			if((day+startDay)%7==0) {
				System.out.println();
			}
			
		}
		

	}

}
