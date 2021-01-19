package sist.com.algorithm3;

public class For1 {

	public void gugudan() { // 아스키 코드를 int형으로 변환한 구구단
		int x;
		try {
			x = (char)System.in.read();
			int z = (int)(x-'0'); // ASCII 값은 ‘0’을 기준으로 1씩 더해주면 되기 때문에 ‘3’에 ‘0’을 빼주면 그 차이인 3이 나온다.
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
