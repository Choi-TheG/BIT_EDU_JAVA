package lesson.day5;
//		로직 + 데이터를 가지고 목적을 이룸
public class Studio {
	private LottoMachine machine;
	public Studio() {
		machine = new LottoMachine();
	}
	public static void main(String[] args) {
		Studio mbc = new Studio();
		mbc.onAir();
	}
	public void onAir() {
		machine.setBalls(this.readyBalls());
		machine.startMachine();
	}
	public LottoBall[] readyBalls() {
		LottoBall[] balls = new LottoBall[45];
		int ballNumber = 1;
		for(int i=0;i<45;i++) {
			balls[i] = new LottoBall(ballNumber++);
			//ballNumber = ballNumber + 1;
		}
		return balls;
	}

}
