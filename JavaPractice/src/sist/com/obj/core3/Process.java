package sist.com.obj.core3;

import java.awt.Button;
import java.awt.Panel;

//Member, Static, Local, AnonyMous
public class Process extends Panel{
	private int x,y;
	final int DATA=500;
	public void method() {
		int localValue=500;
		final int DL=900;
		class MethodInner1{ // local inner class
			public MethodInner1() {
				int mi;
				//this.x=500;//error
				System.out.println(DATA);
				//localValue=900; // error local inner class�� ���������� ���� �Ұ�
				System.out.println(DL); // final ���������� ���� ����.
			}
			public void innerMethod() {
				System.out.println("innerMethod");
			}
		} //innerClass
		MethodInner1 m = new MethodInner1();
		m.innerMethod();
	}
	public class ButtonInner extends Button{ // member inner class
		
	}
	public static class Inner{ // static inner class
		static int s;
	}
	
	public static void main(String[] args) {
		Process p = new Process();
		p.method();
	}
}
