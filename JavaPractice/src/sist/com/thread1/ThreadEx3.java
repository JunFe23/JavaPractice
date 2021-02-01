package sist.com.thread1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ThreadEx3 extends JFrame implements ActionListener{
	JProgressBar []jpBars = new JProgressBar[3];
	JButton []jbtn = new JButton[3];
	JPanel []jPanel = new JPanel[2];
	String []name = {"JunFe","정연","성빈"};
	int cnt;
	
	
	@Override
	public void actionPerformed(ActionEvent var1) {
		// TODO Auto-generated method stub
		//jpBars[0].setValue(++cnt);
		jbtn[0].setEnabled(false); // 계속 눌러도 엉키지 않게 해줌. 한번만 반응.
		jbtn[1].setEnabled(false); // 계속 눌러도 엉키지 않게 해줌. 한번만 반응.
		jbtn[2].setEnabled(false); // 계속 눌러도 엉키지 않게 해줌. 한번만 반응.
		ProgressThread[] pt = new ProgressThread[3];
		for (int i = 0; i < pt.length; i++) {
			pt[i]=new ProgressThread(jpBars[i], jbtn[i], name[i]);
			pt[i].start();
		}
	}

	public void initProgress() {
		jPanel[0] = new JPanel(new GridLayout(3,1));
		for (int i = 0; i < jpBars.length; i++) {
			jpBars[i] = new JProgressBar(1,100);
			jpBars[i].setStringPainted(true);
			jPanel[0].add(jpBars[i]);
		}
		this.add("North",jPanel[0]);
		jPanel[1] = new JPanel(new GridLayout(3,1));
		jPanel[1].add(jbtn[0] = new JButton("Start"));
		jbtn[0].addActionListener(this);
		jPanel[1].add(jbtn[1] = new JButton("Start"));
		jbtn[1].addActionListener(this);
		jPanel[1].add(jbtn[2] = new JButton("Start"));
		jbtn[2].addActionListener(this);
		this.add("South",jPanel[1]);
	}
	
	public ThreadEx3() {
		initProgress();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ThreadEx3();
	}
}
