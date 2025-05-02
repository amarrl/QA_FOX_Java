package Set;

import java.util.TreeSet;

public class TreeSetExmp2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		
		t.add(12); 
		t.add(9);
		t.add(10);
		t.add(5);
		t.add(6);
		t.add(2);
		System.out.println("Sorted set methods");
		System.out.println(t.getFirst()); 
		System.out.println(t.getLast());
		System.out.println(t.headSet(9));  //s < than 9 objects will be printed
		
		System.out.println(t.tailSet(9));  //>=5 values will be printed
		System.out.println(t.subSet(5, 12));  // >=5 and <5 values will be printed 
		
		
		
		
		System.out.println("=================================");
       System.out.println("NavigableSet Methods");
       
       System.out.println(t.lower(10));  // <10 and find the first highest  //  9
       System.out.println(t.higher(5));  // >5 and find the first leasts  // 6
       
       System.out.println(t.floor(9));  // <=9 and find the first gretest  //9 itself
       
       System.out.println(t.floor(15));  // <=9 and find the first gretest  //12
       
       System.out.println(t.ceiling(5)); //>=5 and find the least //5
       
       System.out.println("=========================");
       
       System.out.println("Before polling"+t);
       
       System.out.println(t.pollFirst());   // fisrt object will not be there
       
       System.out.println("After polling"+t);
       
       System.out.println(t.pollLast()); 
       
       System.out.println(t);
       
       
       
       //System.out.println(t.descendingSet());
       
       
	}

}
