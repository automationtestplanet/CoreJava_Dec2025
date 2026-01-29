package oop.polymorphism;

public class TypeConversion {

	public static void main(String[] args) {
		NewCalculator newalc = new NewCalculator();
		newalc.addition(10, 20);
		newalc.modDivision(10, 3);
		System.out.println("Subtraction of 100 and 20 " + newalc.subtraction(100, 20)); // it is calling the overriding
																						// method

		System.out.println("----------------------------------------------------");
		Calculator calc = newalc; // up-casting
		calc.addition(10, 20);
		System.out.println("Subtraction of 100 and 20 " + calc.subtraction(100, 20)); // it is calling the overriding
																						// method
//		calc.modDivision(10, 3);   // modDivision() is not available in the Calculator memory

		System.out.println("----------------------------------------------");

		newalc = (NewCalculator) calc; // Down-casting
		newalc.addition(10, 20);
		newalc.modDivision(10, 3);
		System.out.println("Subtraction of 1000 and 200 " + newalc.subtraction(1000, 200)); // it is calling the
																							// overriding method

	}

}
