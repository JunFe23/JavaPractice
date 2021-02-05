package sist.com.util2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class WindowPractice extends JFrame{
	Pan pan = new Pan();
	int x, y;
	int a=0, b=0, c=0;
	public WindowPractice() {
		this.add(pan);
		this.getContentPane().setBackground(Color.yellow);
		this.setBounds(0, 0, 1980, 1080);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class Pan extends Canvas {
		public Pan() {
			Font font = new Font("�Ÿ���", Font.BOLD, 50);
			this.setFont(font);
			this.setBackground(Color.yellow);
			this.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseClicked(e);
						x=e.getX();
						y=e.getY();
						repaint();
						System.out.println(a);
				}
				
			}); // addMouseListener
			this.addMouseMotionListener(new MouseMotionAdapter() {

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					x=e.getX();
					y=e.getY();
					repaint();
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseMoved(e);
				}
				
			});
		} // Pan

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			//g.drawString("�ٺ� x = " + x + "  y = " + y, x, y);
			g.fillOval(x, y, 50, 50);
			
		}

		@Override
		public void update(Graphics g) {
			// TODO Auto-generated method stub
			paint(g);
		}
	} // class Pan
	
	
	
	public static void main(String[] args) {
		new WindowPractice();
	}
}
