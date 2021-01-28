package sist.com.io2;

import java.util.Vector;

public class DaoProduct {
	static Vector<ProductMember> vector;
	static { // dao를 부를 때마다 새로 생성하지 않고 사용할 수 있게 만들어줌.
		vector = AdminProcess.getVectorList();
	}
	
	public static Boolean idPassCheck(String id, String password) {
		for(ProductMember m : vector) {
			if(m.getId().equals(id)&&m.getPassword().equals(password)) {
				return true;
			} // if
		} // for
		return false;	
	} 
}
