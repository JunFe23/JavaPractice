package sist.com.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalView extends JFrame{
	JLabel jl = new JLabel("숫자를 입력하세요.");
	JButton[] jbtn = new JButton [20];
	JPanel[] jp = new JPanel[5];
	ImageIcon[] originIcon = new ImageIcon[10];
	Image[] originImg = new Image[10];
	Image[] afterImg = new Image[10];
	ImageIcon[] afterIcon = new ImageIcon[10];
	
	
	public void initFrame() { // 전체 프레임 설정.
		for (int i = 0; i < jp.length; i++) { // 패널 생성, [0,1,2] borderlayout, [3,4] gridlayout;
			jp[i]=new JPanel(i<3?new FlowLayout():i==3?new GridLayout(5,3):new GridLayout(5,1)); 
		}
		
		
		for (int i = 0; i < 10; i++) { // 이미지 크기 조절.
			originIcon[i] = new ImageIcon("/Users/junfe/Desktop/JunFe/Calculator/"+String.valueOf(i)+".png");
			originImg[i] = originIcon[i].getImage();
			afterImg[i] = originImg[i].getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
			afterIcon[i] = new ImageIcon(afterImg[i]);
		}
		
		for (int i = 0; i < jbtn.length; i++) { // button값 넣어주기.
			if(i<10) {
				jbtn[i]=new JButton(afterIcon[i]);
			} else {
				jbtn[i]=new JButton(String.valueOf(i-10));
			} //
		}
		
		// button 패널에 맞게 배치.
		jp[3].add(jbtn[2]);
		jp[3].add(jbtn[3]);
		jp[3].add(jbtn[4]);
		jp[3].add(jbtn[17]);
		jp[3].add(jbtn[18]);
		jp[3].add(jbtn[19]);
		jp[3].add(jbtn[14]);
		jp[3].add(jbtn[15]);
		jp[3].add(jbtn[16]);
		jp[3].add(jbtn[11]);
		jp[3].add(jbtn[12]);
		jp[3].add(jbtn[13]);
		jp[3].add(jbtn[0]);
		jp[3].add(jbtn[10]);
		jp[3].add(jbtn[1]);
		
		jp[4].add(jbtn[5]);
		jp[4].add(jbtn[6]);
		jp[4].add(jbtn[7]);
		jp[4].add(jbtn[8]);
		jp[4].add(jbtn[9]);
		
		//	배경색 지정.
		jp[3].setBackground(Color.gray);
		jp[4].setBackground(Color.yellow);
		
		
		// 버튼 패널 합치
		jp[2].add(jp[3]);
		jp[2].add(jp[4]);
		jp[2].setBackground(Color.gray);
		
		// jlabel로 계산기 결과부 구현.
		jl.setPreferredSize(new Dimension(280,55));
		jl.setVerticalAlignment(SwingConstants.BOTTOM);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jl.setOpaque(true);
		jl.setBackground(Color.gray);
		jp[1].add(jl);
		
		jp[0].add(jp[1]);
		jp[0].add(jp[2]);
		
		this.add(jp[0]);
		
		
	}
	
	public CalView() { // 계산기 외형.
		initFrame();
		this.setTitle("JunFe's Calculator");
		this.setBounds(0,0,280,280);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	
	
	public static void main(String[] args) {
		new CalView();
	}
}
