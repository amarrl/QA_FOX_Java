package Set;

import java.util.TreeSet;

public class TreeSetEmp {

	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet(new CustomizedSorting());  //defualt sorting order as we didn't secify anthing in the custroctor
		//t.add("Arun kumar");
		//t.add("Kendriya");
		//t.add("Chandu");
		t.add(96);
		t.add(99);
		t.add(98);
		t.add(97);
		t.add(99);
		
		
		
		
	
		//t.add('A');
		
		
		System.out.println(t);
		

	}

}
