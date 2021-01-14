package sist.com.obj.core3;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;

public class WindowEx1_1 extends Frame{
	JButton jbtn=new JButton("Click");
	public WindowEx1_1() {
	
		this.setBounds(new Rectangle(new Point(500, 50), new Dimension(500, 500)));
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new WindowEx1_1();
	}
}
