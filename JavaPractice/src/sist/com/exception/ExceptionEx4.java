package sist.com.exception;

import java.io.IOException;

public class ExceptionEx4 {
	
	public void CloneNotSupportedException() {
		Com com1 = new Com("안녕");
		System.out.println(com1);
		try {
			Com com2 = (Com)com1.clone();
			System.out.println(com2);
			System.out.println(com1==com2);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	public void exceptionEx1() throws InterruptedException, IOException, CloneNotSupportedException { // 실행한 곳으로 던짐, 여기서는 exception 2로
		Thread.sleep(1000);
		System.in.read();
		this.clone();
		
	}
	
	public void exceptionEx2() throws InterruptedException, IOException, CloneNotSupportedException { // exception3로
		exceptionEx1();
	}
	
	public void exceptionEx3() throws InterruptedException, IOException, CloneNotSupportedException{ // main으로 던짐
		exceptionEx2();
	}
	
	
	public static void main(String[] args) throws Exception { // 그럼 나도 던질래, Exception 하나로 다 받을 수 있음. Throwable로도 받을 수 있다.
		ExceptionEx4 e = new ExceptionEx4();
		e.CloneNotSupportedException();
		e.exceptionEx3();
	}
}
