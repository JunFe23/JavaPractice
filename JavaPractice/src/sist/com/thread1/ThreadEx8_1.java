package sist.com.thread1;

public class ThreadEx8_1 implements Runnable{
	private int candy = 100000;
	
	public void eatCandy(int candy) {
		try {
			if(getCandy()>0) {
				this.candy -= candy;
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"님이 캔디를 "+candy+"개 먹어서 "+this.candy+"개 남았습니다.");
			} else {
				Thread.sleep(1000);
				System.out.println("캔디 부족!!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public int getCandy() {
		return candy;
	}
	public void setCandy(int candy) {
		this.candy = candy;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				if(getCandy()<0)break;
				eatCandy((int)(Math.random()*1000));
				if(getCandy()<30000||getCandy()<60000||getCandy()<90000) {
					try {
						this.wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				} else {
					this.notify();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx8_1 t = new ThreadEx8_1();
		Thread a = new Thread(t, "준철");
		Thread b = new Thread(t, "성준");
		Thread c = new Thread(t, "승우");
		Thread d = new Thread(t, "지연");
		a.start();
		b.start();
		c.start();
		d.start();
	}
	
	
}
