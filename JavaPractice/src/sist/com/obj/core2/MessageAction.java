package sist.com.obj.core2;

import java.awt.Canvas;
import java.awt.Frame;

public class MessageAction extends Frame {
	int x,y;
	public class MessageInner extends Canvas{
		public MessageInner() {
			System.out.println("MessageInner()");
			new ListInner() {
				
				@Override
				public void isFull() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void get() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void empty() {
					// TODO Auto-generated method stub
					
				}
			};
		}
	}
	public static void main(String[] args) {
		new MessageAction().x=10;
		//System.out.println(new MessageAction().x); // 0ÀÌ³ª¿È.
		new MessageAction().new MessageInner();
	}
	
	
	
}
