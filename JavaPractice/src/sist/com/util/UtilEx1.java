package sist.com.util;

import java.util.*;

//LIST, MAP, SET
public class UtilEx1 {
	public void utilExmethod1() {
		ArrayList<Double>list1 = new ArrayList<Double>(10); // elementsData Double형 배열
		//ArrayList<String>list2 = new ArrayList<String>(); // elementsData String형 배열
		
		HashMap<Integer, String>map=new HashMap<Integer,String>(); // map은 key|value
		
		list1.add(1.4);
		list1.add(2.5);
		list1.add(3.5);
		list1.add(4.5);
		list1.add(5.5);
		list1.add(1.5);
		list1.set(2, 7.5);
		
		map.put(1, "JunFe");
		map.put(2, "수정");
		map.put(3, "윤하");
		map.put(7, "승우");
		
		
		/*System.out.println(list1.get(3));
		System.out.println(map.get(5));
		*/
		/*System.out.println(list1.iterator().next()); // 반복객체 1.5
		System.out.println(list1.iterator().next()); //1.5*/
		
		Iterator i=map.entrySet().iterator(); // 반복자
		while(i.hasNext()) { // hasNext : 다음 노드가 있으면 true
			System.out.println(i.next());
		}
		
		System.out.println(list1.toString());
		System.out.println(map);
		
		
		/*Object[]a= {}; 
		System.out.println(a[0]); // Null은 아니지만 실제 메모리가 만들어지지 않은 상태라  ArrayIndexOutOfBoundsException 발생
*/	}
	public void utilExMethod2() {
	}
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
		u.utilExmethod1();

	}
}
