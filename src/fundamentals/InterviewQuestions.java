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
	public static void swapStringsWithoutThirdVariable(String a, String b) {
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		a = a+b;  // a = HelloWorld
		b=a.replace(b, "");  // b = Hello		
		a=a.replace(b, "");  // a = World
		
		System.out.println("---------------------------------");
		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}
	
	//Reverse a String 
	public static void reverseString(String str) {
		System.out.println("Original String: "+ str);
		String revStr = "";
		
		for(int index = str.length()-1; index >=0; index--) {
			revStr = revStr+str.charAt(index);
		}
		System.out.println("Reverse String: "+ revStr);
		
		
		String revStr2="";
		
		for(char eachChar : str.toCharArray()) {
			revStr2 = eachChar + revStr2;  // H  // eH  // leH  // lleH // olleH
		}
		
		System.out.println("Reverse String: "+ revStr2);
		
		
		String revStr3="";
		for(int index = 0; index <str.length(); index++) {
			revStr3 = str.charAt(index) + revStr3;   // H  // eH  // leH  // lleH // olleH
		}
		System.out.println("Reverse String: "+ revStr3);
		
	}

	public static void main(String[] args) {
//		swapVariables(100,200);
//		swapVariablesWithoutThirdVariable(100,200);
//		swapStringsWithoutThirdVariable("Hello","World");
		
		reverseString("Hello");
	}

}
