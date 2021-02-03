package sist.com.thread1;

public class ThreadEx7 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Run");
		}
	}

	public static void main(String[] args) {
		System.out.println("MainStart");
		ThreadEx7 t = new ThreadEx7();
		t.start(); // run이 돌아감.
		try {
			t.join(); // 현재 Thread인 main이 잠시 쉼. t Thread가 나도 껴줘 해서 join...
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("MainBody");
		System.out.println("MainEnd");
	}
}
