package exceptions;

public class UseUserDefinedException {

	public void division(int a, int b) {
		try {
			if (b == 0) {
				throw new UserDefinedException("Disible by zero is not possible, pass B value greater than zero");
			} else {
				System.out.println("Division: " + a / b);
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		UseUserDefinedException obj1 =  new UseUserDefinedException();
		
		obj1.division(100, 0);
		
	}

}
