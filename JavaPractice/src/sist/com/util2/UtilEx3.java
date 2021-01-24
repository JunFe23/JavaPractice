package sist.com.util2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class UtilEx3 {
	
	public void listFun1() {
		ArrayList<Double>list = new ArrayList<Double>();
		list.add(87.5);
		list.add(57.5);
		list.add(77.5);
		list.add(100.5);
		
		ListIterator<Double> it = list.listIterator();
		
		System.out.println(it.next()); // 87.5
		System.out.println(it.next()); // 57.5
		System.out.println(it.previous()); // 57.5
		System.out.println(it.previous()); // 87.5
		
	}
	
	public void listFun2() {
		ArrayList<String>list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Iterator<String> i1 = list.iterator();
		System.out.println(i1.next());
		
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Oracle");
		set.add("Jsp");
		set.add("Dsp");
		set.add("Html");
		Iterator<String> i =set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(set.toString());
		
		Stack<String> stack = new Stack<String>(); // 선입후출
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack.toString());
		StringBuffer sb = new StringBuffer();
		String str = sb.append(5>3).append("hi").append("]").toString(); // toString으로 ??
		System.out.println(sb);
		
				
	}
	
	public static void main(String[] args) {
		UtilEx3 u = new UtilEx3();
		//u.listFun1();
		u.listFun2();
	}
}
