package lesson.day6;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
//	Getter Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	@Override // 주소값이 나오던 값 수정하기
	public String toString() {
		return "("+x+","+y+")";
	}
	@Override
	public boolean equals(Object obj) { // Object type
		// TODO Auto-generated method stub
		boolean flag = false;
		Point point = (Point)obj; // Object type to Point type 강제변환
		if(point.getX()==x&&point.getY()==y) {
			flag = true;
		}
		return flag;
	}
}
