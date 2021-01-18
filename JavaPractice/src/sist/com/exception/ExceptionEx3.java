package sist.com.exception;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

// Exception ( try catch finally throws throw userException
// finally�δ� ������ ����.

// Compile, RunTime
public class ExceptionEx3 {
	
	public void exceptionEx1() {
		System.out.println("Data : ");
		try { // �õ��ؼ� ���� ���� catch���ļ� finally, �� ���� �ٷ� finally
			int i = System.in.read(); // �ֿܼ��� �Է� �޾Ƽ� ���� i�� ����.
			System.out.println((char)i); // char����ȯ���� 1���ڸ� ����.
		}catch(IOException e) { // ���ܰ� �߻��ϸ� catch ����
			e.printStackTrace();
		}finally { //'��', ���ܰ� �߻��ϵ� ���ϵ� ����.
			System.out.println("Finally");
		}
		
	} // exceptionEx1
	
	
	public void exceptionEx2(int data) { // data���� 50���� ������ value�� ���� �ȵ�
		try{
			String value = data>=50?"Java":null;
			data=data/data; // data�� 0 ������ ���⼭ arithmeticException �߻��ؼ� Exception catch�� catch�� ��.
			System.out.println(value.charAt(0)); // value���� ������ NullPointException �߻�.
			return; // return �ص� finally�δ� ����.
		} catch(NullPointerException e) { // ���� catch����, ���� catch�� �ļ��� �´�, ������ ���� �Ʒ� catch�� �� ���� ����.
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
			System.out.println("���̳�~");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ExceptionEx3 e = new ExceptionEx3();
		//e.exceptionEx1();
		//e.exceptionEx2(0);
		e.exceptionEx3();
	}
}
