package lesson.day5;

public class LottoBall {
	// information. 데이터 표현
	// ball의 정보를 가지고 있음
	
	private int number;
	private boolean selected;
	
	public LottoBall(int number) {
		this.number = number;
	}
	
	//getter, setter 생성
	public int getNumber() {
		return this.number;
	}
	
//	public void setNumber(int number) { // setNumber는 ball의 number가 바뀌면 안되므로 제외
//		this.number = number;
//	}
	
	public boolean isSelected() {
		return this.selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
