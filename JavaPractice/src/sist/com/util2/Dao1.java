package sist.com.util2;

import java.util.Vector;

import sist.com.view.TableModelEx2_1;

public class Dao1 {
	private Vector<Member1> vector = new Vector<Member1>();
	private static Dao1 dao1;
	private TableModelEx2_1 TableModelEx2_1;
	
	public static Dao1 getDao() {
		if(dao1==null)
			dao1=new Dao1();
		return dao1;
	}
	
	public Vector<Member1> getVector(){
		return vector;
	}
	
}
