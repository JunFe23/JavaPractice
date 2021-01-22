package sist.com.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowEx8 extends JFrame {
	private JTable jTable;
	private TableModelEx2 TableModelEx2;
	
	public void initTable() {
		TableModelEx2 = new TableModelEx2();
		jTable = new JTable(TableModelEx2);
		
		this.add(new JScrollPane(jTable));
	}
	public WindowEx8() {
		initTable();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new WindowEx8();
	}
}