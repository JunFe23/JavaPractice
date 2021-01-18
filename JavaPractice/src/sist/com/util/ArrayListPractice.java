package sist.com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class ArrayListPractice {
	public void practiceEx1() {
		ArrayList<Double>a = new ArrayList<Double>();
		ArrayList<Double>b = new ArrayList<Double>();
		
		a.add(10.5);
		a.add(20.5);
		a.add(20.5);
		a.add(20.5);
		a.add(20.5);
		a.add(5, 10.5);
		
		b.add(4.5);
		b.add(9.5);
		b.add(7.5);
		
		a.addAll(b);
		a.addAll(2, b);
		
		System.out.println(a);
		
		/*a.clear();
		System.out.println(a);*/
		
		ArrayList<Double> clone = (ArrayList<Double>)a.clone(); // a¸¦ º¹Á¦
		System.out.println(clone.get(0));
		
		if(a.contains(9.5)) System.out.println("yes");
		
		if(a.isEmpty()) System.out.println("Empty");
		
		ListIterator<Double>c=a.listIterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		
		HashMap<Double, Integer> h = new HashMap<Double, Integer>();
		h.put(2.1, 5);
		//System.out.println(h.get(2.1));
		
	}
	
	public static void main(String[] args) {
		ArrayListPractice a = new ArrayListPractice();
		a.practiceEx1();
	}
}
