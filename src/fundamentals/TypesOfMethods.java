package fundamentals;

public class TypesOfMethods {

	public static void addition() { // Hard coded values method without return
		int a = 100;
		int b = 200;
		System.out.println("Addition: " + (a + b));
	}

	public static void subtraction(int a, int b) { // reusable method // here a and b are parameters
													// method with parameters without return
		System.out.println("Subtraction: " + (a - b));
	}

	public static int multiplication() { // Hard coded values method with return
		int a = 100;
		int b = 200;
		return a * b;
	}

	public static int division(int a, int b) { 
		return a / b;
	}

	public static void main(String[] args) {
		addition();

		subtraction(200, 100); // 200 and 100 are arguments
		subtraction(2000, 1000);

		System.out.println(multiplication());
		int result = multiplication();
		System.out.println(result);
		subtraction(result, 5000);
		subtraction(multiplication(), 3000); // BODMAS -> Brackets, of, Division Multiplication Addition Subtraction

		System.out.println(division(10, 3));
		System.out.println(division(100, 3));
		System.out.println(division(1000, 3));

		System.out.println(10 + 20 - 5 * 10 / 3 + (20 + 40)); // 10+20-5*10/3+60 -> 10+20-5*3+60 -> 10+20-15+60 ->
																// 30-15+60 -> 15+60 -> 75
		System.out.println(10 + 20 - 5 * 10 / 3 + (20 + 40)); // 30-5*10/3+(20+40) -> 25*10/3+(20+40) -> 250/3+(20+40)
																// -> 83+(20+40) -> 83 +60 -> 143
		
		
		int divResult1 = division(1000, 300);  // 3   // 4 bytes
		long divResult2 = division(1000, 300);  // 3  // 8 bytes
		
		byte byte1 = 3;
		
		
//		byte divResult3 = division(1000, 300);  // 3   // 1 byte
		
		
		

	}

}
