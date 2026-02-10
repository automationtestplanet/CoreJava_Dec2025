package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import exceptions.BankTransactions;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("------------------HashSet---------------");
		Set hashSet = new HashSet();
		hashSet.add(false);
		hashSet.add(10);
		hashSet.add(100);
		hashSet.add(1000);
		hashSet.add(1000000L);
		hashSet.add(10.5F);
		hashSet.add(10.103E35D);
		hashSet.add('A');
		hashSet.add("Hello");
		hashSet.add(new BankTransactions());
		hashSet.add(100);
		hashSet.add("Hello");

		System.out.println(hashSet);

//		hashSet.get(2)
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains(100));
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.remove(10));
		System.out.println(hashSet.remove(20));

		for (Object eachObj : hashSet) {
			System.out.println(eachObj);
		}

		System.out.println("------------------LinkedHashSet---------------");
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(false);
		linkedHashSet.add(10);
		linkedHashSet.add(100);
		linkedHashSet.add(1000);
		linkedHashSet.add(1000000L);
		linkedHashSet.add(10.5F);
		linkedHashSet.add(10.103E35D);
		linkedHashSet.add('A');
		linkedHashSet.add("Hello");
		linkedHashSet.add(new BankTransactions());
		System.out.println(linkedHashSet);

		System.out.println("------------------TreeSet---------------");
		Set treeSet = new TreeSet();
//		treeSet.add(false);
//		treeSet.add(10); // error We can not add different type of elements in the set
//		treeSet.add(100);
//		treeSet.add(1000);
//		treeSet.add(1000000L);
//		treeSet.add(10.5F);
//		treeSet.add(10.103E35D);
//		treeSet.add('A');
//		treeSet.add("Hello");
//		treeSet.add(new BankTransactions());

		treeSet.add(4);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(3);

		System.out.println(treeSet);
		
		Set treeSet2 = new TreeSet(Collections.reverseOrder());
		treeSet2.add('E');
		treeSet2.add('B');
		treeSet2.add('D');
		treeSet2.add('A');
		treeSet2.add('C');
		System.out.println(treeSet2);
		
		Set treeSet3 = new TreeSet();
		treeSet3.add("Banana");
		treeSet3.add("Cherry");
		treeSet3.add("Apple");
		System.out.println(treeSet3);
		

	}

}
