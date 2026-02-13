package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CursorsExample {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
//	->	start
		list1.add(10);  // <-
		list1.add(100);
		list1.add(1000);
		list1.add(10000);
//		<- ends
		
//		System.out.println(list1.get(3));
		
		Iterator<Integer> itr1 = list1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set<Character> charsSet = new HashSet<Character>();
		charsSet.add('A');
		charsSet.add('a');
		charsSet.add('2');
		charsSet.add('#');

		Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
		fruitsMap.put("Apples", 50);
		fruitsMap.put("Banana", 100);
		fruitsMap.put("Cherry", 20);

		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("RAM", 101, "BTech", "MLR College"));
		studentsList.add(new Student("VENKAT", 102, "BTech", "MLR College"));
		studentsList.add(new Student("KRISH", 103, "BTech", "MLR College"));
	}

}
