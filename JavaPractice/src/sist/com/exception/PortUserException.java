package sist.com.exception;

public class PortUserException extends Exception {
	private int port;

	public PortUserException(int port) {
		super(String.valueOf(port).concat(" Port ���Ұ�...")); // String���� port�޾Ƽ� concat���� �ڿ� ���ڿ� �߰�
		this.port=port;
	}
	
	
}
