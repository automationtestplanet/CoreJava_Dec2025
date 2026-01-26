package fundamentals;

public class Student {
	
	String sName;
	int sRollNo;
	static String sQualification;
	static String collegeName;
	
	
	public void displayStudentDetails() {
		System.out.println("Student Name: "+ sName);
		System.out.println("Student Roll Number: "+ sRollNo);
		System.out.println("Student Qualification: "+ Student.sQualification);
		System.out.println("Student College Name: "+ Student.collegeName);		
	}
	
	public static void accessNonStatic() {
//		System.out.println("Student Name: "+ sName);
//		System.out.println("Student Roll Number: "+ sRollNo);
		System.out.println("Student Qualification: "+ Student.sQualification);
		System.out.println("Student College Name: "+ Student.collegeName);	
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();   // Object Creation / instance creation
		//student1 is instance(object) reference variable
		
//		System.out.println(sName);
		student1.sName = "RAM";
		student1.sRollNo = 101;
		Student.sQualification = "BTech";
		Student.collegeName = "MLR College";
		
		Student student2 = new Student();
		student2.sName = "VENKAT";
		student2.sRollNo = 102;
		Student.sQualification = "BTech";
		Student.collegeName = "MLR College";
		
		
		Student student3 = new Student();
		student3.sName = "KRISH";
		student3.sRollNo = 103;
		Student.sQualification = "BTech";
		Student.collegeName = "MLR College";
		
		
		student1.sRollNo = 104;
		student1.displayStudentDetails();
		System.out.println("--------------------------------------------------");
		student2.displayStudentDetails();
		System.out.println("--------------------------------------------------");
		student3.displayStudentDetails();	
	}
}
