package sist.com.thread1;

public class StringThread extends Thread {
	private StringBar sb;
	private ThreadEx4 th;
	
	
	public StringThread(StringBar sb, ThreadEx4 th) {
		super();
		this.sb = sb;
		this.th=th;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		while(th.getHeight()>count) {
			try {
				count+=(int)(Math.random()*5);
				//System.out.println(th.getHeight()+" "+sb.getY());
				Thread.sleep((int)(Math.random()*1000));
				sb.setY(sb.getY()+count);
				th.pan.repaint();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
	
}
