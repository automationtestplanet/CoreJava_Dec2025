package oop.encapsulation;

public class Student {

	private String sName;
	private int sRollNo;
	private static String sQualification;
	private static String collegeName;

	public Student(String sName, int sRollNo, String sQualification, String colegeName) {
		this.sName = sName;
		this.sRollNo = sRollNo;
		Student.sQualification = sQualification;
		Student.collegeName = colegeName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	public static String getsQualification() {
		return sQualification;
	}

	public static void setsQualification(String sQualification) {
		Student.sQualification = sQualification;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	public void displayStudentDetails() {
		System.out.println("Student Name: " + sName);
		System.out.println("Student Roll Number: " + sRollNo);
		System.out.println("Student Qualification: " + Student.sQualification);
		System.out.println("Student College Name: " + Student.collegeName);
	}

}
