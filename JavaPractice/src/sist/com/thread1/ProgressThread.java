package sist.com.thread1;

import javax.swing.JButton;
import javax.swing.JProgressBar;

public class ProgressThread extends Thread{
	JProgressBar jp;
	JButton jbtn;
	
	
	public ProgressThread(JProgressBar jp, JButton jbtn, String name) {
		super(name);
		this.jp = jp;
		this.jbtn = jbtn;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isStop = false;
		int count = 0;
		while(!isStop) {
			if(count>=1000)break;
			try {
				count+=(int)(Math.random()*10)+1;
				jp.setValue(count);
				Thread.sleep(700);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		System.out.println(this.getName());
		jbtn.setEnabled(true);
	}

	
}
