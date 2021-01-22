package sist.com.util2;

import java.util.Vector;

import sist.com.view.TableModelEx2;

public class Dao {
	private Vector<Member> vector = new Vector<Member>();
	private static Dao dao;
	private TableModelEx2 tableModelEx2;
	public static Dao getDao() {
		if(dao==null)
			dao=new Dao();
		return dao;
	}	
	
	
	
	
	
	
	
	
	public Vector<Member> getVector() {
		return vector;
	}
	int i;
	public int searchIndex(String id) {
		for (i = 0; i < vector.size(); i++) {
			if(vector.elementAt(i).getId().equals(id)) return i;
		}
		return -1;
	}

	public Member getMember(int index) {
		return vector.elementAt(index);
	}


	public void memberAdd(Member member) {
		vector.addElement(member);
	}
	
	public void memberModify(Member member) {
		vector.setElementAt(member, i);
	}
	
	
	
	public boolean idCheck(String id) {
		for (int i = 0; i < vector.size(); i++) {
			if(vector.get(i).getId().equals(id)) return true; // id를 비교해서 입력한 id랑 같으면 true 리턴
		}
		return false;
	}
	
	
}
