package lesson.day10;

import java.io.IOException;

public class TestClass {
	// 문제를 푸는 장소 == 실행 클래스(User Interface)
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.startSolvingQuiz();

	}
	
	public void startSolvingQuiz() {
		QuizSolution qs = new QuizSolution();
		try {
			qs.readyTestData();
			qs.solveQuiz2();
		} catch (IOException e) {
			System.out.println("can't find file");
		}
	}

}
