package java_example;

public class InvalidAgeException extends Exception {

	private int invalidAge;
	public InvalidAgeException(String errorMessage, int invalidAge){
		super(errorMessage);
		this.invalidAge = invalidAge;
	}
	public String getMessage(){
		String errMsg = super.getMessage();
		errMsg = errMsg + ": "+ invalidAge;
		return errMsg;
	}
}
