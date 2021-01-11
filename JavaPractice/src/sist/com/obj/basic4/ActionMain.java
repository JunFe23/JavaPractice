package sist.com.obj.basic4;

import java.util.Scanner;

public class ActionMain {
	Scanner scanner=new Scanner(System.in);
	
	public void menu() {
		String command="";
		while(true) {
		System.out.println("1.Login 2.List 3.Delete ");
		  switch (scanner.nextInt()) {
		case 1:		
			command="login";
			break;
		case 2:
			command="list";
			break;
		case 3:
			command="delete";
			break;
		default:
			break;
		  }//swtich
		  Action action=ActionFactory.getInstance().getAction(command);
		  
		  //Action action=new LoginAction();
		  //Action action=new ListAction();
		  ActionForward af= action.execute();
		  if(af.isRedirect()) {
			  System.out.println(af.getPath()+"�����̵�");
		  }else {
			  System.out.println(af.getPath()+"�����̵�");
		  }
		  //ActionFactory.getInstance().fileAction();
		
		  
		}//while
	}
	public static void main(String[] args) {
		new ActionMain().menu();
	}

}














