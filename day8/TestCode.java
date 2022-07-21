package lesson.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCode {
	
	public void testDate() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		System.out.println(date.toLocaleString()); // java에서 쓰지마래 ㅇㅅㅇ
		//시간 포멧팅
//		String pattern = "yyyy/MM/dd HH:mm:ss"; // 패턴 넣어주면 좋음
		String pattern = "yyyy년MM월dd일 HH시mm분ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); // import
		String now = sdf.format(date);
		System.out.println(now);
	}
}
