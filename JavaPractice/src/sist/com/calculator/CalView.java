package sist.com.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalView extends JFrame{
	TextField tf;
	JButton[] jbtn = new JButton [20];
	JPanel[] jp = new JPanel[4];
	
	public void initFrame() {
		for (int i = 0; i < jp.length; i++) {
			jp[i]=new JPanel(i<=1?new BorderLayout():i==2?new GridLayout(5,3):new GridLayout(5,1));
		}
		for (int i = 0; i < jbtn.length; i++) {
			if(i<10) {
				jbtn[i]=new JButton(new ImageIcon("/Users/junfe/Desktop/JunFe/Calculator/"+String.valueOf(i)+".png"));
				System.out.println("/User/junfe/Desktop/JunFe/Calculaotr/"+String.valueOf(i)+".png");
			} else {
				jbtn[i]=new JButton(String.valueOf(i-10));
			} //
		}
		
		
		jp[2].add(jbtn[2]);
		jp[2].add(jbtn[3]);
		jp[2].add(jbtn[4]);
		jp[2].add(jbtn[17]);
		jp[2].add(jbtn[18]);
		jp[2].add(jbtn[19]);
		jp[2].add(jbtn[14]);
		jp[2].add(jbtn[15]);
		jp[2].add(jbtn[16]);
		jp[2].add(jbtn[11]);
		jp[2].add(jbtn[12]);
		jp[2].add(jbtn[13]);
		jp[2].add(jbtn[0]);
		jp[2].add(jbtn[10]);
		jp[2].add(jbtn[1]);
		
		jp[3].add(jbtn[5]);
		jp[3].add(jbtn[6]);
		jp[3].add(jbtn[7]);
		jp[3].add(jbtn[8]);
		jp[3].add(jbtn[9]);
		
		jp[1].add(jp[2]);
		jp[1].add(jp[3]);
		
		jp[0].add("North", new TextField());
		jp[0].add(jp[1]);
		
		this.add(jp[2]);
		
	}
	
	public CalView() {
		initFrame();
		this.setBounds(0,0,240,330);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new CalView();
	}
}
