package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GenericClasses {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000);

//		list1.add(false);		
//		list1.add(1000000L);
//		list1.add(10.5F);
//		list1.add(10.103E35D);
//		list1.add('A');
//		list1.add("Hello");
//		list1.add(new BankTransactions());

		for (int eachNum : list1) {
			System.out.println(eachNum * 5);
		}

		Set<Character> charsSet = new HashSet<Character>();
		charsSet.add('A');
		charsSet.add('a');
		charsSet.add('2');
		charsSet.add('#');

		for (char eachChar : charsSet) {
			System.out.println(eachChar);
		}

		Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
		fruitsMap.put("Apples", 50);
		fruitsMap.put("Banana", 100);
		fruitsMap.put("Cherry", 20);

//		fruitsMap.put(100, "DragonFruit");
//		fruitsMap.put("DragonFruit", "100");
		
//		EntrySet  -> {key=value, key=value, key=value}
		

		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("RAM", 101, "BTech", "MLR College"));
		studentsList.add(new Student("VENKAT", 102, "BTech", "MLR College"));
		studentsList.add(new Student("KRISH", 103, "BTech", "MLR College"));
//		studentsList.add(10);
//		studentsList.add(new GenericClasses());

		for (Student eachStudent : studentsList) {
			System.out.println("----------------------------------------------------");
			eachStudent.displayStudentDetails();
		}
		
		for (var eachData : studentsList) {
			System.out.println("----------------------------------------------------");
			eachData.displayStudentDetails();
		}
		
		
	}

}
