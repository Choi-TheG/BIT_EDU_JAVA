package lesson.day6;

import java.util.Random;

public class BaseballBot {
	private BaseballPlayer[] balls;
	public BaseballBot() {    }
	public void setBalls(BaseballPlayer[] balls) {
		this.balls = balls;
	}
	
	public BaseballPlayer[] getBalls() {
		return this.balls;
	}
	public void startBot() {
		this.selectBall();
	}
	private void selectBall() { 
		BaseballPlayer[] selectedBalls = new BaseballPlayer[4];
		for(int i=0;i<4;i++) {
			selectedBalls[i] = this.getBall();

		}
		System.out.print("이번 게임의 번호는 ");
		for(int i=0;i<selectedBalls.length;i++) {
			System.out.print(selectedBalls[i].getNumber()+" ");
		}
		System.out.println("입니다.");
	}
	private BaseballPlayer getBall() {
		BaseballPlayer ball = null;
		Random r = new Random();
		while(true) {
			int index = r.nextInt(9);
			ball = balls[index];
			if(!ball.isSelected()) {
				break;
			}
		}
		ball.setSelected(true);
		return ball;
	}
	
}
