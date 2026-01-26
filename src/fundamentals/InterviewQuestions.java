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

	public static void main(String[] args) {
		swapVariables(100,200);
	}

}
