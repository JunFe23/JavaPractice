package sist.com.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class AdminProcess {
	
	Vector<ProductMember> vector = new Vector<ProductMember>();
	static final String PATH = "/Users/junfe/Desktop/JunFe/product.dat";
	
	public static Vector<ProductMember> getVectorList(){
		Vector<ProductMember> v = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(PATH));
			v = (Vector<ProductMember>)ois.readObject();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null)ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} return v;
	}
	
	
	public static void saveAsMember(Vector<ProductMember> member) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(PATH));
			oos.writeObject(member);
			oos.flush();
			System.out.println("FileSuccess");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void addMember() {
		vector.add(new ProductMember("김준철", "JunFe123", "kkk123"));
		vector.add(new ProductMember("김성빈", "king123", "kkk123"));
		vector.add(new ProductMember("최정연", "cjy123", "kkk123"));
		vector.add(new ProductMember("박효진", "phj123", "kkk123"));
		vector.add(new ProductMember("쌤", "soo123", "kkk123"));
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(PATH));
			oos.writeObject(vector);
			oos.flush();
			System.out.println("FileSuccess");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		AdminProcess a = new AdminProcess();
		a.addMember();
		
	}
	
}
