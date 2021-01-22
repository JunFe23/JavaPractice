package sist.com.view;

import javax.swing.table.AbstractTableModel;

public class JTableModelEx extends AbstractTableModel{
	Object [][]data = {{"1", "������", "ũ����Ż", 22, "������"},
						{"2", "������", "���ϳ�", 42, "������"},
						{"3", "���¿�", "����", 12, "������"},
						{"4", "ö��", "öö��", 22, "��⵵"}
						};
	String []item = {"NO", "NAME", "NICK", "AGE", "ADDR"};
	
	
	
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
	public boolean isCellEditable(int rowIndex, int columnIndex) { // cell���� ������ ���� �����Ѱ�?
		// TODO Auto-generated method stub
		return columnIndex!=0?true:false; 
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex] = aValue;
	}

	@Override
	public int getRowCount() { //�� ����
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
