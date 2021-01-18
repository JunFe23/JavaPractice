package sist.com.exception;

public class ExceptionEx6 {
	
	public void charIndex(String str, int index) {
		if(index<0|| index>=str.length()) {
			try {
				throw new StringUserException();	// 사용자 정의로 만든 Exception						
			} catch (StringUserException e) {
				// TODO: handle exception
				//System.out.println(e.getMessage());
				e.printStackTrace();
				return;
			} // catch
		} // if문
		System.out.println(str.charAt(index)); // return 안하면 이게 실행돼서 trace가 나옴
	}
	
	public void portUser(int port) {
		if(port>=0 && port<=5000) {
			try {
				throw new PortUserException(port);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				return;
			}
		}
		System.out.println(port + "   Success Port");
	}
	
	public void runTimeException() {
		try {
			System.out.println("Test");
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e) { // Java1.7버전부터 가능
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx6 e = new ExceptionEx6();
		//e.charIndex("AbcDeF",5);
		//e.portUser(5001);
		e.runTimeException();
	}
}
