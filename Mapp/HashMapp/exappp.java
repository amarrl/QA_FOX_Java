package HashMapp;

import java.util.HashMap;

public class exappp {

	
	


	    public static void main(String[] args) {
	        String ransomNote = "ransomNote";
	        String magazine = "Nansomrote";

	        HashMap<Character, Integer> magaHash = new HashMap<>();

	        // Step 1: Fill map with magazine letters
	        for (char c : magazine.toCharArray()) {
	            magaHash.put(c, magaHash.getOrDefault(c, 0) + 1); 
	        }
	        
	        System.out.println(magaHash); 

	        // Step 2: Check ransomNote letters using simplified logic
	        boolean canConstruct = true; // Assume true unless proven false 

	        char[] ransomChars = ransomNote.toCharArray();

	        for (int i = 0; i < ransomChars.length; i++) {
	            char c = ransomChars[i]; 

	            if (magaHash.containsKey(c)) {
	                int count = magaHash.get(c);
	                if (count > 0) {
	                    magaHash.put(c, count - 1); // Use one letter 
	                } else {
	                    canConstruct = false; // No letters left to use
	                    break;
	                }
	            } else {
	                canConstruct = false; // Letter not found in magazine
	                break;
	            }
	        }

	        // Output the result
	        System.out.println("Can construct ransom note: " + canConstruct);
	    }
	}


