package lesson.day8;

public class LottoBall {
	// information. 데이터 표현
	// ball의 정보를 가지고 있음
	
	private int number;
//	private boolean selected; // 뽑힌 애는 제거될 거기 때문에 필요 없음
	
	public LottoBall(int number) { //로또 공 번호 새기기
		this.number = number;
	}
	
	//getter, setter 생성
	public int getNumber() { // 공 꺼내기
		return this.number;
	}
	
//	public void setNumber(int number) { // setNumber는 ball의 number가 바뀌면 안되므로 제외
//		this.number = number;
//	}
	
	@Override
	public String toString() { // String값으로 뽑은 번호 넣기
		return String.valueOf(this.number);
	}
}
