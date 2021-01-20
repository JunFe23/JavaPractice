package sist.com.util;

import java.util.HashSet;
import java.util.Iterator;

// 자료구조 List 선형, Map, Set(순서가 없고, 중복을 허용하지 않는다. 주머니나 포켓볼 모양의 자료구조)
// 비선형 자료구조 - 그래프
public class UtilEx2 {
	
	public void process1() { //map 정말 좋은 자료구조, 허나 너무 남발하면 가독성이 떨어짐.
		String []str = {"Java","Oracle","Java","Jsp","Spring","Spring","Spring"};
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		
		//System.out.println(set1.add(str[0])); // true
		//System.out.println(set1.add(str[0])); // false
		
		
		/*set1.add(str[0]);
		set1.add(str[0]);
		
		System.out.println(set1);*/
		
		
		for (int i = 0; i < str.length; i++) { // set은 중복을 허용하지 않기 때문에 
			if(!set1.add(str[i])) { // set1이 add가 안되면 set2로 감.
				if(!set2.add(str[i])) {
					set3.add(str[i]);
				}
			}
		}
//		System.out.println(set1);
//		System.out.println(set2);
//		System.out.println(set3);
		
//		for(String s:set1) {
//			System.out.println(s);
//		}
		
		
//		for(int i=0;i<set1.size();i++) { //불가
//			System.out.println(set1.);
//		}
		
		/*Iterator<String> i1 = set1.iterator(); // set1으로 반복자를 만들어라
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		set2.iterator();*/
		
		System.out.println(set1.iterator().next());
		System.out.println(set1.iterator().next());
		
		set2=(HashSet<String>)set1.clone(); // set1을 set2에 복제
		System.out.println(set1);
		System.out.println(set2);
		
		set1.clear(); // clear는 null로 만들어버린다.
		System.out.println(set1.toString());
		
		System.out.println(set1);
		System.out.println(set1.contains("Java")); // 일치하는 자료가 있는지 확인
	}
	
	public void process2() {
		HashSet<Person>set1=new HashSet<Person>();
			
		set1.add(new Person("JunFe"));
		set1.add(new Person("JunFe"));
		set1.add(new Person("JunFe"));
		System.out.println(set1); // 3
		System.out.println(set1.contains(new Person("JunFe"))); // false
		
		Person p1 = new Person("JunFe");
		Person p2 = new Person("JunFe");
		Person p3 = new Person("JunFe");
		
		set1.add(p1);
		set1.add(p2);
		set1.add(p1);
		set1.add(p1);
		
		System.out.println(set1.size()); // 5
		System.out.println(set1.contains(p2)); // true
	}
	
	public void process3() {
		HashSet<Double>set=new HashSet<Double>();
		HashSet<Double>set2=new HashSet<Double>();
		HashSet<Double>set3=new HashSet<Double>();
		
		set.add(95.5);
		set.add(96.5);
		set.add(92.5);
		set.add(95.5);
		
		set2.add(95.3);
		set2.add(92.3);
		set2.add(91.3);
		
		/*
		 * System.out.println(set); // 순서없이 출력, 중복 허용하지 않음.
		 * System.out.println(set.equals(set)); // true
		 * System.out.println(set.equals(set2)); // false
		 * System.out.println(set3.equals(null)); // false
		 */		
		System.out.println(set.remove(95.5));
		//set.remove(95.5);
		System.out.println(set); // 95.5 삭제
		System.out.println(set.remove(95.5));
		
		
	}
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
		//u.process1();
		//u.process2();
		u.process3();
	}
}
