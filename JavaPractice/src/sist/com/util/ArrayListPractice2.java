package sist.com.util;

import java.util.ArrayList;
import java.util.ListIterator;

import sist.com.obj.core1.Main;

public class ArrayListPractice2 {
	public void practiceEx1() {
		ArrayList<Double>a = new ArrayList<Double>(); // Double���� �޴� ArrayList ��ü �����ؼ� a�� ����
		ArrayList<Double>b = new ArrayList<Double>(); 
		
		a.add(10.5); // a�� list�� �� �߰�
		a.add(20.5);
		a.add(30.5);
		//System.out.println(a.get(0)); // 10.5
		
		b.add(23.5);
		b.add(34.5);
		b.add(49.5);
		
		//System.out.println(a);
		a.addAll(b); // b�� ��°�� a�� �߰�
		//System.out.println(a); //  b�� �߰��� a�� ���
		
		a.clear(); // a�� clear
		//System.out.println(a); // []
		
		ArrayList<Double> clone = (ArrayList<Double>)a.clone(); // ArrayList<Double>���� a�� �����ؼ�  ArrayList<Double>���� clone���� ����
		//System.out.println(clone); // []�� ���� �ż� [] ���
		
		a.add(20.2);
		a.add(50.4);
		a.add(7.77);
		
		if(a.contains(7.77)) System.out.println("Lucky!"); // 7.77�� list�� ���ԵǾ� �ִ��� Ȯ���ϴ� .contains
		
		if(a.isEmpty()) System.out.println("Empty!"); // list�� ��� �ִ��� Ȯ���ϴ� .IsEmpty
		else System.out.println("No Empty!"); // �� ����� �� ���
		
		ListIterator<Double> c= a.listIterator(); // a�� �ݺ��ڸ� ���� c�� ����
		while(c.hasNext()) // list���� ���� ���� �ִ��� Ȯ���ϴ� ���� hasNext()
		{
			System.out.println(c.next()); // �������� �����.
		}
	}
	
	public static void main(String[] args) {
		ArrayListPractice2 a = new ArrayListPractice2();
		a.practiceEx1();
		
	}
}
