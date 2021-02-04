package sist.com.thread2;

public class ThreadEx1 implements Runnable {

	int data;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}

	public static void main(String[] args) {
		ThreadEx1 t = new ThreadEx1();
		Thread thread1 = new Thread(t);
		thread1.start();
//		StringBuffer sb = new StringBuffer(); // 
//		StringBuilder sbu = new StringBuilder(); //  
//		sb.append("A");
//		sbu.append("B");
		
		
	}
}
