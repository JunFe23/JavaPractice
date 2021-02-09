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
import java.util.ArrayList;
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
	private String[] a = {".","Del","AC","+/-","%","÷","×","-","+","="};
	
	private ArrayList<String> equation = new ArrayList<String>();
	private String num = "";
	
	
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
				//jbtn[i]=new JButton(afterIcon[i]);
				jbtn[i]=new JButton(a[i]);
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
		inputSpace = new JTextField("");
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.white);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 25));
		inputSpace.setBounds(new Rectangle(280, 55));
		
		this.setLocationRelativeTo(null);
		this.add(inputSpace);
		this.add("South",jp[2]);
		
		// 동작 구현부
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i].addActionListener(new Calculate());
		}
		
		
	
		
	}
	
	public CalView() { // 계산기 외형.
		initFrame();
		this.setTitle("JunFe's Calculator");
		this.setBounds(0,0,320,240);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public class Calculate implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==jbtn[2]) { // AC
				inputSpace.setText("");
			} else if(e.getSource()==jbtn[3]) { // +/-
				
			} else if(e.getSource()==jbtn[9]) { // =
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText(""+result);
				num = "";
			} else {
				inputSpace.setText(inputSpace.getText()+e.getActionCommand());
			}
		}
	}
	
	public void fullTextParsing(String inputText) { // inputText의 문자들을 한글자씩 스캔.
		equation.clear();
		
		for(int i = 0; i < inputText.length(); i++) { // ch로 한글자씩 받음.
			char ch = inputText.charAt(i);
			
			if (ch=='+'||ch=='-'||ch=='×'||ch=='÷') { // ch가 연산자일 경우.
				equation.add(num); // equation에 기존 num을 넣고.
				num = ""; // num 초기화.
				equation.add(ch+""); // equation에 사칙연산 기호 넣고 뒤에 빈칸.
			} else {
				num = num + ch; // 숫자일 경우 숫자가 String형으로 들어감.
			}
		}
		equation.add(num);
	}

	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		double prev = 0;
		double current = 0;
		String mode = "";
		
		for(String s:equation) { 
			if(s.equals("+")) {
				mode = "add";
			} else if(s.equals("-")) {
				mode = "sub";
			} else if(s.equals("×")) {
				mode = "mul";
			} else if(s.equals("÷")) {
				mode = "div";
			} else {
				current = Double.parseDouble(s); // String을 Double형으로 변환.
				if (mode=="add") {
					prev += current;
				} else if (mode=="sub") {
					prev -= current;
				} else if (mode=="mul") {
					prev *= current;
				} else if (mode=="div") {
					prev /= current;
				} else {
					prev = current;
				}
			}
		}
		return prev;
	}
	
	
	
	
	
	public static void main(String[] args) {
		new CalView();
	}
}
