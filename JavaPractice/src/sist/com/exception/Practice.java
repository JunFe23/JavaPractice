package sist.com.exception;

public class Practice {
	void practiceEx1() {
		try {
			
		int i = System.in.read(); // System.in.read는 아스키 코드로 받음
			System.out.println((char)i);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	void practiceEx2(int data) {
		String value = data>23?null:"HBD";
		try {
			data=data/data;
			System.out.println(value.charAt(5));
			
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("StringIndexOutOfBoundsException");
			System.out.println(value.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			System.out.println("data 값을 확인");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("data 0은 안돼요.");
		} finally {
			System.out.println("끝~");
		}
	}
	
	void practiceEx3() {
		String str1 = null;
		String str2 = "eight";
		
		try {
			str2.charAt(-10);
			
		} catch (StringIndexOutOfBoundsException e) { // str2의 문자열이 index가 0~4인데 그범위를 넘어서면 발생.
			System.out.println("StringIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (NullPointerException e) { // str1이 null인데 거기에 charAt을 하면 존재하지않으므로 발생.
			System.out.println("NullPointerException");
			e.printStackTrace();
		} finally {
			System.out.println("The End");
		}
	} 
	
	public static void main(String[] args) {
		Practice p = new Practice();
		p.practiceEx1();
		//p.practiceEx2(0);
		//p.practiceEx3();
	}
}
