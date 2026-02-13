package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamClass {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(100);
		list1.add(1000);
		list1.add(10000);

		System.out.println("--------------------Normal For Loop-------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) * 5);
		}

		System.out.println("--------------------Enhanced For Loop-------------");
		for (int eachNum : list1) {
			System.out.println(eachNum * 5);
		}

		System.out.println("--------------------Consumer with Functional Inetrface-------------");
		list1.forEach(eachVal -> System.out.println(eachVal * 5));

		System.out.println("--------------------Consumer with Method Reference-------------");
		list1.forEach(System.out::println);

		Set<Integer> charsSet = new HashSet<>();
		charsSet.add(11);
		charsSet.add(12);
		charsSet.add(13);
		charsSet.add(14);
		charsSet.add(15);

		System.out.println("--------------------Stream Filter-------------");
		charsSet.stream().filter(eachVal -> eachVal % 2 != 0).forEach(System.out::println);

		System.out.println("--------------------Stream Reduce-------------");
		int sum = charsSet.stream().reduce(1, (val1, val2) -> val1 + val2);
		System.out.println(sum);

		System.out.println("--------------------Stream Map-------------");
		charsSet.stream().map(eachVal -> eachVal * 10).forEach(System.out::println);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(14);
		list2.add(13);
		list2.add(11);
		list2.add(15);
		list2.add(12);
		System.out.println("--------------------Before Sortingr-------------");
		System.out.println(list2);
		
		System.out.println("--------------------After Sorting in a ascending order-------------");
		Collections.sort(list2);
		System.out.println(list2);
		
		System.out.println("--------------------After Sorting in a descending order-------------");
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list2);
		

		Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
		fruitsMap.put("Apples", 50);
		fruitsMap.put("Banana", 100);
		fruitsMap.put("Cherry", 20);
		
		System.out.println("--------------------Print Map Data using consumer-------------");
		fruitsMap.forEach((key,val)-> System.out.println(key+" "+ val));


		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("RAM", 102, "BTech", "MLR College"));
		studentsList.add(new Student("VENKAT", 101, "BTech", "MLR College"));
		studentsList.add(new Student("KRISH", 103, "BTech", "MLR College"));
		
		System.out.println("--------------------Print Student map Data using consumer-------------");
		studentsList.forEach(eachStd -> System.out.println(eachStd.getsName()+ " "+ eachStd.getsRollNo()+" "+ eachStd.getsQualification()+" "+ eachStd.getCollegeName()));
//		Collections.sort(studentsList);
		
		Collections.sort(studentsList, (std1,std2)-> Integer.compare(std1.getsRollNo(), std2.getsRollNo()));
		System.out.println("--------------------Print Student map Data using consumer after sorting-------------");
		studentsList.forEach(eachStd -> System.out.println(eachStd.getsName()+ " "+ eachStd.getsRollNo()+" "+ eachStd.getsQualification()+" "+ eachStd.getCollegeName()));
		
	}

}
