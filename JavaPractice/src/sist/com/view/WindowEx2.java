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

public class WindowEx2 extends JFrame implements ActionListener { // JFrame : ������ ������ ����, Java���� ���̴� ��
	JButton[] jbtn = new JButton[100]; // [] [] [] [] [] 5�� ���� �������
	//JButton[] jbtn2 = new JButton[100]; // [] [] [] [] [] 5�� ���� �������
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		//System.out.println(e.getActionCommand()); // getActionCommand�� ���� ���� ��ư�� ���� ���
		int i = Integer.parseInt(e.getActionCommand()); // String -> Integer��
		//((JButton)e.getSource()).setBackground(i%2==0?Color.red:Color.blue); // ¦�� Ȧ���� ���� ������ ��
		((JButton)e.getSource()).setBackground(JColorChooser.showDialog(this, "",Color.blue)); // �⺻color�� blue�� �ϰ� ������ ����ǥ ����༭ �� �� ����.
		
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
		
	

	public void BorderLayout() { // �������� �⺻���̾ƿ��� �������̾ƿ� 
		this.setLayout(new BorderLayout());
		this.add(jbtn[0],BorderLayout.CENTER); // ��ġ �� �����ָ� �⺻�� ����
		this.add("West", jbtn[1]);
		this.add("North", jbtn[2]);
		this.add("East", jbtn[3]);
		this.add(jbtn[4],BorderLayout.SOUTH);
	}
		
	public void FlowLayout() { // �������� ����, �����̸� �帥��
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < jbtn.length; i++) {
			this.add(jbtn[i]);
		}
	}
	
	public void GridLayout() {
		this.setLayout(new GridLayout(10, 10)); // 10�� 10��
		
	}
	
	public WindowEx2() {
		initButton(); // ��ư �ʱ�ȭ
		//BorderLayout();
		//FlowLayout();
		GridLayout();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư ������ �޸𸮿��� �������� ������(����), �̰� ���ص� ������ ��ó�� �������� ��� hidden�Ǵ°�
	}

	public static void main(String[] args) {
		new WindowEx2();
	}

}
