package sist.com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class UtilEx4 {
	Object []elementData;
	
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	public UtilEx4() {
		elementData= DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public void utilAction1() {
		List <String>list=new Vector<String>(); // ctrl + shift + m : import
		list.add("");
	}
	
	public void utilAction2() {
		ArrayList<String>list1 =new ArrayList<String>(); // elementData | size
		ArrayList<String>list2 =new ArrayList<String>(); // elementData | size
		
		list1.add("Çö±Ý10000");
		System.out.println(elementData.length);
		
	}
	
	public static void main(String[] args) {
		UtilEx4 u = new UtilEx4();
		//u.utilAction1();
		u.utilAction2();
	}
}
