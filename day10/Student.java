package lesson.day10;

/* 데이터class(해결 대상--> 은닉성 규칙을 지켜야 함.) == 점수 데이터
 * 파일을 읽어오고 한 줄씩 나누기
 * split, trim으로 쪼개기
 * stdNo,email,kor,eng,math,sci,his,total,mgrCodem, accCode, localCode
 */

public class Student {
/* 기본 틀
 * 1. 객체 10개 생성 v
 * 2. 파일 읽고 한줄씩 읽기
 * 3. split, trim하기
 * 4. ArrayList에 넣기
 */
	private int stdNo;
	private String eMail;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String achievement;
	private String localCode;

	public int getStdNo() {	return stdNo;}
	public String getEMail() {return eMail;	}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public int getSci() {return sci;}
	public int getHist() {return hist;}
	public int getTotal() {	return total;}
	public String getMgrCode() {return mgrCode;	}
	public String getAchievement() {return achievement;}
	public String getLocalCode() {return localCode;}
	
	public void setStdNo(int sn) {this.stdNo = sn;}
	public void setEMail(String email) {this.eMail = email;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	public void setSci(int sci) {this.sci = sci;}
	public void setHist(int hist) {this.hist = hist;}
	public void setTotal(int total) {this.total = total;}
	public void setMgrCode(String mgrCode) {this.mgrCode = mgrCode;}
	public void setAchievement(String achievement) {this.achievement = achievement;}
	public void setLocalCode(String localCode) {this.localCode = localCode;}
	
}
