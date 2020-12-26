package sist.com.variable;

public class Test {
	
	public void cal(int x, int y, int z) {
		System.out.println(x>y && x>z ? x : y>z ? y : z); // 3
		System.out.println(x<y && x<z ? x : y<z ? y : z); // 1
		
		int d = x + y + z;
		System.out.println(d); // 5
		System.out.println((float)d/3); // 계산식 하나 항만 바꿔도 int형이 float으로 바뀜
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.cal(1, 1, 3);
		
	}
}
