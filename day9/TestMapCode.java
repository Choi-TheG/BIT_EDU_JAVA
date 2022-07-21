package lesson.day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMapCode {
	public void testMap() {
		System.out.println("map crud");
		// HashMap -> key type String + value type Integer
//1		HashMap map = new HashMap();
//2		HashMap<String,Integer> map = new HashMap();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		// add Data
		map.put("Smith", 90);
		map.put("Elon", 87);
		map.put("Hokins", 80);
		map.put("Smith", 93); // key값이 같기 때문에 데이터 추가가 아닌 변경됨
		// check size
		int size = map.size();
		System.out.println(size);
		// 조건조회
		int score = map.get("Smith");
		System.out.println(score);
		// 전체 조회
		Set<String> keys = map.keySet(); // Generic(클래스 내부에서 사용할 데이터 타입을 외부에서 지정)- <String>
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key); // auto unboxing
			System.out.println(key+","+value);
		}
		// remove
		Integer delValue = map.remove("Hokins");
		System.out.println("delete Value: "+delValue.intValue());
		// check size
		size = map.size();
		System.out.println(size);
		//NullPointException을 직접 처리하는 코드 작성
		try {
			Integer value = map.get("Hokins"); // 삭제한 Hokins 값을 찾으니 에러가 뜸
			System.out.println(value.intValue());
		} catch(NullPointerException npe) {
			System.out.println("There's no key");
		}
	}
}
