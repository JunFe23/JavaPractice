package sist.com.util;

import java.util.HashMap;
import java.util.HashSet;

public class UtilEx2P {

	public void process1() {
		int []i = {1,2,3,1,4,2,5,6,7,3,8,9,4,5,10,10,10};
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		System.out.println(set1.add(i[0]));
	}
	
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
		u.process1();
	}
}
