package lesson.day6;

public class UmpireA {
	private int hiddenNumber;
	public UmpireA(int n) {
		this.hiddenNumber =n;
	}
//	4자리 정수로 스트라이크와 볼을 판정해야함
	public int[]/*★처리 결과는 어떤 식으로 리턴되는가*/ judgeNumber(int tryNumber/*☆요청은 어떤 식으로 들어오는가*/) {
		int[] result= new int[2]; // 0 > strike, 1 > ball
//		실제 생성된 숫자는 어떻게 확보할 수 있는가?
		
//		요청숫자와 생성숫자를 비교하여 결과를 리턴해야하는데
//		hiddenNumber와 tryNumber를 비교하는 로직 생성
//		종료조건이 4strike가 종료조건이어서 4strike정보 전달
//		ball 정보도 리턴해서 사용자가 사용할 수 있도록 해야한다
		result[0] = 1;
		result[1] = 2;
		
		return result;
	}

}
