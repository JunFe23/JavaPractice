package sist.com.util2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class UtilEx2P {
	
	public void actionEx1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("농구");
		list.add("하러");
		list.add("가자");
		System.out.println(list);
		System.out.println(list.size());
		
		Iterator<String> i = list.iterator();
		i.next();
		System.out.println(i.next());
		i.remove();
		System.out.println(i.next());
		System.out.println(list);
		i=list.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		
		
	}
	
	public static void main(String[] args) {
		UtilEx2P u = new UtilEx2P();
		u.actionEx1();
	}
	
	
	
}
