package lesson.day7;

public class StringCode {
	
	public void test3() {
		String data = "012345,abcd, 01, 23, 45, 67, 89,012,a,b,c";
//		data = data.trim(); 양 옆으로만 제거해줘서 빈칸도 같이 나옴
		String[] temp = data.split(","); // ,를 기준으로 split
		int size = temp.length; // split한 이후 데이터의 수
		System.out.println(size);
		for(int i=0;i<size;i++) {
			System.out.println(temp[i].trim());
		}
	}
	public void test2() {
		String number = "1234567"; // 하나씩 자르기
		int sum = 0;
		for(int i=0;i<number.length();i++) {
//			String letter = number.substring(i,i+1); // A1
//			sum = sum + Integer.parseInt(letter); // A1 sum letter
//			char letter = number.charAt(i); // A2
			char temp = number.charAt(i); // A2 sum letter
			String letter = String.valueOf(temp);
			sum = sum + Integer.parseInt(letter);
//			int example = 100;
//			String ex = String.valueOf(example);
//			System.out.println(letter);
		}
		System.out.println(sum); // sum letter
		
	}
	public void test1() {
		String data = "012345abcd 01 23 45 67 89012abc";
//					   0123456789012345678901234567890
		int len = data.length(); // String length
		System.out.println(len);
		
		String stdNo = data.substring(0,6);
		System.out.println(stdNo);
		String kor = data.substring(10,13);
		System.out.println(kor);
		int stdNoInt = Integer.parseInt(stdNo); // 숫자로 바꾸고싶음
		System.out.println(stdNoInt);
		int korInt = Integer.parseInt(kor.trim()); // 공백을 제거해 integer화에 오류 없애기
		System.out.println(korInt);
		String eng = data.substring(14,16);
		System.out.println(eng);
		String math = data.substring(17,19);
		System.out.println(math);
		String sci = data.substring(20,22);
		System.out.println(sci);
		int engInt = Integer.parseInt(eng);
		int mathInt = Integer.parseInt(math);
		int sciInt = Integer.parseInt(sci);
		System.out.println(engInt);
		System.out.println(mathInt);
		System.out.println(sciInt);
		String address = data.substring(23,28);
		System.out.println(address);
		String tCode = data.substring(28,29);
		System.out.println(tCode);
		String rCode = data.substring(29,30);
		System.out.println(rCode);
		String pCode = data.substring(30,31);
		System.out.println(pCode);
		
	}
}
