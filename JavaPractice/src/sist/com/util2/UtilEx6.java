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
		Properties properties = new Properties(); // 아무거나 다 받을 때 편함, 기본적으로 object랑 keyvalue로 되어있다.
		
		properties.put("인성", "777.777.77.777");
		properties.put("수정", "777.777.77.777");
		properties.put("성빈", "777.777.77.777");
		properties.put("태연", "777.777.77.777");
		
		//System.out.println(properties);
		System.out.println(((String)properties.get("인성")).concat("---"));
		System.out.println(properties); // String은 final이기 때문에 위의 concat으로 properties 안의 값이 변한 것은 아니다!!
		
		/*Hashtable<Double, String> hb = new Hashtable<Double, String>();
		hb.put(10.5, "JunFe");
		hb.put(50.5, "CheolFe");
		hb.put(90.5, "KimFe");*/
				
		/*for(Entry<Double, String> e : hb.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}*/
		
		/*Enumeration<String> e = hb.elements();
		Enumeration<Double> ek = hb.keys();
		while(ek.hasMoreElements()) { // key값만 
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
