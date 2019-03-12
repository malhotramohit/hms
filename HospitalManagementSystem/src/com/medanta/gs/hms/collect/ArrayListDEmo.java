package com.medanta.gs.hms.collect;

import java.util.ArrayList;


public class ArrayListDEmo {

	public static void main(String[] args) {
		
		//generics
		//arraylist can store only objects
		
		ArrayList<Integer> list =  new ArrayList<Integer>(5);
		
		// create, insert, iterate, delete, update
		
		
		//add()
		list.add(34); // auto boxing primitive 34 to new Integer(34)
		list.add(new Integer(45));
		list.add(89);
		list.add(91);
		
		//array[2], get()
		
		int num = list.get(2);  // unboxing Integere--> .valueOf()

		System.out.println(num);
		
		
		int size = list.size();
		System.out.println(size);
		
		displayList(list);
		
		System.out.println("----add index wala----");
		
		list.add(2, 90);
		
		displayList(list);
		
		System.out.println("----set index wala----");
		list.set(2,999);
		
		displayList(list);
		
		//int num1 = list.get(9);
		
		ArrayList<Integer> list2 = null; // DB 
		System.out.println("----exp index wala----");

		// null
		list.set(2, null);
		System.out.println("----set null index wala----");
		displayList(list);
		list.add(2, 8989);
		list.add(null);
		System.out.println("----set/add null index wala----");

		displayList(list);
		
		checkIfEmpty(list);
	
		//ArrayList<Integer> 
		
		// remove(index), 
		//int num1 = list.remove(3);
		int num2 = list.remove(2);
		System.out.println("---remove index---");
		displayList(list);
		
		// 
		ArrayList<Integer> list22 = new ArrayList<>();
		list22.add(2);
		list22.add(3);
		list22.add(4);
		list22.add(5);
		
		
		ArrayList<Integer> list33 = new ArrayList<>();
		list33.add(3);
		list33.add(4);
		
		list22.removeAll(list33);
		
		System.out.println("--after removeall---");
		displayList(list22);
		
		
		
		
	}

	private static void checkIfEmpty(ArrayList<Integer> list) {
		if(list.isEmpty() == false) {
			System.out.println("----list is not empty ----");

		}
		else {
			System.out.println("----list is  empty ----");

		}
	}

	private static void displayList(ArrayList<Integer> list) {
		// iterate full
			if(null!=list) {
				for(int i = 0; i<list.size() ;i++) {
					System.out.println(list.get(i));
				}
			}
	}

}
