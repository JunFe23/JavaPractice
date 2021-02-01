package sist.com.thread1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThreadEx4 extends JFrame {
	String []str = {"Java","Oracle","Html","Jsp","Spring","Ajax"};
	StringBar []sb = new StringBar[str.length];
	Pan pan = new Pan();
	int x =10, y=50;
	JPanel jp, jp2;
	JTextField tf;
	JLabel jlabel;
	int score;
	public ThreadEx4() {
		this.add(pan);
		jp=new JPanel();
		jp.add(tf = new JTextField(50));
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField jtf = (JTextField) e.getSource();
				for (int i = 0; i < str.length; i++) {
					if(jtf.getText().equals(str[i])) {
						sb[i].setMsg("");
						sb[i].setX(0);
						sb[i].setY(0);
						jtf.setText("");
						score+=20;
						jlabel.setText(score+"점");
					} 
				}
			}
		});
		this.add("South",jp);
		jp2=new JPanel(new BorderLayout());
		jp2.add("East", jlabel = new JLabel(score+"점"));
		this.add("North",jp2);
		strInit();
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent var1) {
				// TODO Auto-generated method stub
				StringThread[]st=new StringThread[sb.length];
				for (int i = 0; i < sb.length; i++) {
					st[i]=new StringThread(sb[i], ThreadEx4.this);
					st[i].start();
				}
			}
		
		});
		this.setBounds(10, 10, 1000, 1000);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void strInit() {
		for (int i = 0; i < sb.length; i++) {
			sb[i] = new StringBar(str[i], 150*(i+1), (int)(Math.random()*50)*(i+1)+50, "black");
		}
	}
	
	public class Pan extends Canvas{

		public Pan() {
			this.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					y+=50;
					repaint();
				}
				
			});
		}
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			//g.fillOval(10, 10, 50, 50); // 공모양.
			g.setFont(new Font("굴림", Font.BOLD, 30));
			g.setColor(Color.black);
			for (int i = 0; i < sb.length; i++) {
				g.drawString(sb[i].getMsg(), sb[i].getX(), sb[i].getY());
			}
		}

		@Override
		public void update(Graphics g) {
			// TODO Auto-generated method stub
			super.update(g);
		}
		
	}
	
	public static void main(String[] args) {
		new ThreadEx4();
	}
}
