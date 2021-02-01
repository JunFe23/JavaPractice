package sist.com.thread1;

public class ThreadEx2 implements Runnable{
	private int []m = new int [100]; // 임계영역, 공유자원.
	
	public ThreadEx2() {
		for (int i = 0; i < m.length; i++) {
			m[i]=i+1;
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < m.length; i++) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+" "+m[i]);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		ThreadEx2 t1 = new ThreadEx2();
		//t1.start(); // 쓰레드가 아니라 에러.
		Thread th1 = new Thread(t1, "HTML");
		Thread th2 = new Thread(t1, "CSS");
		Thread th3 = new Thread(t1, "JAVE");
		Thread th4 = new Thread(t1, "PYTON");
		Thread th5 = new Thread(t1, "C++");
		th1.start(); // runnable -> 스케줄러에 의해서 run method 호출.
		th2.start(); 
		th3.start();
		th4.start();
		th5.start();
	}
}
