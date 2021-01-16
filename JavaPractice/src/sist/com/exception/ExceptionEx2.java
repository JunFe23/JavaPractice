package sist.com.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionEx2 {
	
	public void NoSuchElementException() { //Node를 못 찾았을 때 발생하는 exception
		ArrayList list=new ArrayList(); // [][][][][][][][][][][][][][][][]
		list.add("승우최");
		list.add(24);
		list.add(10.5);
		if(list.get(1) instanceof Integer)
		System.out.println(Integer.parseInt(String.valueOf((Integer)list.get(1))));
		System.out.println(Integer.parseInt(list.get(1).toString()));
		
		Double d = (Double)list.get(2)+2;
		System.out.println(d);
		
		Double e = (double)list.get(2);
		System.out.println(e);
		
		
		/*list.add(10.9);
		list.add(91.9);
		list.add(21.9);
		list.add(61.9);
		list.add(61.9);
		System.out.println(list);
		
		Iterator<Double>it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());*/
	}
	
	public static void main(String[] args) {
		ExceptionEx2 e = new ExceptionEx2();
		e.NoSuchElementException();
	}
}
