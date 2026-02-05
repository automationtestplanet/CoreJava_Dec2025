package oop.abstraction;

public interface Interface1 {

	public static final int a = 100;
	
	/**
	 * Description: This method performs addition operation on two numbers and prints the results
	 * @author Raju
	 * @param a
	 * @param b
	 */
	void addition(int a, int b);

	/**
	 * Description: This method performs subtraction operation on two numbers and returns the results
	 * @param a
	 * @param b
	 * @return integer
	 */
	int subtraction(int a, int b);

	/**
	 * Description: This method performs multiplication operation on two numbers and prints the results
	 * @param a
	 * @param b
	 */
	void multiplication(int a, int b);

	
	/**
	 * Description: This method performs Division operation on two numbers and prints the results
	 * @param a
	 * @param b
	 */
	void division(int a, int b);
	
	
	
	
	public static void main(String[] args) {
//		Interface1 inf1 = new Interface1();   // We can not create a object of an interface
	}

}
