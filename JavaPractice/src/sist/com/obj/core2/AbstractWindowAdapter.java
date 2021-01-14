package sist.com.obj.core2;

public abstract class AbstractWindowAdapter implements WindowInterface {

	@Override
	public void windowOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing() {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
	}

	@Override
	public void windowClosed() {
		// TODO Auto-generated method stub
		System.out.println("windowClosed()");
	}

	@Override
	public void windowActive() {
		// TODO Auto-generated method stub
		
	}

}
