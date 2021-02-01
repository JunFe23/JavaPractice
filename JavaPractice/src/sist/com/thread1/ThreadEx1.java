package sist.com.thread1;

public class ThreadEx1 extends Thread {
	private int []m = new int[100];

	public ThreadEx1(String name) {
		super(name);
		for (int i = 0; i < m.length; i++) {
			m[i]=i+1;
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println("Run"+this.getName());
//		System.out.println(this.getPriority()); // 우선순위 결정.
		for (int i = 0; i < m.length; i++) {
			System.out.println("["+this.getName()+"]="+m[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1("java"); // m배열 [][][][][][][].....100
		ThreadEx1 t2 = new ThreadEx1("Oracle"); // m배열 [][][][][][][].....100
		
		//t1.run(); // t1이 먼저 실행후, t2가 실행.
		//t2.run();
		
		t1.start(); // start 해주면 ruanable상태. 동시에 실행됨.
		t2.start();
	}
}
