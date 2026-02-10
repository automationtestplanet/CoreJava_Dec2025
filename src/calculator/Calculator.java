package calculator;

public interface Calculator {
	/**
	 * Description: This method performs addition operation on two numbers and
	 * prints the results
	 * 
	 * @author Raju
	 * @param a
	 * @param b
	 */
	void addition(int a, int b);

	/**
	 * Description: This method performs subtraction operation on two numbers and
	 * prints the results
	 * 
	 * @param a
	 * @param b
	 * @return integer
	 */
	void subtraction(int a, int b);

	/**
	 * Description: This method performs multiplication operation on two numbers and
	 * prints the results
	 * 
	 * @param a
	 * @param b
	 */
	void multiplication(int a, int b);

	/**
	 * Description: This method performs Division operation on two numbers and
	 * prints the results
	 * 
	 * @param a
	 * @param b
	 */
	void division(int a, int b);

}
