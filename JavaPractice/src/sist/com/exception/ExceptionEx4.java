package sist.com.exception;

import java.io.IOException;

public class ExceptionEx4 {
	
	public void CloneNotSupportedException() {
		Com com1 = new Com("�ȳ�");
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
	
	public void exceptionEx1() throws InterruptedException, IOException, CloneNotSupportedException { // ������ ������ ����, ���⼭�� exception 2��
		Thread.sleep(1000);
		System.in.read();
		this.clone();
		
	}
	
	public void exceptionEx2() throws InterruptedException, IOException, CloneNotSupportedException { // exception3��
		exceptionEx1();
	}
	
	public void exceptionEx3() throws InterruptedException, IOException, CloneNotSupportedException{ // main���� ����
		exceptionEx2();
	}
	
	
	public static void main(String[] args) throws Exception { // �׷� ���� ������, Exception �ϳ��� �� ���� �� ����. Throwable�ε� ���� �� �ִ�.
		ExceptionEx4 e = new ExceptionEx4();
		e.CloneNotSupportedException();
		e.exceptionEx3();
	}
}
