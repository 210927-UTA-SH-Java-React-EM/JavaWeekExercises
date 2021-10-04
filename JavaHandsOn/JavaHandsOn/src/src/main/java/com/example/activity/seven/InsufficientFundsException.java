package src.main.java.com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException  extends RuntimeException {
	
	public InsufficientFundsException(String message) {
		super(message);
	}
	
	public InsufficientFundsException() {
		super("Insufficient Funds");
	}
	
}
