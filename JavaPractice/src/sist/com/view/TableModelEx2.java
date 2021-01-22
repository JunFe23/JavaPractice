package sist.com.view;

import javax.swing.table.AbstractTableModel;

public class TableModelEx2 extends AbstractTableModel{
	Object [][]data = {		};
	String []item = {"ID", "NAME", "EMAIL", "ADDR"};
	
	//public static int COL=item.length;
	
	
	
	public TableModelEx2(Object[][] data) {
		super();
		this.data = data;
	}

	public TableModelEx2() {
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
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return item[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) { // cell안의 데이터 수정 가능한가?
		// TODO Auto-generated method stub
		return columnIndex!=0?true:false; 
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex] = aValue;
	}

	@Override
	public int getRowCount() { //행 개수
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return item.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	
}
