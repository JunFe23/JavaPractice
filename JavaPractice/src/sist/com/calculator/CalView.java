package sist.com.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class CalView extends JFrame{
	private JTextField inputSpace;
	private JButton[] jbtn = new JButton [20];
	private JPanel[] jp = new JPanel[5];
	private ImageIcon[] originIcon = new ImageIcon[10];
	private Image[] originImg = new Image[10];
	private Image[] afterImg = new Image[10];
	private ImageIcon[] afterIcon = new ImageIcon[10];
	
	
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
		
		// jtextfield로 계산기 결과부 구현.
		inputSpace = new JTextField("0");
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.white);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 25));
		inputSpace.setBounds(new Rectangle(280, 55));
		
		this.setLocationRelativeTo(null);
		this.add(inputSpace);
		this.add("South",jp[2]);
		
		// 동작 구현부
		for (int i = 0; i < 10; i++) {
			jbtn[i].addActionListener(new Calculate());
		}
		
		
	
		
	}
	
	public CalView() { // 계산기 외형.
		initFrame();
		this.setTitle("JunFe's Calculator");
		this.setBounds(0,0,280,280);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public class Calculate implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==jbtn[0]) { // .
				inputSpace.setText(".");
			} else if(e.getSource()==jbtn[1]) { // backspace
				inputSpace.setText(" ");
			} else if(e.getSource()==jbtn[2]) { // AC
				inputSpace.setText("0");
			} else if(e.getSource()==jbtn[3]) { // +/-
				inputSpace.setText("0");
			} else if(e.getSource()==jbtn[4]) { // %
				inputSpace.setText("0");
			} else if(e.getSource()==jbtn[5]) { // /
				inputSpace.setText("0");
			} else if(e.getSource()==jbtn[6]) { // *
				inputSpace.setText("0");
			} else if(e.getSource()==jbtn[7]) { // -
				inputSpace.setText("0");
			} else if(e.getSource()==jbtn[8]) { // +
				inputSpace.setText("0"); 
			} else if(e.getSource()==jbtn[9]) { // =
				inputSpace.setText("0");
			} else {
				inputSpace.setText(inputSpace.getText()+e.getActionCommand());
			}
		}
	}

	
	
	
	
	
	public static void main(String[] args) {
		new CalView();
	}
}
