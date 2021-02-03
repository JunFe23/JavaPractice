package sist.com.thread2;

public class CustomerEx implements Runnable { // 소비 Thread

	private Car car; // Car를 가지고 있음.
	
	
	
	public CustomerEx(Car car) {
	super();
	this.car = car;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int)(Math.random()*500));
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	} 

	
}
