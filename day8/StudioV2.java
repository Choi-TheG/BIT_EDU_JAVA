package lesson.day8;

import java.util.ArrayList;

//	로직 + 데이터를 가지고 목적을 이룸
//	When lottoMachine pick a lottoBall, make it out of lottoMachine
//	Make code that shuffle lottoBall
//	마지막엔 오름차순으로 정렬

public class StudioV2 {
	private LottoMachine machine;
	public StudioV2() { // 스튜디오 생성, 로또기계 갖다놓기
		machine = new LottoMachine();
	}
	public static void main(String[] args) { // 방송사(mbc)에서 실행(방송)
		StudioV2 mbc = new StudioV2();
		mbc.onAir();
	}
	public void onAir() { // 방송화면, 공 꺼내고 기계 켜기
		machine.setBalls(this.readyBalls());
		machine.startMachine();
	}
	public ArrayList<LottoBall> readyBalls() { // 공 넣기
		ArrayList<LottoBall> balls = new ArrayList<LottoBall>(); // ArrayList<LottoBall> 불러와서 balls에 생성
//		int ballNumber = 1;
		for(int i=0;i<45;i++) {
			balls.add(new LottoBall(i+1)); // 1부터 45까지 balls에 값 넣기
			//ballNumber = ballNumber + 1;
		}
		return balls;
	}

}
