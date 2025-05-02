package Programming;

import java.util.LinkedList;

public class ReverseLinkedListInJava {

	public static void main(String[] args) {
		LinkedList<Integer>al=new LinkedList();
		al.add(12);
		al.add(13);
		al.add(15);
		
		LinkedList<Integer>al1=new LinkedList();
		
			al.descendingIterator().forEachRemaining(al1::add);
			
			System.out.println(al1);
		

	}

}
