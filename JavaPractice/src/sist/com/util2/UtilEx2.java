package sist.com.util2;

import java.util.ArrayList;
import java.util.Iterator;

// List
public class UtilEx2 {
	
	public void actionEx1() {
		ArrayList<String>list1 = new ArrayList<String>(); // elementData = {}
		ArrayList<String>list2 = new ArrayList<String>(5); // elementData [][][][][]
		list1.add("À±ÇÏÂ¯");
		list1.add("À±ÇÏÂ¯2");
		list1.add("À±ÇÏÂ¯3");
		list2.add("JunFe");
		list2.add("Áö¿¬Â¯");
		list2.add("¼öÁ¤Â¯");
		//System.out.println(list2.size()); //3
		Iterator<String> i = list1.iterator(); // ¹İº¹ÀÚ  // cursor || lastRet || expectedModCount
		//list1.remove(0); // ConcurrentModificationException // modcount¶û expectedmodcount¶û ¾È¸Â°Ô µÅ¼­ ¹ß»ı.
		//i.remove(); // IllegalStateExcepion -> iterator »ç¿ëµµ ¾ÈÇÏ°í »èÁ¦ÇÏÁö¸¶¶ó
		i.next(); // À±ÇÏÂ¯
		i.next(); // À±ÇÏÂ¯2
		i.remove(); // À±ÇÏÂ¯ »èÁ¦
		System.out.println(i.next()); // À±ÇÏÂ¯3sl
		
		//System.out.println(i.hasNext()); // true
		//System.out.println(i.next());
		i=list1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//System.out.println(i.next()); // NoSuchElementException
		
		
		/*list1.add("À±ÇÏÂ¯"); // ¹İº¹ÀÚ ¸¸µé¾î ³õ°í add·Î list1À» Ãß°¡ÇÏ¸é ¹İº¹ÀÚ °³¼ö¶û ¾È¸Â¾Æ¼­
		System.out.println(i.next()); // ConcurrentModificationException*/
		}
	
	public void actionEx1P() {
		ArrayList<String>list1 = new ArrayList<String>(); // elementData = {}
		ArrayList<String>list2 = new ArrayList<String>(5); // elementData [][][][][]
		list1.add("À±ÇÏÂ¯");
		list1.add("À±ÇÏÂ¯2");
		list1.add("À±ÇÏÂ¯3");
		
		list2.add("JunFe");
		list2.add("Áö¿¬Â¯");
		list2.add("¼öÁ¤Â¯");
		
		Iterator<String> i = list1.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		i.remove();
		System.out.println(list1);
		
	}
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
		//u.actionEx1();
		u.actionEx1P();
	}
	
}
