package sist.com.obj.basic2;

public class Alphabet {

	public static void main(String[] args) {
		C c=new C(10,new B(20,new A(30)));
		System.out.println(c.getB().getA().getA());
		
		
		//����ó��
		//��ȣ �̸� ���� ���� ���� ���� ��� ��� ����
	}
}
