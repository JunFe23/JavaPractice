package sist.com.exception;

public class StringUserException extends IndexOutOfBoundsException {
	
	public StringUserException() {
		super("문자열 index 확인하세요");
	}
}
