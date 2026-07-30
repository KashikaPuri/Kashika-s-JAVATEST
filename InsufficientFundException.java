package tellexception;

public class InsufficientFundException extends Exception
{
	
	String insufficientb;
	
	
	public InsufficientFundException(String insufficientb) {
		super();
		this.insufficientb = insufficientb;
	}


	@Override
	public String toString() {
		return("My Exception executed");
	}
}
