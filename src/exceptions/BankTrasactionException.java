package exceptions;

public class BankTrasactionException extends RuntimeException {
	
	public BankTrasactionException(String errorMsg) {
		System.out.println(errorMsg);
	}

}
