package inner.classes;

public interface InterfaceWithAnonymousClass {

	public static final int a = 100;

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
	 * returns the results
	 * 
	 * @param a
	 * @param b
	 * @return integer
	 */
	int subtraction(int a, int b);

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

	public static void main(String[] args) {
		InterfaceWithAnonymousClass infAnoCls = new InterfaceWithAnonymousClass() {
			@Override
			public void addition(int a, int b) {
				System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
			}

			@Override
			public int subtraction(int a, int b) {
				return a - b;
			}

			@Override
			public void multiplication(int a, int b) {
				System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));

			}

			@Override
			public void division(int a, int b) {
				System.out.println("Division of " + a + " and " + b + " = " + (a / b));

			}
		};

		infAnoCls.addition(10, 20);
		System.out.println(infAnoCls.subtraction(10, 3));
		infAnoCls.multiplication(10, 20);
		infAnoCls.division(10, 3);
	}

}
