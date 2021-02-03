package sist.com.thread1;

public class ThreadEx8 implements Runnable{
	private long money = 10000; // 공유자원.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if(getMoney()<=0)break;
				withDraw(1000); // 1000원씩 돈을 뺌.
				if(getMoney()==2000||getMoney()==4000||getMoney()==6000||getMoney()==8000) {
					try {
						this.wait(); // lock을 해제하는 것. 다음에 불려질 때까지 기다릴게.
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				} else {
					//this.notify(); // 다시 lockPool로 보냄. 스케줄러가 정해줌.
					notifyAll();
				}
				
			} // for
			
		} // synchronized
	}

	public static void main(String[] args) { // 동기화 문제를 보여줌.
		ThreadEx8 t = new ThreadEx8(); // 공유 자원.
		Thread a = new Thread(t, "JunFe");
		Thread b = new Thread(t, "성빈");
		Thread c = new Thread(t, "정연");
		Thread d = new Thread(t, "효진");
		Thread e = new Thread(t, "성준");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
	
	public void withDraw(long howmuch) {
		try {
			if(getMoney()>0) {
				money-=howmuch;
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" 님, 잔액 : "+getMoney());
			} else {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" 님, 잔액이 부족합니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
	
	
	
	
}
