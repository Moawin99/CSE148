package p2_customExceptionClass;

public class InvalidGPAException extends Exception{
	
	public InvalidGPAException(String message) {
		super(message);
	}
	
	public InvalidGPAException() {
		super();
	}
}
