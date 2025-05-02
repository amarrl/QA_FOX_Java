package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sumn {

	public static void main(String[] args) {

List<Integer>list1=new ArrayList<>();

list1.add(0,1);
list1.add(1,2);
list1.add(2,2); 

//list1.removeAll(list1);

System.out.println(list1);

List<Integer>list2=new ArrayList<>();


list2.addAll(list1); 
list2.add(2,3); 
System.out.println(list2); 

boolean var=list2.contains(2);
System.out.println(var);

System.out.println("is :"+list1.containsAll(list2)); 

System.out.println("Bollean is "+list2.removeAll(list1)+"values are "+list2);  //3 will be printed
 
System.out.println(list2);
System.out.println("----------"); 
Iterator itr=list1.iterator();
while(itr.hasNext()) {
	
	System.out.println(itr.next());
}


	}

}
