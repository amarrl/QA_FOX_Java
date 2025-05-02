package Programming_String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates_ElementsInStringArray {
		
	public static void main(String[]args) { 
		
	
	// Example string array 
    String[] stringArray = {"apple", "banana", "cherry", "apple", "date", "banana", "apple"};

    // Find duplicates
    List<String> duplicates = findDuplicates(stringArray); 

    // Print results
    if (!duplicates.isEmpty()) {
        System.out.println("Duplicate elements found: " + duplicates);
    } else {
        System.out.println("No duplicate elements found.");
    }
	}


public static List<String> findDuplicates(String[] stringArray) {
    Set<String> seen = new HashSet<String>();
    Set<String> duplicates = new HashSet<>();
    
    

    for (String item : stringArray) {
        if (!seen.add(item)) {
            duplicates.add(item); 
        }
    }

    // Convert duplicates to a List and return
    return new ArrayList<>(duplicates);
}
}
