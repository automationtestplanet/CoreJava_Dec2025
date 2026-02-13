package oop.abstraction;

public class MethodReferences {

	public static void subtraction(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}

	public int division(int a, int b) {
		return (a / b);
	}

	public static void main(String[] args) {

//		MethodReferences.subtraction(10, 3);

		// Static Method reference
		FunctionalInterface3 funIf3 = MethodReferences::subtraction;
		funIf3.addition(10, 3);

		MethodReferences methodRef = new MethodReferences();
//		System.out.println(methodRef.division(10, 3));

		// Instance Method reference
		FunctionalInterface4 funInf4 = methodRef::division;
		System.out.println(funInf4.multiplication(10, 3));
	}

}
