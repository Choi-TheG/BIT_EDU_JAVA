package lesson.day6;

public class BaseballPlayer {

	private int number;
	private boolean selected;
	
	public BaseballPlayer(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	public boolean isSelected() {
		return this.selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

}
