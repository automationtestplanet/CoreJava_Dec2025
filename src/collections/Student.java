package collections;

public class Student {

	String sName;
	int sRollNo;
	static String sQualification;
	static String collegeName;

	public Student(String sName, int sRollNo, String sQualification, String collegeName) {

		this.sName = sName;
		this.sRollNo = sRollNo;
		Student.sQualification = sQualification;
		Student.collegeName = collegeName;
	}

	public void displayStudentDetails() {
		System.out.println("Student Name: " + this.sName);
		System.out.println("Student Roll Number: " + this.sRollNo);
		System.out.println("Student Qualification: " + Student.sQualification);
		System.out.println("Student College Name: " + Student.collegeName);
	}
}
