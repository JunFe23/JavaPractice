package sist.com.view;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sist.com.util2.Member;

public class WindowEx7 extends JFrame {
	private JTable jTable;
	private TableModelEx TableModelEx;
	private int col=4;
	public void initTable(Object [][]data) {
		TableModelEx = new TableModelEx(data);
		jTable = new JTable(TableModelEx);
		this.add(new JScrollPane(jTable));
	}
	
	public Object[][] getTwoArray(Vector<Member> v){
		Object [][]data = new Object[v.size()][col];
		for (int i = 0; i < data.length; i++) { // Çà±æÀÌ
				int j=0;;
				data[i][j++] = v.elementAt(i).getId();
				data[i][j++] = v.elementAt(i).getName();
				data[i][j++] = v.elementAt(i).getEmail();
				data[i][j] = v.elementAt(i).getAddress();				
		}
		return data;
	}
	
	public WindowEx7(Vector<Member> v) {
		initTable(getTwoArray(v));
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public WindowEx7() {
		//initTable();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new WindowEx7();
	}
}