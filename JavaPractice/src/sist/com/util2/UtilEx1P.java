package sist.com.util2;

public class UtilEx1P {

	public void actionEx1() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT EMPNO");
		sb.append(" " + 1);
		sb.insert(5, 5<3);
		sb.deleteCharAt(0);
		System.out.println(sb);
	}
	
	
	
	public static void main(String[] args) {
		UtilEx1P u = new UtilEx1P();
		u.actionEx1();
		
	}
}
