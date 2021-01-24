package sist.com.util2;

import java.util.Vector;

public class UtilEx4P {
	
	public void listMethod1() {
		Vector<String> v1 = new Vector<String>();
		v1.add("¡ÿ√∂");
		v1.addElement("¡§ø¨");
		
		
		
		System.out.println(v1);
		
	}
	
	public static void main(String[] args) {
		UtilEx4P u = new UtilEx4P();
		u.listMethod1();
	}
}
