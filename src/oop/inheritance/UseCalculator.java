package oop.inheritance;

public class UseCalculator {
	
	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		calc.addition(10, 20);
//		calc.subtraction(100, 20);
//		calc.multiplication(10, 20);
//		calc.division(10, 3);
		
		NewCalculator newCalc = new NewCalculator();
		newCalc.addition(10, 20);
		newCalc.subtraction(100, 20);
		newCalc.multiplication(10, 20);
		newCalc.division(10, 3);		
		newCalc.modDivision(10, 3);
	}

}
