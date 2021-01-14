package sist.com.obj.core2;

import java.awt.Frame;

public class FrameEx extends Frame {
	
	public FrameEx() {
		new AbstractWindowAdapter() {

			@Override
			public void windowClosing() {
				// TODO Auto-generated method stub
				setBounds(100, 100, 500, 500);
				setVisible(true);
			}
			
			
		}.windowClosing();
		
		
	}
	public static void main(String[] args) {
		new FrameEx();
	}
	
	
	
}
