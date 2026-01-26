package fundamentals;

public class FinalVariable {
	
	final String sName = "RAM";
	final static String collegeName = "MLR College";
	
	final int sRolNum;
	
	FinalVariable(int sRolNum){
		this.sRolNum = sRolNum;
	}
	
	public void method1(final int b) {
		final int a = 100;
		System.out.println(a);
//		a = 200;  //error due to final variable
		
		System.out.println(b);
//		b = 300; //error due to final variable
	}

	public static void main(String[] args) {
		FinalVariable finalEx = new FinalVariable(1001);
		System.out.println(finalEx.sName);
		
//		finalEx.sName = "KRISH";  // error due to final variable
		
		System.out.println(FinalVariable.collegeName);
//		FinalVariable.collegeName = "Narayana";  // error due to final variable
	}

}
