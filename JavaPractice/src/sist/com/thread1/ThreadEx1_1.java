package sist.com.thread1;

public class ThreadEx1_1 extends Thread{
	private byte[] b = new byte[100];

	public ThreadEx1_1(String name) {
		super(name);
		for (int i = 0; i < b.length; i++) {
			b[i]= (byte)(i+97);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < b.length; i++) {
			System.out.println("["+this.getName()+"]="+(char)b[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1("JunFe");
		ThreadEx1_1 t2 = new ThreadEx1_1("Jun");
		t1.start();
		t2.start();
		
	}
	
}
