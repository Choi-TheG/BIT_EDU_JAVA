package lesson.day8;

import java.util.ArrayList;

public class Excercise {

	public void aList() {
		// 객체 생성
		ArrayList list = new ArrayList();
		// add
		list.add(Integer.valueOf(1)); // integer 1을 리스트에 추가함
		list.add(Integer.valueOf(6)); // integer 6을 리스트 추가
		list.add(new Integer(3)); // integer 3을 리스트 추가(예전에 쓰던 방법)
		list.add(new String("four")); // String four 리스트 추가
		int size = list.size();
//		System.out.println(size); // 배열에서는 length 리스트에서는 size
		Integer intObj = (Integer)(list.get(0));
		int value = intObj.intValue();
//		System.out.println(value);
		list.set(2, Integer.valueOf(3)); // 2번 객체를 integer 3으로 바꿈
		intObj = (Integer)list.get(2); // 2번 객체에 저장된 객체를 정수화하여 리턴함
		value = intObj.intValue();
		System.out.println(value);
		list.remove(3); // 3rd 값 삭제
//		list.clear(); // list 값 모두 삭제
		for(int i=0;i<list.size();i++) { //출력
//			intObj = (Integer)list.get(i);
			value = intObj.intValue();
//			System.out.println(value);
		}
	}
}