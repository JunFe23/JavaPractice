package sist.com.util2;

import java.util.Stack;

public class UtilEx4_1 {
	
	public void stackMethod() {
		Stack<String> stack = new Stack<String>(); // ��������
		stack.push("A"); // ������� stack�� ����
		stack.push("A"); // ������� stack�� ���� // �ߺ����
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println(stack.toString());
		System.out.println(stack.pop()); // �� �������� �� D����
		System.out.println(stack.peek()); // 3��° �� C
		System.out.println(stack.peek()); // C
		System.out.println(stack.pop()); // C�����鼭 C���
		System.out.println(stack.pop()); // 2��° �� B �����鼭 B ���
		System.out.println(stack.peek()); // �����ִ� A���
		System.out.println(stack.search("A")); // true
		System.out.println(stack.toString());
		//stack.clear();
		System.out.println(stack.empty()); // true
		stack.empty();
	}
	
	public static void main(String[] args) {
		UtilEx4_1 u = new UtilEx4_1();
		u.stackMethod();
	}
}
