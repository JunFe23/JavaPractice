package sist.com.obj.core3;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class WindowEx1 extends Frame {
	JButton jbtn=new JButton("Click");
	public WindowEx1() {
		this.add("South", jbtn);
		jbtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				JOptionPane.showMessageDialog(WindowEx1.this, "Test");
			}
			
		});
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		}); // 감지자 메서드
		this.setBounds(new Rectangle(new Point(100, 100),new Dimension(500, 500)));
		this.setVisible(true);
	}
	
	
	
	


	public static void main(String[] args) {
		new WindowEx1();
	}
}
