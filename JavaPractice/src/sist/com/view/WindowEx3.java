package sist.com.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowEx3 extends JFrame { // JFrame : ������ ������ ����, Java���� ���̴� ��
	Dimension d;
	JPanel []jp = new JPanel[5]; // pannel 5�� ����, ��ü 1��, �� 4��
	JButton []jbtn = new JButton[15];

	
	public void initFrame() {
		d = Toolkit.getDefaultToolkit().getScreenSize(); // ���� screen�� �ػ󵵸� �޾ƿ�.
		//System.out.println(d);
		
		for (int i = 0; i < jp.length; i++) {
			jp[i] = new JPanel(i!=jp.length-1?new BorderLayout(): new GridLayout(2,2)); // ó�� 4�� Border, ������ 1�� Grid
			
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
		this.setBounds(0, 0, d.width, d.height); // ����ȭ�� �ػ󵵷� ����.		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư ������ �޸𸮿��� �������� ������(����), �̰� ���ص� ������ ��ó�� �������� ��� hidden�Ǵ°�
	}

	public static void main(String[] args) {
		new WindowEx3();
	}

}
