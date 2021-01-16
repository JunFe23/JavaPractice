package sist.com.exception;
//Compile�� ���� ���� �̹� error, RunTime�� ���� ���߿� �߻���. 
public class ExceptionEx1 {
	
	public void interruptedExcetion() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		} // for��
	}
	public void arrayIndexOutOfBoundsException() {
		// 5���� �迭������ �����ߴµ� 6���翡 ���� �������� �ϴϱ� arrayIndexOutOfBoundsException �߻�
		int []m=new int [5]; // [] [] [] [] []
		for (int i = 0; i <= m.length; i++) { 
			try {
				m[i]=i+1;
				System.out.println("Test");				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ٺ���");
				e.printStackTrace(); // error���� �� ���� ������
			}catch(Exception e) {
				
			}
			
		} // for��
	}
	
	public void arithmeticException() {
		// 0���� ���� �������� �� �߻��ϴ� arithmeticException
		int []m=new int[10];
		for (int i = 0; i < m.length; i++) {
			//m[i]=100/(int)Math.random()*500; // 0���� ������ �� ���� exception 
			// (int)Math.random()�� ���� ���� ����ż� �� ���� 0�̵�
			m[i]=10000/(int)(Math.random()*500); // �̰� ����.
			
		}
		for(int i:m) {
			System.out.println(i);
		}
	}
	public void NumberFormatException(String code) {
		int rs=Integer.parseInt(code.substring(0, 3))+Integer.parseInt(code.substring(4,6));
		// code 0~3��° ���� 'F52�� �����Ǿ� substring�� ���� String������ ��������, 
		// �� String���� Integer.parseInt�� ���� Integer������ ��ȯ�Ǵµ� 0��° F�� ���ڿ��� Integer������ ��ȯ���� ����
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
