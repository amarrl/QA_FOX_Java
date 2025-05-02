package HashMapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/*
		Map<Integer,String>map=new HashMap<>();

		map.put(1,"Amar");
		map.put(2,"raj");
		map.put(3,"kumar");
		map.put(4,"Ravi");



		System.out.println(map);

		for(Map.Entry ee:map.entrySet()){

		System.out.println(ee.getKey() +" "+ee.getValue());

		}

		Set val=map.entrySet();

		Iterator itr=val.iterator();

		while(itr.hasNext()){
			
		Map.Entry entry=(Entry) itr.next();
		
	

		System.out.println(entry.getKey()+" "+entry.getValue() );

		}
		*/
		int a[] = {1, 2, 3, 4, 6, 7, 8, 9};
		int b[] = {4, 5, 13, 24, 56, 8, 3};


		List<Integer>unique=new ArrayList<>();
		Set<Integer>dup=new HashSet<>();

	
		for(int k:a) {
			unique.add(k);
		}
		
		for(int l:b) {
			if(unique.contains(l)) {
				dup.add(l);
			}
		}

		System.out.println(dup);
		  
		

	}
}

