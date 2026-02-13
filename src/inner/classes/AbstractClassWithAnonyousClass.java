package inner.classes;

abstract public class AbstractClassWithAnonyousClass {

	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
	}

	abstract public int subtraction(int a, int b);

	public void multiplication(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
	}

	abstract public void division(int a, int b);

	public static void main(String[] args) {
		AbstractClassWithAnonyousClass absClss = new AbstractClassWithAnonyousClass() {
			@Override
			public int subtraction(int a, int b) {
				return a-b;
			}

			@Override
			public void division(int a, int b) {
				System.out.println("Division: "+ (a/b));
				
			}			
		};  
		
		absClss.addition(10, 20);
		System.out.println("Subtraction: "+absClss.subtraction(10, 3));
		absClss.multiplication(10, 3);
		absClss.division(10, 3);

	}

}
