package fundamentals;

public class ConstrutorExample {
	
	String sName;
	int sRollNo;
	static String sQualification;
	static String collegeName;
	
	public ConstrutorExample(String sName, int sRollNo, String sQualification, String collegeName){
//		int a = 100;
//		a = a;
		
		this.sName = sName;
//		student1.sName = sName;
		this.sRollNo = sRollNo;
		ConstrutorExample.sQualification = sQualification;
		ConstrutorExample.collegeName = collegeName;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student Name: "+ this.sName);
		System.out.println("Student Roll Number: "+ this.sRollNo);
		System.out.println("Student Qualification: "+ ConstrutorExample.sQualification);
		System.out.println("Student College Name: "+ ConstrutorExample.collegeName);		
	}
	
	public static void accessNonStatic() {
//		System.out.println("Student Name: "+ sName);
//		System.out.println("Student Roll Number: "+ sRollNo);
		System.out.println("Student Qualification: "+ ConstrutorExample.sQualification);
		System.out.println("Student College Name: "+ ConstrutorExample.collegeName);	
	}
	
	public static void main(String[] args) {
		ConstrutorExample student1 = new ConstrutorExample("RAM", 101, "BTech","MLR College");   // Object Creation / instance creation		
		
		ConstrutorExample student2 = new ConstrutorExample("VENKAT", 102, "BTech","MLR College");		
		
		ConstrutorExample student3 = new ConstrutorExample("KRISH", 103, "BTech","MLR College");
		
//		System.out.println(sName);
//		System.out.println(this.sName);
		System.out.println(student1.sName);
		
//		student1.sRollNo = 104;
		student1.displayStudentDetails();
		System.out.println("--------------------------------------------------");
		student2.displayStudentDetails();
		System.out.println("--------------------------------------------------");
		student3.displayStudentDetails();	
	}
}
