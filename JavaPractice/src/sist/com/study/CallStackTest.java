package sist.com.study;
//JVM�� �޸� ����

//1. �޼��� ����(method area)
//2. ��(heap)
//3. ȣ�⽺��(call stack or execution stack)

//�޼ҵ尡 ȣ��Ǹ� ���࿡ �ʿ��� ��ŭ�� �޸𸮸� ���ÿ� �Ҵ�޴´�.
//�޼��尡 ������ ��ġ�� ���� ����ߴ� �޸𸮸� ��ȯ�ϰ� ���ÿ��� ���ŵȴ�.
//ȣ�⽺���� ���� ���� �ִ� �޼��尡 ���� ���� ���� �޼����̴�.
//�Ʒ��� �ִ� �޼��尡 �ٷ� ���� �޼��带 ȣ���� �޼����̴�.
public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // static�޼���� ��ü �������� ȣ�Ⱑ���ϴ�.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod");
	}
}
