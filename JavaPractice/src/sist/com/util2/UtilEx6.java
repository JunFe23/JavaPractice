package sist.com.util2;


import java.util.Map.Entry;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;

import sist.com.algorithm1.Add;

public class UtilEx6 {
	Scanner scanner = new Scanner(System.in);
	public void UtilEx1() {
		HashMap<String, Integer> map;
		Properties properties = new Properties(); // �ƹ��ų� �� ���� �� ����, �⺻������ object�� keyvalue�� �Ǿ��ִ�.
		
		properties.put("�μ�", "777.777.77.777");
		properties.put("����", "777.777.77.777");
		properties.put("����", "777.777.77.777");
		properties.put("�¿�", "777.777.77.777");
		
		//System.out.println(properties);
		System.out.println(((String)properties.get("�μ�")).concat("---"));
		System.out.println(properties); // String�� final�̱� ������ ���� concat���� properties ���� ���� ���� ���� �ƴϴ�!!
		
		/*Hashtable<Double, String> hb = new Hashtable<Double, String>();
		hb.put(10.5, "JunFe");
		hb.put(50.5, "CheolFe");
		hb.put(90.5, "KimFe");*/
				
		/*for(Entry<Double, String> e : hb.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}*/
		
		/*Enumeration<String> e = hb.elements();
		Enumeration<Double> ek = hb.keys();
		while(ek.hasMoreElements()) { // key���� 
			System.out.println(ek.nextElement());
		}*/
		
	}
	
	Vector<HashMap<String, Object>> v = new Vector<HashMap<String, Object>>();
	public void add() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println("Name : ");
		map.put("Name", scanner.next());
		System.out.println("Age : ");
		map.put("Age", scanner.next());
		System.out.println("Address : ");
		map.put("Address", scanner.next());
		v.addElement(map);
	}
	
	public void disp() {
		for(HashMap<String, Object> map:v) {
			for(Entry<String, Object> e:map.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}System.out.println();
		}
	}
	
	public void menu() {
		while(true) {
			System.out.println("1.Add 2.List");
			switch (scanner.nextInt()) {
			case 1:
				add();
				break;

			case 2:
				disp();
				break;
			}
		}
	}
	public static void main(String[] args) {
		UtilEx6 u = new UtilEx6();
		//u.UtilEx1();
		u.menu();
	}
}
