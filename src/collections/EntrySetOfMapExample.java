package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EntrySetOfMapExample {

	public static void main(String[] args) {
		Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
		fruitsMap.put("Apples", 50);
		fruitsMap.put("Banana", 100);
		fruitsMap.put("Cherry", 20);
		
//		EntrySet  -> {key=value, key=value, key=value}
		
		Set<Map.Entry<String, Integer>> entrySet = fruitsMap.entrySet();
		System.out.println(entrySet);
		
		for(Map.Entry<String, Integer> eachEntry: entrySet) {
			System.out.println(eachEntry);
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}

	}

}
