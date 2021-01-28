package sist.com.io2;

import java.io.Serializable;

public class ProductMember implements Serializable { // 직렬화 대상 구현.
	private String name;
	private String id;
	private String password;
	
	public ProductMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductMember(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ProductMember [name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	
	
	
	
	
}
