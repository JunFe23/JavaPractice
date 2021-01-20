package sist.com.util;

import java.util.ArrayList;
import java.util.ListIterator;

import sist.com.obj.core1.Main;

public class ArrayListPractice2 {
	public void practiceEx1() {
		ArrayList<Double>a = new ArrayList<Double>(); // Double형만 받는 ArrayList 객체 생성해서 a로 받음
		ArrayList<Double>b = new ArrayList<Double>(); 
		
		a.add(10.5); // a의 list에 값 추가
		a.add(20.5);
		a.add(30.5);
		//System.out.println(a.get(0)); // 10.5
		
		b.add(23.5);
		b.add(34.5);
		b.add(49.5);
		
		//System.out.println(a);
		a.addAll(b); // b를 통째로 a에 추가
		//System.out.println(a); //  b가 추가된 a의 모습
		
		a.clear(); // a를 clear
		//System.out.println(a); // []
		
		ArrayList<Double> clone = (ArrayList<Double>)a.clone(); // ArrayList<Double>형의 a를 복제해서  ArrayList<Double>형인 clone으로 받음
		//System.out.println(clone); // []이 복제 돼서 [] 출력
		
		a.add(20.2);
		a.add(50.4);
		a.add(7.77);
		
		if(a.contains(7.77)) System.out.println("Lucky!"); // 7.77이 list에 포함되어 있는지 확인하는 .contains
		
		if(a.isEmpty()) System.out.println("Empty!"); // list가 비어 있는지 확인하는 .IsEmpty
		else System.out.println("No Empty!"); // 안 비었을 시 출력
		
		ListIterator<Double> c= a.listIterator(); // a의 반복자를 만들어서 c로 받음
		while(c.hasNext()) // list에서 다음 값이 있는지 확인하는 논리형 hasNext()
		{
			System.out.println(c.next()); // 다음값을 출력함.
		}
	}
	
	public static void main(String[] args) {
		ArrayListPractice2 a = new ArrayListPractice2();
		a.practiceEx1();
		
	}
}
