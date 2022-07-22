package lesson.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import lesson.day8.DateTimeService;

public class StreamCode {
	public void readFile() throws IOException {
		//read Abc1115.csv file
		//source
		File file = new File("./Abc1115.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null) { // null -> file의 데이터를 전부 처리하면 null값이 나옴
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
	public void writeFile() throws IOException {
		//destination
		File file = new File("./test.txt"); // 종착지는 해당 파일이 없으면 만들어서 실행됨
		FileWriter fw = new FileWriter(file,true); // true 넣으면 파일에 실행을 추가함(앞선 데이터 저장)
		PrintWriter pw = new PrintWriter(fw);
		DateTimeService ds = new DateTimeService(); // 클래스 불러오는 객체 생성해서
		pw.println(ds.getDateTime(DateTimeService.TIME_ONLY)); // 시간 정보를 불러옴
		pw.close();
		fw.close();
	}
	public void readAndWriteFile() throws IOException {
		// Coding for copy that Abc.1115.csv file to Abc.1115_copy.csv file
		// 파일 불러오기
		File file2 = new File("./Abc1115.csv");
		FileReader fr = new FileReader(file2);
		// 파일 한줄씩 읽기
		BufferedReader br = new BufferedReader(fr);
		
		// 파일 쓰기
		File file = new File("./Abc1115_copy.csv");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		String line = null;
		while((line=br.readLine())!=null) {
			pw.println(line);
		}
		br.close();
		fr.close();
		
		pw.close();
		fw.close();
	}
}
