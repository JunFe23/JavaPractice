package sist.com.exception;

public class ExceptionEx3Practice {
	public void ExceptionEx3p(String s) {
		try {
			String value = s=="�ٺ�"? "�����?":null;
			System.out.println(value.charAt(0));
			
		}catch(NullPointerException e) {
			System.out.println("NullPointerException catch");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException catch");
		}catch(Exception e) {
			System.out.println("Exception catch");
		}finally{
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx3Practice ExceptionEx3Practice = new ExceptionEx3Practice();
		ExceptionEx3Practice.ExceptionEx3p("��");
	}
}
