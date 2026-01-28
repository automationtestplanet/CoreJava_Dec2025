package oop.inheritance;

public class NewCalculator extends Calculator {

	public void modDivision(int a, int b) {
		System.out.println("Modular Division Remainder: " + (a % b));
	}
}
