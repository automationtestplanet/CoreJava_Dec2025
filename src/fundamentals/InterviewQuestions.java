package fundamentals;

public class InterviewQuestions {

	// write reusable program to swap two variables
	public static void swapVariables(int a, int b) {
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		int c = a;  //c=  100
		a = b;  // q = 200;
		b = c; // b = 100
		
		System.out.println("---------------------------------");
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
	}
	
	// write reusable program to swap two variables without using third variable
	public static void swapVariablesWithoutThirdVariable(int a, int b) {
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		
		a = a+b;  // a = 100+200;
		b = a-b; // b = 300-200  = 100
		a = a-b; // a = 300 - 100 = 200
		
		System.out.println("---------------------------------");
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
	}

	// write reusable program to swap two string without using third variable

	public static void main(String[] args) {
		swapVariablesWithoutThirdVariable(100,200);
	}

}
