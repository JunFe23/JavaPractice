package sist.com.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class WindowEx4P extends JFrame { // JFrame : 웹에선 쓰이지 않음, Java에서 쓰이는 것
	Pan pan = new Pan();
	int x, y;
	public WindowEx4P() {
		this.add(pan); // center에 frame 크기만큼 canvas가 붙음
		//this.setUndecorated(true); // 장식이 없어져서 Full-Screen
		this.getContentPane().setBackground(Color.blue);
		this.setBounds(0, 0, 1980, 1080);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 누르면 메모리에서 프레임을 날려라(꺼라), 이거 안해도 꺼지는 것처럼 보이지만 사실 hidden되는것
	}
	public class Pan extends Canvas{ // 내부클래스
		public Pan() {
			Font font = new Font("굴림",Font.BOLD,30);
			this.setFont(font);
			this.setBackground(Color.red);
			this.setBounds(0, 0, 50, 50);
			this.addMouseListener(new MouseAdapter() { // inner클래스
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
				public void mouseMoved(MouseEvent e) { // 드래그할 때, 마우스 좌표 따라옴.
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
			
			//g.drawString("바보 x = "+x+" y = "+y, x, y);
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
