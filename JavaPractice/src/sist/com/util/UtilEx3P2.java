package sist.com.util;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


// Key | Value
//  1     100
//	2	  200
//	3	  500
public class UtilEx3P2 {
	double []sum= new double [5];
	double []avg= new double [5];
	public void utilMethod1() {
		HashMap<Integer, String>map = new HashMap<Integer, String>();
		HashMap<Integer, String>map2 = new HashMap<Integer, String>();
		
		map.put(1, "Jun");
		map.put(2, "Âû¸®");
		map.put(2, "³ª°¡");
		map.put(3, map2.put(5, "Á¹¸®"));
		
		System.out.println(map);
		System.out.println(map2);
		
		System.out.println(map.keySet());
		
		Iterator<Integer> i = map.keySet().iterator(); // keySet : key¸¦ setÀ¸·Î ¹ŞÀ½.
		while(i.hasNext()) {
			Integer key = i.next();
			System.out.println("key = " + key + ": " + map.get(key));
		}
		
		Iterator<Entry<Integer, String>> j = map.entrySet().iterator(); // ¿Ö¾ÈµÅ?
		while(i.hasNext()) {
		Entry<Integer, String>entry=j.next();
			System.out.println(entry.getValue()); // key¾øÀÌ value¸¸ »ÌÀ» ¼ö ÀÖ´Ù.
		}
		System.out.println(map.entrySet()); // key¿Í value¸¦ entrysetÀ¸·Î ¹­À½

		Set<Entry<Integer, String>> s; map.entrySet();
		System.out.println(map.get(1));
	}
	
	public HashMap<Integer, ArrayList<HashMap<String, Double>>> utilMethod2() {
		
		HashMap<Integer, ArrayList<HashMap<String, Double>>>map=new HashMap<Integer, ArrayList<HashMap<String,Double>>>();
		ArrayList<HashMap<String, Double>>list1=new ArrayList<HashMap<String, Double>>();
		list1.add(dataInput("Âû¸®", 24.7));
		list1.add(dataInput("JunFe", 323.0));
		list1.add(dataInput("¼ººó", 100.7));
		//System.out.println(list1);
		//System.out.println(list1.get(0).get((list1.get(0).keySet())));
		
		
		
		for(int i=0;i<list1.size();i++) {
			Iterator<String> a=list1.get(i).keySet().iterator();
			while(a.hasNext()) {
				sum[0]+=list1.get(i).get(a.next());
			}
		}
		avg[0]=sum[0]/(double)(list1.size());
		//System.out.println(sum[0]);
		//System.out.println(avg[0]);
		//System.out.println(list1.get(0).get("Âû¸®"));
		
		ArrayList<HashMap<String, Double>>list2=new ArrayList<HashMap<String, Double>>();
		list2.add(dataInput("¼ºÁØ", 124.7));
		list2.add(dataInput("½Â¿ì", 354.5));
		list2.add(dataInput("Á¤¿¬", 745.7));
		list2.add(dataInput("Áö¿¬", 123.7));
		list2.add(dataInput("¼öÇö", 456.7));
		
		for(int i=0;i<list2.size();i++) {
			Iterator<String> a=list2.get(i).keySet().iterator();
			while(a.hasNext()) {
				sum[1]+=list2.get(i).get(a.next());
			}
		}
		avg[1]=sum[1]/(double)(list2.size());
		
		ArrayList<HashMap<String, Double>>list3=new ArrayList<HashMap<String, Double>>();
		list3.add(dataInput("½Ö¿ë", 524.7));
		list3.add(dataInput("Áı¿¡", 341.0));
		list3.add(dataInput("°¡ÀÚ", 562.7));
		
		for(int i=0;i<list3.size();i++) {
			Iterator<String> a=list3.get(i).keySet().iterator();
			while(a.hasNext()) {
				sum[2]+=list3.get(i).get(a.next());
			}
		}
		avg[2]=sum[2]/(double)(list3.size());
		
		map.put(1, list1);
		map.put(2, list2);
		map.put(3, list3);
		
		return map;
		
	}
	public void disp(HashMap<Integer, ArrayList<HashMap<String, Double>>>map) {
		Iterator<Integer> i = map.keySet().iterator();
		int z=0;
		while(i.hasNext()) {
			Integer j=i.next();
			System.out.println(map.get(j));
			System.out.println("ÇÕ : " + sum[z] + "Æò±Õ : " + avg[z]);
			z++;
		}
	}
	
	public HashMap<String, Double> dataInput(String s,Double d){
		HashMap<String, Double>map=new HashMap<String, Double>();
		map.put(s, d);
		return map;
		
	}
	
	public static void main(String[] args) {
		UtilEx3P2 u = new UtilEx3P2();
		//u.utilMethod1();
		u.disp(u.utilMethod2());
		
	}
}
