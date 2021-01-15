package sist.com.exception;
//Compile, RunTime
public class ExceptionEx1 {
	
	public void interruptedExcetion() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
	public void arrayIndexOutOfBoundsException() {
		int []m=new int [5];
		for (int i = 0; i <= m.length; i++) { 
			try {
				m[i]=i+1;
				System.out.println("Test");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}catch(Exception e) {
				
			}
			
		}
	}
	
	public void arithmeticException() {
		int []m=new int[10];
		for (int i = 0; i < m.length; i++) {
			//m[i]=100/(int)Math.random()*500; //0으로 나눴을 때 나는 exception
			m[i]=10000/(int)(Math.random()*500); //이게 맞음.
			
		}
		for(int i:m) {
			System.out.println(i);
		}
	}
	public void NumberFormatException(String code) {
		int rs=Integer.parseInt(code.substring(0, 3))+Integer.parseInt(code.substring(4,6));
		System.out.println(rs);
	}
	public static void main(String[] args) {
		ExceptionEx1 e = new ExceptionEx1();
		//e.interruptedExcetion();
		//e.arrayIndexOutOfBoundsException();
		//e.arithmeticException();
		e.NumberFormatException("F52C93");
		
	}
}
