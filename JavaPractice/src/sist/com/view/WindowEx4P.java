package sist.com.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class WindowEx4P extends JFrame { // JFrame : ������ ������ ����, Java���� ���̴� ��
	Pan pan = new Pan();
	int x, y;
	public WindowEx4P() {
		this.add(pan); // center�� frame ũ�⸸ŭ canvas�� ����
		//this.setUndecorated(true); // ����� �������� Full-Screen
		this.getContentPane().setBackground(Color.blue);
		this.setBounds(0, 0, 1980, 1080);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư ������ �޸𸮿��� �������� ������(����), �̰� ���ص� ������ ��ó�� �������� ��� hidden�Ǵ°�
	}
	public class Pan extends Canvas{ // ����Ŭ����
		public Pan() {
			Font font = new Font("����",Font.BOLD,30);
			this.setFont(font);
			this.setBackground(Color.red);
			this.setBounds(0, 0, 50, 50);
			this.addMouseListener(new MouseAdapter() { // innerŬ����
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					x = e.getX();
					y = e.getY();
					repaint();
				}				
			});
			this.addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) { // �巡���� ��, ���콺 ��ǥ �����.
					// TODO Auto-generated method stub
					x=e.getX();
		            y=e.getY();
		            repaint();
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
		}

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			
			//g.drawString("�ٺ� x = "+x+" y = "+y, x, y);
			//g.fillOval(x, y, 100, 100);
			g.drawOval(x, y, 50, 50);
			g.drawRect(x, y, 50, 50);
			g.drawLine(100, 100, 300, 300);
			g.drawLine(300, 300, 200, 100);
			g.drawLine(200, 100, 100, 100);
		}
		
	}

	public static void main(String[] args) {
		new WindowEx4P();
	}

}
