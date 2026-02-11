package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import exceptions.BankTransactions;

public class ListExample {

	public static void main(String[] args) {
		
		System.out.println("--------------------------ArrayList--------------");
		List arrayList1 = new ArrayList();
		arrayList1.add(false);
		arrayList1.add(10);
		arrayList1.add(100);
		arrayList1.add(1000);
		arrayList1.add(1000000L);
		arrayList1.add(10.5F);
		arrayList1.add(10.103E35D);
		arrayList1.add('A');
		arrayList1.add("Hello");
		arrayList1.add(new BankTransactions());
		arrayList1.add(100);
		arrayList1.add("Hello");
		
		System.out.println(arrayList1);
		System.out.println(arrayList1.size());
		
//		boolean bool1 = (boolean)arrayList1.get(2);
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.contains(100));
		System.out.println(arrayList1.indexOf(100));
		System.out.println(arrayList1.lastIndexOf(100));
		
		System.out.println(arrayList1.isEmpty());
		
		List subArrayList = arrayList1.subList(2, 7);
		System.out.println(subArrayList);
		
		System.out.println(arrayList1.equals(subArrayList));
		
		subArrayList.clear();
		System.out.println(subArrayList);
		System.out.println(subArrayList.isEmpty());
		
		System.out.println(arrayList1);

		arrayList1.remove(arrayList1.size()-1);
		System.out.println(arrayList1);
		
		for(Object eachObj : arrayList1) {
			System.out.println(eachObj);
		}
		
		
		System.out.println("--------------------------LinkedList--------------");
		List linkedList1 = new LinkedList();
		linkedList1.add(false);
		linkedList1.add(10);
		linkedList1.add(100);
		linkedList1.add(1000);
		linkedList1.add(1000000L);
		linkedList1.add(10.5F);
		linkedList1.add(10.103E35D);
		linkedList1.add('A');
		linkedList1.add("Hello");
		linkedList1.add(new BankTransactions());
		linkedList1.add(100);
		linkedList1.add("Hello");
		
		System.out.println(linkedList1);
		

	}

}
