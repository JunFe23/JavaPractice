package sist.com.io1;

public class IoEx3P {
	
	public void for1() {
		int i =0;
		for (int j = 0; j < 20; j++) {
			System.out.println(i++);
		}
	}
	public static void main(String[] args) {
		IoEx3P i = new IoEx3P();
		i.for1();
	}
}
