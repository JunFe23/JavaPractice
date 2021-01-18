package sist.com.exception;

public class PortUserException extends Exception {
	private int port;

	public PortUserException(int port) {
		super(String.valueOf(port).concat(" Port 사용불가...")); // String으로 port받아서 concat으로 뒤에 문자열 추가
		this.port=port;
	}
	
	
}
