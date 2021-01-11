package sist.com.obj.basic4;

public  class LoginAction extends Action {
	private String path;
	private boolean redirect;

	public LoginAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	@Override
	public ActionForward execute() {
		// TODO Auto-generated method stub
		System.out.println("LoginAction.....ผ๖วเม฿");
		return new ActionForward(path, redirect);
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
