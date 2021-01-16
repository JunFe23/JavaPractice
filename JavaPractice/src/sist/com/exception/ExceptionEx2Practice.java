package sist.com.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionEx2Practice {

	static int i=2;
	
	
	
	public ExceptionEx2Practice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionEx2Practice(int i) {
		super();
		// TODO Auto-generated constructor stub
		this.i+=i;
		System.out.println(i);
	}

	public void NosuchElementException() {
		ArrayList list = new ArrayList(); //16개 정도의 노드가 생성
		/*list.add("JunFe");
		list.add(23);
		list.add(11);
		list.add(3.23);
		if(list.get(3) instanceof Integer)
			System.out.println(Double.parseDouble(((String.valueOf((Double)list.get(3))))));
			System.out.println(list.get(0));
			
			Double d=(Double)list.get(3)+2;
			System.out.println(d);*/
		
		list.add(2.89);
		list.add(5.54);
		list.add(6.20);
		list.add(61.9);
		System.out.println(list.get(5));//IndexOutOfBoundsExcepiton
		//System.out.println(list);
		
		Iterator<Double>it=list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next()); //NoSuchElementException
		
			
			
	}
	
	public static void main(String[] args) {
		//new ExceptionEx2Practice(1); // 클래스를 복제하면 생성자 실행.
		//System.out.println(i);
		ExceptionEx2Practice e = new ExceptionEx2Practice();
		e.NosuchElementException();
	}
}