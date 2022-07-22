package lesson.day10;

import java.io.IOException;

public class StreamMain {

	public static void main(String[] args) {
		StreamMain sm = new StreamMain();
		sm.test1();
	}
	public void test1() {
		StreamCode sc = new StreamCode();
		try {
			sc.readFile();
//			sc.writeFile();
//			sc.readAndWriteFile();
		} catch (IOException e) {
			System.out.println("Can't read a file");
		}
	}
//	public void test2() {
//		StreamCode sc = new StreamCode();
//		try {
//			sc.writeFile();
//		} catch (IOException e) {
//			System.out.println("Can't find a file");
//		}
//	}
//	public void test3() {
//		StreamCode sc = new StreamCode();
//		try {
//			sc.readAndWriteFile();
//		} catch (IOException e) {
//			System.out.println("Error!!");
//		}
//	}
}