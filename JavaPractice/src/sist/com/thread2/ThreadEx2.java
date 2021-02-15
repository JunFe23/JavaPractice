package sist.com.thread2;

public class ThreadEx2 implements Runnable {
	private int bread=100;

	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
				eat();
				if(getBread()>0) {
					System.out.println(Thread.currentThread().getName()+" :"+getBread());
					if(getBread()%5==0)this.wait();
					else this.notify();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void eat() {
		bread--;
	}
	
	public static void main(String[] args) {
		ThreadEx2 tr = new ThreadEx2();
		Thread t1 = new Thread(tr,"윤하");
		Thread t2 = new Thread(tr,"효진");
		t1.start();
		t2.start();
		System.out.println("end");
	}
	
}
