package lesson.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeService {
	
	public static final int DATE_ONLY = 0; // type 값에 들어갈 값들
	public static final int TIME_ONLY = 1;
	public static final int DATE_TIME = 2;
	
	public String getDateTime(int type) {
		String now = null;
//		경우에 따라 날짜, 시간, 날짜 + 시간 정보를 제공한다
		String pattern = "yyyy년MM월dd일 HH시mm분ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); // import
		now = sdf.format(new Date());
		if(type == 0) { // type == 0 -> 날짜 제공
			now = now.split(" ")[0];
		} else if(type==1) { // type == 1 -> 시간 제공
			now = now.split(" ")[1];
		}// else if(type==2) { // type ==2 -> 날짜+시간 제공 pattern이 type == 2와 같아서 할거 없음
			
//		}
			return now;
	}
	
	public String getDateTimeV2(DateTimeServiceType type) { // 객체 지향적 방법
		String now = null;
//		경우에 따라 날짜, 시간, 날짜 + 시간 정보를 제공한다
		String pattern = "yyyy년MM월dd일 HH시mm분ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); // import
		now = sdf.format(new Date());
		if(type == DateTimeServiceType.DATE_ONLY) { // 날짜 제공
			now = now.split(" ")[0];
		} else if(type==DateTimeServiceType.TIME_ONLY) { // 시간 제공
			now = now.split(" ")[1];
		}
			return now;
	}
}
