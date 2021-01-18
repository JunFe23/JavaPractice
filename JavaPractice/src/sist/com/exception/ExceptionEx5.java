package sist.com.exception;

public class ExceptionEx5 {
	public void exceptionEx1(int data)  { // ���� catch�� ǥ��
		try {
			System.out.println(data);
			Thread.sleep(1000);
			if(data==10) {
				throw new InterruptedException(); // throw�� ������ exception�� �߻���Ű�� ��, throws�� ������ ��
			}else if(data==20) {
				throw new ArrayIndexOutOfBoundsException();
			}else if(data==30) {
				throw new ArithmeticException();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("InterruptedException");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}
		
	}
	
	public void exceptionEx2(int data)  { // catch 1���� ǥ��.
		try {
			System.out.println(data);
			Thread.sleep(1000);
			if(data==10) {
				throw new InterruptedException(); // throw�� ������ exception�� �߻���Ű�� ��, throws�� ������ ��
			}else if(data==20) {
				throw new ArrayIndexOutOfBoundsException();
			}else if(data==30) {
				throw new ArithmeticException();
			}
		} catch (Exception e) {
			// TODO: handle exception
			if(e instanceof InterruptedException) {
				System.out.println("InterruptedException");
			}
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			if(e instanceof ArithmeticException) {
				System.out.println("ArithmeticException");
			}
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		ExceptionEx5 e = new ExceptionEx5();
		//e.exceptionEx1(20);
		e.exceptionEx2(30);
	}
}
