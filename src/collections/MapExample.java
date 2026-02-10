package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		System.out.println("------------------HashMap----------------");
		Map hashMap1 = new HashMap();
		hashMap1.put("Name", "Raju");
		hashMap1.put("RollNo", 1001);
		hashMap1.put("Qualification", "BTech");
		hashMap1.put("Location", "Hyd");
		System.out.println(hashMap1);
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1.containsKey("Name"));
		System.out.println(hashMap1.containsValue("Raju"));
		System.out.println(hashMap1.keySet());
		System.out.println(hashMap1.values());
		hashMap1.remove("Qualification");
		System.out.println(hashMap1);
		hashMap1.put("Qualification", null);
		System.out.println(hashMap1);
		
		hashMap1.put(null, 35);
		System.out.println(hashMap1);

		System.out.println("------------------LinkedHashMap----------------");
		Map linkedHashMap1 = new LinkedHashMap();
		linkedHashMap1.put("Name", "Raju");
		linkedHashMap1.put("RollNo", 1001);
		linkedHashMap1.put("Qualification", "BTech");
		linkedHashMap1.put("Location", "Hyd");
		System.out.println(linkedHashMap1);
		
		linkedHashMap1.put("ColleName", null);
		System.out.println(linkedHashMap1);
		
		linkedHashMap1.put(null, 35);
		System.out.println(linkedHashMap1);

		System.out.println("------------------TreeMap----------------");
		Map treeMap1 = new TreeMap();   // Keys must be same type
		treeMap1.put("Name", "Raju");
		treeMap1.put("RollNo", 1001);
		treeMap1.put("Qualification", "BTech");
		treeMap1.put("Location", "Hyd");
		System.out.println(treeMap1);
		treeMap1.put("ColleName", null);
		System.out.println(treeMap1);

		System.out.println("------------------HashTable----------------");
		Map hashTable1 = new Hashtable();
		hashTable1.put("Name", "Raju");
		hashTable1.put("RollNo", 1001);
		hashTable1.put("Qualification", "BTech");
		hashTable1.put("Location", "Hyd");
		System.out.println(hashTable1);
//		hashTable1.put("ColleName", null);   // Can not add null value
//		hashTable1.put(null, 35);			// can not add null key
		System.out.println(hashTable1);
	}

}
