package sist.com.algorithm3;

public class For1 {

	public void gugudan() { // �ƽ�Ű �ڵ带 int������ ��ȯ�� ������
		int x;
		try {
			x = (char)System.in.read();
			int z = (int)(x-'0'); // ASCII ���� ��0���� �������� 1�� �����ָ� �Ǳ� ������ ��3���� ��0���� ���ָ� �� ������ 3�� ���´�.
			for (int i = 1; i < 10; i++) {
				int y = z * i;
				System.out.printf("%d * %d = %d\n", z, i, y);}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void main(String[] args) {
		For1 f = new For1();
		f.gugudan();
	}
}
