package sist.com.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowEx3 extends JFrame { // JFrame : 웹에선 쓰이지 않음, Java에서 쓰이는 것
	Dimension d;
	JPanel []jp = new JPanel[5]; // pannel 5개 선언, 전체 1개, 들어갈 4개
	JButton []jbtn = new JButton[15];

	
	public void initFrame() {
		d = Toolkit.getDefaultToolkit().getScreenSize(); // 현재 screen의 해상도를 받아옴.
		//System.out.println(d);
		
		for (int i = 0; i < jp.length; i++) {
			jp[i] = new JPanel(i!=jp.length-1?new BorderLayout(): new GridLayout(2,2)); // 처음 4개 Border, 마지막 1개 Grid
			
		}
		
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JButton(String.valueOf(i+1));
		}
	
		jp[0].add("North", jbtn[0]);
		jp[0].add(jbtn[1]);
		jp[0].add("South", jbtn[2]);
		
		jp[1].add("East", jbtn[3]);
		jp[1].add(jbtn[4]);
		jp[1].add("West", jbtn[5]);

		jp[2].add("South", jbtn[6]);
		jp[2].add("West", jbtn[7]);
		
		jp[3].add("North", jbtn[8]);
		jp[3].add("East", jbtn[9]);
		
		jp[4].add(jp[0]);
		jp[4].add(jp[1]);
		jp[4].add(jp[2]);
		jp[4].add(jp[3]);
		
		this.add(jp[4]);
		
	}
	
	public WindowEx3() {
		initFrame();
		this.setBounds(0, 0, d.width, d.height); // 현재화면 해상도로 맞춤.		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 누르면 메모리에서 프레임을 날려라(꺼라), 이거 안해도 꺼지는 것처럼 보이지만 사실 hidden되는것
	}

	public static void main(String[] args) {
		new WindowEx3();
	}

}