package sist.com.util;

import java.util.ArrayList;
import java.util.HashMap;

public class UtilEx1P {
	public void utilExMethod11() {
		ArrayList<Double> list1 = new ArrayList<Double>(10); // elementsData Double형 크기가 10인 배열
		ArrayList<String> list2 = new ArrayList<String>(); // elementsData String형 배열
		
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // map은 key|value|
		
		System.out.println(list1.size()); // list1에 내용이 없으므로 크기는 10이지만 size는 0이나옴
		//System.out.println(list1.get(0)); // Null은 아니지만 실제 메모리가 만들어지지 않은 상태라 ArrayIndexOutOfBoundException 발생
		list1.add(1.1);
		list1.add(2.2);
		list1.add(3.3);
		list1.add(4.4);
		list1.add(5.5);
		list1.add(6.6);
		list1.add(7.7);
		list1.add(8.8);
		list1.add(9.9);
		list1.add(10.1);
		list1.add(11.1);
		System.out.println(list1); // 크기 10 넘어가도 알아서 추가.
		System.out.println(list1.get(3)); // 4.4
		System.out.println(list1.add(12.2)); // boolean 타입으로 true 나옴
		System.out.println(list1); // 12.2 추가
		
		list2.add("얼른하고");
		list2.add("자자");
		System.out.println(list2);
		System.out.println(list2.iterator().next()); // "얼른하고"
		System.out.println(list2.iterator().next()); // "얼른하고" -> 새로 생성된거라 위의 iterator와 다름
		
		map.put(1, "JunFe");
		map.put(2, "정연");
		map.put(3, "성빈");
		System.out.println(map);
		System.out.println(map.get(2)); // Value값만 get
		System.out.println(map.keySet()); // key값만 Integer로 받음
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		UtilEx1P u = new UtilEx1P();
		u.utilExMethod11();
	}
}
