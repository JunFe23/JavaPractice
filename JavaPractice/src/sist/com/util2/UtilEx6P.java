package sist.com.util2;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;


public class UtilEx6P {
	Scanner scanner = new Scanner(System.in);
	
	void UtilEx6P() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Properties properties = new Properties();
		
		map.put("JunFe", 77);
		//System.out.println(map);
		
		properties.put("Å·¼ººó", 7);
		properties.put("Á¤¿¬", "~~~~");
		properties.put("½Ö¿ë", "~!!~");
		//System.out.println(properties);
		//System.out.println(((String)properties.get("½Ö¿ë")).concat("Ãß°¡³»¿ë"));
		//System.out.println(properties);
		
		Hashtable<Double, String> hb = new Hashtable<Double, String>();
		Hashtable<Integer, Double> hb1 = new Hashtable<Integer, Double>();
		hb.put(20.2, "Jun");
		hb.put(1000.2, "Cheol");
		
		//System.out.println(hb.entrySet());
		//System.out.println(hb1.entrySet());
		//System.out.println(hb);
		
		/*for(Entry<Double, String> e: hb.entrySet()) {
			System.out.println(e.getKey() + " " +e.getValue());
		}*/
		
		/*Enumeration<String> e = hb.elements();
		Enumeration<Double> ek = hb.keys();
		while(ek.hasMoreElements()) {
			System.out.println(ek.nextElement());
		}
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}*/
		
	}
	
	void test() {
		int []m = {1,2,3,4,5};
		for(int i: m) {
			System.out.println(i);
		}
	}
	
	
	Vector<LinkedHashMap<String, Object>> v = new Vector<LinkedHashMap<String, Object>>();
	public void add() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		System.out.println("Name : ");
		map.put("Name", scanner.next());
		System.out.println("Age : ");
		map.put("Age", scanner.next());
		System.out.println("Addrees : ");
		map.put("Address", scanner.next());
		v.addElement(map);
	}
	
	void disp() {
		for(HashMap<String, Object> map: v) {
			for(Entry<String, Object> e : map.entrySet()) {
				System.out.println(e);
			}
		}
	}
	
	void menu() {
		while(true) {
			System.out.println("1.Add 2.List");
			switch (scanner.nextInt()) {
			case 1:
				add();
				break;
			
			case 2:
				disp();
				break;

			default:
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new UtilEx6P().menu();
		
		/*UtilEx6P u = new UtilEx6P();
		u.UtilEx6P();*/
	}
}
