package lesson.day3;

public class CodePractice {
//	누구나 사용할 수 있는 메소드이며 1 to 10까지 합계를 구해 출력하는 코드를 가지고 있다
	public void calcuSum() // 메소드 선언부
	{
		//메소드 구현부
		int num = 0;
		int sum = 0;
		for(int i=0;i<10;i++) {
			num += 1;
			sum = sum + num ;
		}
		System.out.println(sum);
	}
	
//	마지막 값을 외부로 부터 입력받아 외부로 계산된 값을 전달하겠다.
	public int calcuSum(int second)
	{
		int result = 0;
		/////////////// ligic code///////////
		int number = 1;
		int sum = 0;
		for(int i=0;i<second;i++) {
			sum = sum + number;
			number = number + 1;
		}
		result = sum;
		////////////////////////////////////////
		return result; //This method must return a result of type int
	}
}
