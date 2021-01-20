package sist.com.util;

public class Generic<E> {
	E e;
	
	public void add(E o) {
		
	}
	
	
	public static void main(String[] args) {
		Generic<Integer>g=new Generic<Integer>();
		g.add(2);
		System.out.println(g);
	}
}
