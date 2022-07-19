package lesson.day6;

public class BaseballMain {
	private BaseballBot bot;
	public BaseballMain() {
		bot = new BaseballBot();
	}
	public static void main(String[] args) {
		BaseballMain game = new BaseballMain();
		game.getReady();
	}
	public void getReady() {
		bot.setBalls(this.readyBalls());
		bot.startBot();
	}
	public BaseballPlayer[] readyBalls() {
		BaseballPlayer[] balls = new BaseballPlayer[9];
		int ballNumber = 1;
		for(int i=0;i<9;i++) {
			balls[i] = new BaseballPlayer(ballNumber++);
		}
		return balls;
	}
}
