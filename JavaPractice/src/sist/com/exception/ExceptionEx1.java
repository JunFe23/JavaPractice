package sist.com.exception;
//Compile은 실행 전에 이미 error, RunTime은 실행 도중에 발생함. 
public class ExceptionEx1 {
	
	public void interruptedExcetion() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		} // for문
	}
	public void arrayIndexOutOfBoundsException() {
		// 5개의 배열공간을 생성했는데 6번재에 값을 넣으려고 하니깐 arrayIndexOutOfBoundsException 발생
		int []m=new int [5]; // [] [] [] [] []
		for (int i = 0; i <= m.length; i++) { 
			try {
				m[i]=i+1;
				System.out.println("Test");				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("바보야");
				e.printStackTrace(); // error났을 때 내용 보여줌
			}catch(Exception e) {
				
			}
			
		} // for문
	}
	
	public void arithmeticException() {
		// 0으로 값을 나누었을 때 발생하는 arithmeticException
		int []m=new int[10];
		for (int i = 0; i < m.length; i++) {
			//m[i]=100/(int)Math.random()*500; // 0으로 나눴을 때 나는 exception 
			// (int)Math.random()이 제일 먼저 실행돼서 그 값이 0이됨
			m[i]=10000/(int)(Math.random()*500); // 이게 맞음.
			
		}
		for(int i:m) {
			System.out.println(i);
		}
	}
	public void NumberFormatException(String code) {
		int rs=Integer.parseInt(code.substring(0, 3))+Integer.parseInt(code.substring(4,6));
		// code 0~3번째 사이 'F52가 지정되어 substring을 통해 String형으로 보내지고, 
		// 그 String형이 Integer.parseInt를 통해 Integer형으로 변환되는데 0번째 F가 문자여서 Integer형으로 변환되지 못함
		// NumberFormatException
		System.out.println(rs);
	}
	public static void main(String[] args) {
		ExceptionEx1 e = new ExceptionEx1();
		e.interruptedExcetion();
		//e.arrayIndexOutOfBoundsException();
		//e.arithmeticException();
		//e.NumberFormatException("F52C93");
		
	}
}
