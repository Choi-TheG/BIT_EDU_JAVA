package lesson.day8;

import java.util.ArrayList;

public class CollectionCode {
	public void testListV3() {
	//Auto boxing, unboxing
//		코드는 간소화 됐지만 명확성이 떨어짐
		ArrayList<Integer> list = new ArrayList<Integer>(); // Generic(제너릭)
		// 추가
		list.add(1);
//		Integer.valueOf(1) != 1 int화한 1과 그냥 1은 다르다
		list.add(2);
		list.add(30);
//		list.add(new String("four")); // type object
		int size = list.size();
		System.out.println(size);
		int value = list.get(0);
		System.out.println(value);
		list.set(2, 13);
		value = (Integer)list.get(1);
		System.out.println(value);
		value = list.remove(2);
		System.out.println("removing :"+value);
		for(int i=0;i<list.size();i++) {
			value = (Integer)list.get(i);
//			System.out.println(value);
		}
	}
	
	public void testListV2() {
		//ArrayList(가변형 배열) 객체 생성
		ArrayList<Integer> list = new ArrayList<Integer>(); // Generic(제너릭)
		// 추가
		list.add(Integer.valueOf(1)); // type object
//		Integer.valueOf(1) != 1 int화한 1과 그냥 1은 다르다
		list.add(new Integer(2)); // java에서 쓰지마래
		list.add(Integer.valueOf(30)); // type object
//		list.add(new String("four")); // type object
		int size = list.size();
		System.out.println(size);
		Integer intObj = (Integer)(list.get(0));
		int value = intObj.intValue();
		System.out.println(value);
		list.set(2, Integer.valueOf(3));
		intObj = (Integer)list.get(2);
		value = intObj.intValue();
		System.out.println(value);
//		list.remove(3);
		for(int i=0;i<list.size();i++) {
			intObj = (Integer)list.get(i);
			value = intObj.intValue();
			System.out.println(value);
		}
	}
	public void testList() {
		//ArrayList(가변형 배열) 객체 생성
		ArrayList list = new ArrayList();
		// 추가
		list.add(Integer.valueOf(1)); // type object
		list.add(new Integer(2)); // java에서 쓰지마래
		list.add(Integer.valueOf(30)); // type object
		list.add(new String("four")); // type object
		int size = list.size();
		System.out.println(size);
		Integer intObj = (Integer)(list.get(0));
		int value = intObj.intValue();
		System.out.println(value);
		list.set(2, Integer.valueOf(3));
		intObj = (Integer)list.get(2);
		value = intObj.intValue();
		System.out.println(value);
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			intObj = (Integer)list.get(i);
			value = intObj.intValue();
			System.out.println(value);
		}
	}
}
