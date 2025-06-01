package HashMapp;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tcs {
	public static void main (String[]args){
		
		String s ="parogramminga";  
		
		HashMap<Integer,Character>chars=new HashMap<>();
		
		
		for(int i=0;i<s.length();i++) { 
			char ch=s.charAt(i);
			 
			chars.put(i,ch);   
			 
		}
		
		System.out.println("HashMap values: "+ chars.values());
		
	
		Collection <Character>vh=chars.values(); 
		
		
		
		//List<Collection<Character>>dup=Arrays.asList(vh);
		
		
	
		Set<Character>unique=new HashSet<>();	
		
		Set<Character>duplicates=new HashSet<>();
		
		for(Character k:vh) {
			if(!unique.add(k)){ 
				duplicates.add(k);
			}
		} 
		
		
		System.out.println("duplicates are "+duplicates);
		
		;
	}

}


/*
 import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "parogramminga"; // The string from which we extract characters

        // HashMap to store index and character mapping
        HashMap<Integer, Character> chars = new HashMap<>();

        // Populate the HashMap with characters and their indexes
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            chars.put(i, ch);
        }

        // Extracting the values (characters) from the HashMap
        System.out.println("HashMap values: " + chars.values());

        Collection<Character> vh = chars.values();

        // Convert the Collection to a List
        List<Character> charList = new ArrayList<>(vh);

        // Add the List to another List of collections (dup)
        List<Collection<Character>> dup = new ArrayList<>();
        dup.add(charList);

        // Convert List to Set to remove duplicates
        Set<Character> uniqueChars = new HashSet<>(	);

        // Use a Map to count occurrences of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (Character ch : charList) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print duplicates (characters with count > 1)
        System.out.println("Duplicate characters: "); 
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) { 
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}

 */
