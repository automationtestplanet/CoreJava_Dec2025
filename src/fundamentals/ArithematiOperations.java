package fundamentals;

import calculator.Calculator;
import calculator.UseCalculator;
//import calculator.ImplementsCalculator; // default of other package can not be accessed

public class ArithematiOperations {

	public static void main(String[] args) {
//		Calculator calc = new ImplementsCalculator();
		
		Calculator calc = new UseCalculator();
		calc.addition(10, 20);
		calc.subtraction(10, 3);
		calc.multiplication(10, 20);
		calc.division(10, 3);
	}

}
