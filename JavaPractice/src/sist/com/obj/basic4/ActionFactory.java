package sist.com.obj.basic4;



public class ActionFactory {
	
	static ActionFactory actionFactory;
	
	public  static ActionFactory getInstance(){
		  if(actionFactory==null) {
			  return new ActionFactory();
		  }
		  return actionFactory;
	}	
		
	
	
	public  Action getAction(String command) {
		if(command.equals("login")) {
			return new LoginAction("list.txt", false);
		}//if
		else if(command.equals("list")) {
			return new ListAction("view.txt",true);
		}
		
		return null;
	}//action
	
	public   void fileAction() {
		System.out.println("fileAction");
	}
	

}
