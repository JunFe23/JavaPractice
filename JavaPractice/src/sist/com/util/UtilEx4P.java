package sist.com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class UtilEx4P {
	Object []elementData;
	
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	public UtilEx4P() {
		elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public void utilAction1() {
		
		List<String> list = new Vector<String>();
		list.add("");
	}
	
	public void utilAction2() {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("부자 되자");
		System.out.println(elementData.length);
	}
			
	
	public static void main(String[] args) {
		UtilEx4P u = new UtilEx4P();
		u.utilAction2();
	}
}
