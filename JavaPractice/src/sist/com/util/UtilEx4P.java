package sist.com.util;

import java.util.List;
import java.util.Vector;

public class UtilEx4P {
	Object []elementData;
	
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	public UtilEx4P() {
		elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public void utilAction1() {
		List<String> list = new Vector<String>();
		list.add("");
	}
			
}
