package lesson.day9;

import java.util.Random;

public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.name = name;
		this.sno = sno;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getSno() {
		return this.sno;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
}
