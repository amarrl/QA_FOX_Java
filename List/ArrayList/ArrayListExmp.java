package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List <String> list=new ArrayList<String>(); 
		
		//using add() method for adding objects into ArrayList
		list.add("Arun"); 
		list.add("varun"); 
		list.add("Tharun"); 
		list.add("Arun"); 
	//System.out.println("llsl----------"+list); 
		System.out.println(list.size());
		
	
		
		//list.set(0, "0th"); 
	
		//list.remove("varun");
		System.out.println(list.contains("Arusn"));
		System.out.println(list.get(0));	  
		
		Iterator<String>itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("------"+itr.next());  
		}
		
		
		
		System.out.println(list);  //[Arun, varun, Tharun, Arun]
		
		ArrayList<String>list2=new ArrayList<String>();
		list2.addAll(list);
		//list2.removeAll(list2);
		
		list2.clear();
		
		list2.removeAll(list2);
		
		
		
		System.out.println("==========list 2 is "+list2);
		
		//Retrive objects of ArrayList using get()
		
		System.out.println(list.get(2));  //Tharun

		
		System.out.println("Size Of ArrayList Is "+list.size());   //4
		
		System.out.println("Iterating and printing using for each");
		
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("========================");

		System.out.println("Iterating and printing using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));  
		}
		
		System.out.println("Check whether the object is available in the Arraylist or not using isContains() method");
		
		System.out.println(list.contains("Arun"));
		
		System.out.println("=============================");
		
		System.out.println("Converting Arryalist to Array usig toArray() method");
		
		Object[] obj= list.toArray(); 
		 
		System.out.println(obj[1]);
		
		
		
		
		
		/*
		
		System.out.println("Remove the duplicate object"+list.remove("Arun"));
		System.out.println(list);
		
		System.out.println("Using clear() mrthof to remove all the objects from the ArrayList");
		list.clear();
		System.out.println(list);
		
		System.out.println("Check whether ArrayList is empltyor not usning isEmpty() method");
		
		System.out.println(list.isEmpty());
		
		*/
		List<String> fruits = new ArrayList<>(List.of("apple", "banana", "mango"));
		List<String> unwanted = List.of("banana", "mango");  //It creates an immutable list with the elements you provide.

		//cannot add, remove, or modify elements after creation.

		//Doing so will throw an UnsupportedOperationException.

		fruits.removeAll(unwanted);
		System.out.println(fruits); // Output: [apple]
		unwanted.removeAll(fruits);
		System.out.println("unwantedis "+unwanted); 

	}

}
