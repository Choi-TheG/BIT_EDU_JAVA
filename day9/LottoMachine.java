package lesson.day9;
// day5와 비교해보기
// 로또 머신 밖으로 나와야하므로 제거
// 내가 생각한거를 그대로 써라. 완벽한 코딩을 하려하지말고 일단 굴러가게 만들어라
// refactoring은 전문가들도 한다
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LottoMachine {	
	// logic class
	// 6개의 공 선택
	
	// ArrayList화 된 LottoBall type balls object를 private하게 생성
	private ArrayList<LottoBall> balls;
	// 로또기계 세팅
	public LottoMachine() { /*기본 생성자와 동일하나 명시적으로 나타냄*/ }
	// 공 가져오기
	public void setBalls(ArrayList<LottoBall> balls) { // ArrayList type balls가 매개변수인 메소드
		this.balls = balls;
	}
	// 아래 getter는 사용하지않음. 단지 정보은닉성(캡슐화)을 구성하는 방법을 보여주는 예시임.
	public ArrayList<LottoBall> getBalls() { // 공 넣기
		return this.balls;
	}
	public void startMachine() { // 기계 켜기, 독해 안됨
		// 공에 빈값을 List화 한 LottoBall 형태로 넣음
		List<LottoBall> balls = null; // import List, balls값은 안주면 밑에 balls가 오류라 비워넣는 값인 null
		try{ // 아래 내용에 에러가 뜬다면
			balls = this.selectBalls(); // 뽑힌 공의 번호를 상기 공에 넣음
		// 위 내용에 오류가 있다면 catch로
		} catch(InterruptedException e) { 
			e.printStackTrace();
		}
		// balls를 오름차순으로 정렬하여 코딩(중첩 for문)
		for(int i=0;i<balls.size()-1;i++) { // 비교 위치의 값을 가르킴(해당 위치에 값을 결정)
			for(int j=i+1;j<balls.size();j++) { // 비교대상의 위치 값을 가르킴
				if(balls.get(i).getNumber()>balls.get(j).getNumber()) { // 오름차순 비교
					LottoBall temp = balls.get(i); // temp = a
					balls.set(i, balls.get(j)); // a = b
					balls.set(j, temp); // b = temp
				}
			}
		}
		// 출력
		System.out.println("Today's Lotto Number is ");
		for(LottoBall ball : balls) { // LottoBall type ball을 balls의 수만큼 반복 
			System.out.print(ball+" "); // 오름차순 정렬된 공 출력
		}
	}
/////////////////////////////////////////////////
	public void testShuffle() {
		this.shuffleBalls(); // 밑에 메소드 호출
	}
	// 공 섞기 메소드
	public void shuffleBalls() {
		// 볼 섞기
		//공 섞기 메소드 (교환 로직)
		Random r = new Random();
		for(int i=0;i<balls.size();i++) {
			int index1 = r.nextInt(balls.size());
			int index2 = r.nextInt(balls.size());
			LottoBall temp = balls.get(index1);
			balls.set(index1, balls.get(index2));
			balls.set(index2, temp);
		} 
//		this.printBalls(); // 호출
	}
		
		// 제대로 섞였는지 확인
		private void printBalls() {
			for(LottoBall ball : balls) {
				System.out.println(ball);
			}
		}
////////////////////////////////////////////////////
	// 공 섞기
	private ArrayList<LottoBall> selectBalls() throws InterruptedException { // 공 섞기
		// 선택된 6개의 볼을 출력
		ArrayList<LottoBall> selectedBalls = new ArrayList<LottoBall>();
		for(int i=0;i<6;i++) {
			this.shuffleBalls();
			selectedBalls.add(this.getBall());
			Thread.sleep(1000);
		} return selectedBalls;
	}
	// 공 뽑기
	private LottoBall getBall() { 
		LottoBall ball = null; // 공에 빈값을 넣음
		Random r = new Random(); // 랜덤 객체 불러오고 선언
		int index = r.nextInt(balls.size()); // balls의 수 만큼 랜덤하게 index에 int값으로 넣음
		ball = balls.remove(index); // 뽑힌 공임을 표시함(로또머신 밖으로 꺼냄)
		System.out.println(ball+" is out");
		return ball;
	}
}
