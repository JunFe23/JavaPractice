package sist.com.util;

import java.util.HashMap;
import java.util.HashSet;

public class UtilEx2P {

	public void process1() {
		int []i = {1,2,3,1,4,2,5,6,7,3,8,9,4,5,10,10,10};
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		System.out.println(set1.add(i[0])); // boolean 타입으로 출력하면 true
		System.out.println(set1.add(i[0])); // boolean 타입으로 출력하면 이미 i[0]안에 0값이 있기때문에 false, set은 중복 허용 x
		
		set1.add(i[0]); // set1에 i[0] 추가
		set1.add(i[0]); // set1에 i[0] 추가하려하나 중복이라 안들어감.
		
		System.out.println(set1); // 그래서 값이 하나만 나옴.
		
		for (int j = 0; j < i.length; j++) {
			//if(set1.add(i[j]))
		}
	
	}
	
	
	
	public static void main(String[] args) {
		UtilEx2P u = new UtilEx2P();
		u.process1();
	}
}
