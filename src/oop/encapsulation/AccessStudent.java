package oop.encapsulation;

public class AccessStudent {

	public static void main(String[] args) {
		Student student1 = new Student("RAM", 101, "BTech", "MLR College");
		Student student2 = new Student("VENKAT", 102, "BTech", "MLR College");
		Student student3 = new Student("KRISH", 103, "BTech", "MLR College");
		
		System.out.println(student1.getsName());
		student1.setsName("RAMA");
		System.out.println(student1.getsName());
		
		student1.displayStudentDetails();
	}

}
