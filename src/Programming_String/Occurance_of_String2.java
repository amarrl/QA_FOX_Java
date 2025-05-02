package Programming_String;

import java.util.HashSet;
import java.util.Set;

public class Occurance_of_String2 {

	public static void main(String[] args) {
		String target = "Hello world";  // The string to find
        String text = "Hello world, welcome to the Hello world of Java programming! Hello world!";  // Larger text
        
        int count = 0;  // To store the number of occurrences
        // Loop through the text, checking for matches of the target string
        for (int i = 0; i < text.length(); i++) {
            boolean match = true;  // Flag to track if a match is found  
            
            // Compare each character of the target string with the substring in text
            for (int j = 0; j < target.length(); j++) {
                if (text.charAt(i + j) != target.charAt(j)) {
                    match = false;  // Set match to false if characters don't match
                    break; 
                }
            }
            
            if (match==true) {
                count++;  // Increment the count when a match is found
            }
        }

        // Output the number of occurrences of the target string
        System.out.println("Occurrences of " + target + "': " + count);
    }


}
