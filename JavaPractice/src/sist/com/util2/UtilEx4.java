package sist.com.util2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class UtilEx4 {

	public void listMethod1() {
		Vector<String> v1 = new Vector<String>();
		v1.addElement("준철");
		v1.addElement("우석");
		v1.addElement("지훈");
		v1.addElement("동진");
		v1.addElement("민균");
		
		/*for (int i = 0; i < v1.size(); i++) {
			//System.out.println(v1.get(i));
			System.out.println(v1.elementAt(i));
		}*/
		Iterator<String> i = v1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		i = v1.iterator(); // 기존 변수 i는 그대로 가면서 iterator 객체 새로 생성
		for(;i.hasNext();) {
			System.out.println(i.next());
		}
		System.out.println();
		
		Enumeration<String>e = v1.elements(); // 이것 또한 반복자다. StringTokenizer랑 비슷 
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		System.out.println();
		System.out.println(v1.firstElement()); // 첫번째 값 = "준철"
		int a = v1.indexOf("동진")+v1.indexOf("준철"); // 준철 index = 0, 동진 index = 3
		System.out.println(a); // 0+3 = 3
		
		System.out.println();
		v1.insertElementAt("상구", 5); // index 5번에 "상구" 추가
		System.out.println(v1); // 추가된 결과
		
		v1.set(0, "고구마"); // index 0의 값을 "고구마" 변경
		System.out.println(v1); // 변경됨 확인
		
	}
	
	public void listMethod1_1() {
		Vector<String> v1 = new Vector<String>();
		v1.addElement("준철");
		v1.addElement("우석");
		v1.addElement("지훈");
		v1.addElement("동진");
		v1.addElement("민균");
		
		ListIterator<String> i = v1.listIterator();
		System.out.println(i.nextIndex()); // 0 -> 아직 next 안 해서 0
		i.next();
		System.out.println(i.nextIndex()); // 1
		
		System.out.println();
		while(i.hasNext()) // 순서대로 갔다가
			System.out.println(i.next());
		while(i.hasPrevious()) // 역주행
			System.out.println(i.previous());
		
			
		System.out.println(); // nextIndext는 cursor값, previousIndex는 cursor - 1
		System.out.println(i.nextIndex()); // next: 0, previous : -1
		System.out.println(i.next()); // next: 1, previous : 0
		System.out.println(i.nextIndex());
		System.out.println(i.next()); // next: 2, previous : 1
		System.out.println(i.next()); // next: 3, previous : 2
		System.out.println(i.previousIndex());
		System.out.println(i.nextIndex());
		System.out.println(i.previous()); // next: 2, previous : 1
		System.out.println(i.previousIndex());
		System.out.println(i.previous()); // next: 1, previous : 0
		System.out.println(i.previous()); // next: 0, previous : -1  맨 처음 상태
		System.out.println(i.previous()); // NoSuchElementException 
		System.out.println(i.hasPrevious()); // 이전이 있으면 true, 없으면 false
		
	}
	
	
	public static void main(String[] args) {
		UtilEx4 u = new UtilEx4();
		//u.listMethod1();
		u.listMethod1_1();
	}
}
