package sist.com.util2;

public class Member1 {
	private String id;
	private String name;
	private String email;
	private String adress;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Member1 [id=" + id + ", name=" + name + ", email=" + email + ", adress=" + adress + "]";
	}
	
	
	
}
