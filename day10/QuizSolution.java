package lesson.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

// 문제를 풀기위한 준비작업과 문제를 푸는 작업
// service class(== logic class)
public class QuizSolution {
	private ArrayList<Student> testData;
	
	public void readyTestData() throws IOException {
		testData = new ArrayList<Student>();
		File file = new File("./Abc1115.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		Student student = null;
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			student = new Student();
			student.setStdNo(Integer.parseInt(temp[0].trim()));
			student.setEMail(temp[1].trim());
			student.setKor(Integer.parseInt(temp[2].trim()));
			student.setEng(Integer.parseInt(temp[3].trim()));
			student.setMath(Integer.parseInt(temp[4].trim()));
			student.setSci(Integer.parseInt(temp[5].trim()));
			student.setHist(Integer.parseInt(temp[6].trim()));
			student.setTotal(Integer.parseInt(temp[7].trim()));
			student.setMgrCode(temp[8].trim());
			student.setAchievement(temp[9].trim());
			student.setLocalCode(temp[10].trim());
			testData.add(student);
		}
		br.close();
		fr.close();
	}
	public void solveQuiz1() {
		
	}
	public void solveQuiz2() throws IOException {
		ArrayList<Student> quiz1 = new ArrayList<Student>();
		for(Student temp : testData) {
			if(temp.getLocalCode().equals("B")) {
				quiz1.add(temp);
			}
		}
//		kor + eng maxScore
		int max =quiz1.get(0).getKor()+quiz1.get(0).getEng();
		for(Student temp: quiz1) {
			if(max < temp.getKor()+temp.getEng()) {
				max = temp.getKor()+temp.getEng();
			}
		}
		this.writeAnswer(2, String.valueOf(max));
	}
	public void solveQuiz3() {
		
	}
	public void solveQuiz4() {
	
	}
	public void writeAnswer(int quizNumber, String answer) throws IOException {
		File file = new File("Ans"+quizNumber+".txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(answer);
		pw.close();
		fw.close();
		System.out.println("No. "+quizNumber+"'s answer is saved.");
	}
}
