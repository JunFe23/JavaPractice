package sist.com.thread2;

public class ProducerEx implements Runnable{ // 생산 Thread
	private Car car;
	
	
	
	public ProducerEx(Car car) {
	super();
	this.car = car;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		String carName=null;
		for (int i = 0; i < 20; i++) {
			carName=car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	
}
