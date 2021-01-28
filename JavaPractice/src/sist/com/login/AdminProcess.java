package sist.com.login;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Vector;

public class AdminProcess {
	
	Vector<ProductMember> vector = new Vector<ProductMember>();
	static final String PATH = "/Users/junfe/Desktop/JunFe/productmember.dat";
	
	public static Vector<ProductMember> getVectorList(){
		Vector<ProductMember> v = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(PATH));
			v = (Vector<ProductMember>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		} return v;
	}
	
	public void addMember() {
		
	}
}
