package lesson.day9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class IOMain {

	public static void main(String[] args) {
		IOMain main = new IOMain();
		main.test1();
	}
	public void test1() {
		CodeIO ci = new CodeIO();
		try {
			ci.readFile();
		} catch(FileNotFoundException fe){
			System.out.println("there's no file");
		} catch(IOException ie) {
			System.out.println("Can't read the file!");
		}
	}
}
