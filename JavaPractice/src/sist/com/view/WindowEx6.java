package sist.com.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowEx6 extends JFrame {
	private JTable jTable;
	private JTableModelEx jTableModelEx;
	
	public void initTable() {
		jTableModelEx = new JTableModelEx();
		jTable = new JTable(jTableModelEx);
		this.add(new JScrollPane(jTable));
	}
	public WindowEx6() {
		initTable();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new WindowEx6();
	}
}