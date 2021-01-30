package sist.com.io2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberList extends JFrame{
	JTable jTable;
	MemberTable mTable;
	
	public MemberList() {
		mTable = new MemberTable();
		jTable = new JTable(mTable);
		this.add(new JScrollPane(jTable));
		this.setBounds(getBounds());
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
