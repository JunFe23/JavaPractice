package sist.com.study;
//�޼���(Method) - Ư�� �۾��� �����ϴ� �Ϸ��� ������� �ϳ��� ���� ���̴�.

//�޼��带 ����ϴ� ����

//1. ���� ���뼺(reusability)
//2. �ߺ��� �ڵ��� ����
//3. ���α׷��� ����ȭ


//�޼����� ����� ����

//��ȯŸ�� �޼����̸� (Ÿ�� ������, Ÿ�� ������, ...)
//{
//			�ڵ�
//}

//�޼����� ȣ��

//�޼����̸�(��1, ��2, ...);  //�޼��带 ȣ���ϴ� ���

//����(argument)�� �Ű�����(parameter)
//�޼��带 ȣ���� �� ��ȣ ()�ȿ� �������� ������ '����(argument)'�Ǵ� '�μ�'��� �ϴµ�, ������ ������ ������ ȣ��� �޼��忡 ����� �Ű������� ��ġ�ؾ� �Ѵ�.

//return��
//��ȯ��(return value)
//�Ű������� ��ȿ�� �˻�

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multifly(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}
