package lesson.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeIO {
	public void readFile() throws FileNotFoundException,IOException{
		//file
		File file = new File("./Abc1115.csv");
		boolean flag = file.exists();
		if(flag) { // file에 접속이 됐을 때
//			System.out.println("Hallo file exist");
			long size = file.length();
			String name = file.getName();
			System.out.println(size+", "+name);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) { // null -> 파일의 데이터를 모두 처리하면 null값이 나옴
				System.out.println(line);
			}
			br.close(); // 나중에 열린 것을 먼저 닫아야함
			fr.close();
		} else { // file 접속이 안됐을 때(파일명이나 확장자명 바꾸면 이거 뜸)
			System.out.println("file not exist");
		}
	}
}
