package oop.abstraction;

abstract public class AbstractClass {

	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	abstract public int subtraction(int a, int b);

	public void multiplication(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
	}

	abstract public void division(int a, int b);

	public static void main(String[] args) {
//		AbstractClass absClss = new AbstractClass();  // We can not create a object of an Abstract Class

	}

}
