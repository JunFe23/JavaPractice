package sist.com.thread1;

public class ThreadEx5 implements Runnable{

	@Override
	public void run() { // run에서 호출만 해도 Thread 환경이다.
		// TODO Auto-generated method stub
		System.out.println("Run");
		first();
	}
	
	public void first() {
		System.out.println("First");
		second();
	}
	
	public void second() {
		System.out.println("Second");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"Start"); // main에는 JVM에 의해서 돌고있는 thread가 존재하고, 우선순위가 높기 때문에 먼저 실행되고 먼저 끝남.
		Runnable r = new ThreadEx5();
		Thread t = new Thread(r);
		t.start();
		try {
			t.join(); // 현재 Thread 기다려~			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName()+"End");
	}
	
}
