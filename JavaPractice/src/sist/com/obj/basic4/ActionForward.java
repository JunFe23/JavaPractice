package sist.com.obj.basic4;


//(alt+shift+s)+o »ý¼ºÀÚ
//(alt+shift+s)+r setGet
//(alt+shift+s)+v
public class ActionForward {
	private String path;
	private boolean redirect;
	
	
	public ActionForward() {
		super();
	}


	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public boolean isRedirect() {
		return redirect;
	}


	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
	
	

}
