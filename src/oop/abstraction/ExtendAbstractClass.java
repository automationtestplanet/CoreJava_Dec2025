package oop.abstraction;

public class ExtendAbstractClass extends AbstractClass {

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division of " + a + " and " + b + " = " + a / b);

	}

	public static void main(String[] args) {

		ExtendAbstractClass extAbsCls = new ExtendAbstractClass();

		AbstractClass absCls = extAbsCls;

		absCls.addition(10, 20);
		System.out.println(absCls.subtraction(10, 3));
		absCls.division(10, 3);
		
		AbstractClass absCls2 = new ExtendAbstractClass();
		absCls2.multiplication(10, 20);
		System.out.println(absCls2.subtraction(100, 20));

	}

}
