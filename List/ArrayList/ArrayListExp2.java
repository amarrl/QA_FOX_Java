package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.print.DocFlavor.STRING;

public class ArrayListExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList <String> list=new ArrayList<>();
		
		//using add() method for adding objects into ArrayList
		list.add("Arun");
		list.add("varun");
		list.add("Tharun");
		list.add("Arun");
		
	 
		
		/*
		list.add(0, "Amar");
		System.out.println(list);
		System.out.println("=============================");
		
		System.out.println("InOrder to replce the exsiting obje with new one will use Set() method");
		
		list.set(0, "Amar Raj");
		
		System.out.println("After Setting new object"+list);
		
		System.out.println("Inorder to get the index of the object need to use indexOf()method if object not there means returns -1");
		
		System.out.println(list.indexOf("Index value is "+"Amar Rajj"));
		
		System.out.println("IndexofLast occurance of the object is "+list.lastIndexOf("Arun"));
		
		//sorting the array list in asendeing order
		//System.out.println("===============");
		//Collections.sort(list);
		System.out.println(list);
		
		//useing iterator method for iterating and retriving the Arraylist object one by one
		System.out.println("=================");
		
		Iterator i=list.iterator();
		
		while(i.hasNext()) {
			System.out.println("Using iterator  "+i.next());
		}
		System.out.println("===============listIterator");
		*/
		//listIerator ius advance one 
		
		ListIterator listitr=list.listIterator();
		listitr.next();   // cursor ponting to 1st object
		listitr.next();   // cursor ponting to 2st object
		listitr.next();   // cursor ponting to 3st object
		listitr.next();   // cursor ponting to 4st object i.e Arun
		
		
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		
  
		List<String> fruits = new ArrayList<>(List.of("apple", "banana", "mango"));
		List<String> unwanted = List.of("banana", "mango");  //It creates an immutable list with the elements you provide.

		//cannot add, remove, or modify elements after creation.

		//Doing so will throw an UnsupportedOperationException.

		fruits.removeAll(unwanted);
		System.out.println(fruits); // Output: [apple]
		unwanted.removeAll(fruits);
		System.out.println("unwantedis "+unwanted);

	}

	private static void ListOf(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
