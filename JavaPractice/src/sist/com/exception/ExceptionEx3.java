package sist.com.exception;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

// Exception ( try catch finally throws throw userException
// finally로는 무조건 간다.

// Compile, RunTime
public class ExceptionEx3 {
	
	public void exceptionEx1() {
		System.out.println("Data : ");
		try { // 시도해서 예외 나면 catch거쳐서 finally, 안 나면 바로 finally
			int i = System.in.read(); // 콘솔에서 입력 받아서 변수 i로 받음.
			System.out.println((char)i); // char형변환으로 1글자만 나옴.
		}catch(IOException e) { // 예외가 발생하면 catch 실행
			e.printStackTrace();
		}finally { //'꼭', 예외가 발생하든 안하든 진행.
			System.out.println("Finally");
		}
		
	} // exceptionEx1
	
	
	public void exceptionEx2(int data) { // data값이 50보다 작으면 value에 값이 안들어감
		try{
			String value = data>=50?"Java":null;
			data=data/data; // data에 0 넣으면 여기서 arithmeticException 발생해서 Exception catch쪽 catch로 감.
			System.out.println(value.charAt(0)); // value값이 없으면 NullPointException 발생.
			return; // return 해도 finally로는 간다.
		} catch(NullPointerException e) { // 다중 catch가능, 위에 catch는 후손이 온다, 선조가 오면 아래 catch로 갈 일이 없음.
			System.out.println("NullPointException catch");
		}catch(Exception e) {
			System.out.println("Exception catch");
		}finally {
			System.out.println("finally");
		}
	} // exceptionEx2
	
	public void exceptionEx3() {
		String str1 = null;
		String str2 = "efghi";
		try {
			str1.charAt(-10);
			
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("StringIndexOutOfBoundsException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}finally {
			System.out.println("파이날~");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ExceptionEx3 e = new ExceptionEx3();
		//e.exceptionEx1();
		//e.exceptionEx2(0);
		e.exceptionEx3();
	}
}
