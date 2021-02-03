package sist.com.thread2;

public class CustomerProducer {

	public static void main(String[] args) {
		Car car = new Car(); // Car 한 개 만들음.
		ProducerEx pEx = new ProducerEx(car);
		Thread pt = new Thread(pEx);
		CustomerEx cEx = new CustomerEx(car);
		Thread ct = new Thread(cEx);
		ct.start();
		pt.start();
		
	}
	
}
