package sist.com.exception;

public class Practice {
	void practiceEx1() {
		try {
			
		int i = System.in.read(); // System.in.read�� �ƽ�Ű �ڵ�� ����
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
			System.out.println("data ���� Ȯ��");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("data 0�� �ȵſ�.");
		} finally {
			System.out.println("��~");
		}
	}
	
	void practiceEx3() {
		String str1 = null;
		String str2 = "eight";
		
		try {
			str2.charAt(-10);
			
		} catch (StringIndexOutOfBoundsException e) { // str2�� ���ڿ��� index�� 0~4�ε� �׹����� �Ѿ�� �߻�.
			System.out.println("StringIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (NullPointerException e) { // str1�� null�ε� �ű⿡ charAt�� �ϸ� �������������Ƿ� �߻�.
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
