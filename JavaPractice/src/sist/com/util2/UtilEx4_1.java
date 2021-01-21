package sist.com.util2;

import java.util.Stack;

public class UtilEx4_1 {
	
	public void stackMethod() {
		Stack<String> stack = new Stack<String>(); // 선입후출
		stack.push("A"); // 순서대로 stack에 넣음
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack.pop()); // 맨 마지막에 들어감 D꺼냄
		System.out.println(stack.peek()); // 3번째 들어간 C
		System.out.println(stack.peek()); // C
		System.out.println(stack.pop()); // C꺼내면서 C출력
		System.out.println(stack.pop()); // 2번째 들어간 B 꺼내면서 B 출력
		System.out.println(stack.peek()); // 남아있는 A출력
		System.out.println(stack.search("A"));
		stack.clear();
		System.out.println(stack.empty()); // true
	}
	
	public static void main(String[] args) {
		UtilEx4_1 u = new UtilEx4_1();
		u.stackMethod();
	}
}
