package sist.com.view;

import javax.swing.table.AbstractTableModel;

public class TableModelEx2_1 extends AbstractTableModel {
	Object [][]data = {};
	String []item = {"ID", "NAME", "EMAIL", "ADDR"};
	
	
	
	
	
	
	public TableModelEx2_1(Object[][] data) {
		super();
		this.data = data;
	}

	public TableModelEx2_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Object[][] getData() {
		return data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}

	public String[] getItem() {
		return item;
	}

	public void setItem(String[] item) {
		this.item = item;
	}

	
	
	
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
