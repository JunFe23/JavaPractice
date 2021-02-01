package sist.com.io2;

import javax.swing.table.AbstractTableModel;

public class MemberTable extends AbstractTableModel{
	public Object data [][];
	String []name = {"Id","Password","Name"};
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return name.length;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return data;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return super.isCellEditable(rowIndex, columnIndex);
	}
	
	
	
}
