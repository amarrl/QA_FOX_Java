package HashMapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaptolistSet {
	
	public static void main(String[]args) {
		String ss="Programming";

		Map<Integer,Character>maps=new HashMap<>();

		for(int i=0;i<ss.length();i++){
		char[] gh=ss.toCharArray();

		maps.put(i,gh[i]);

		}

		Collection<Character>charsfromcoll=maps.values();

		List<Character>ll=new ArrayList<>(charsfromcoll);
		List<Character>dup=new ArrayList<>();

		for(char fromlist:ll){
	System.out.println(fromlist);
		}
System.out.println("----------------------------------");
		Set<Character>sset=new HashSet<>(ll);


		for(char fromset:sset){
		System.out.println(fromset);
		}
		
		
	}

}
