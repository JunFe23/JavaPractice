package sist.com.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class WindowEx2 extends JFrame implements ActionListener { // JFrame : 웹에선 쓰이지 않음, Java에서 쓰이는 것
	JButton[] jbtn = new JButton[100]; // [] [] [] [] [] 5개 공간 만들어짐
	//JButton[] jbtn2 = new JButton[100]; // [] [] [] [] [] 5개 공간 만들어짐
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		//System.out.println(e.getActionCommand()); // getActionCommand는 내가 누른 버튼의 라벨이 출력
		int i = Integer.parseInt(e.getActionCommand()); // String -> Integer로
		//((JButton)e.getSource()).setBackground(i%2==0?Color.red:Color.blue); // 짝수 홀수에 대한 색차이 줌
		((JButton)e.getSource()).setBackground(JColorChooser.showDialog(this, "",Color.blue)); // 기본color를 blue로 하고 누르면 색상표 띄워줘서 고를 수 있음.
		
		//System.out.println(e.getActionCommand());
		if(e.getSource()==jbtn[0]) {
			System.out.println("Test");
		}
	}
	
	public void initButton() {
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JButton(String.valueOf(i+1));
			this.add(jbtn[i]);
			jbtn[i].addActionListener(this);
		}
	}
		
	

	public void BorderLayout() { // 프레임의 기본레이아웃이 보더레이아웃 
		this.setLayout(new BorderLayout());
		this.add(jbtn[0],BorderLayout.CENTER); // 위치 안 정해주면 기본이 센터
		this.add("West", jbtn[1]);
		this.add("North", jbtn[2]);
		this.add("East", jbtn[3]);
		this.add(jbtn[4],BorderLayout.SOUTH);
	}
		
	public void FlowLayout() { // 수평으로 나옴, 움직이면 흐른다
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < jbtn.length; i++) {
			this.add(jbtn[i]);
		}
	}
	
	public void GridLayout() {
		this.setLayout(new GridLayout(10, 10)); // 10행 10열
		
	}
	
	public WindowEx2() {
		initButton(); // 버튼 초기화
		//BorderLayout();
		//FlowLayout();
		GridLayout();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 누르면 메모리에서 프레임을 날려라(꺼라), 이거 안해도 꺼지는 것처럼 보이지만 사실 hidden되는것
	}

	public static void main(String[] args) {
		new WindowEx2();
	}

}
