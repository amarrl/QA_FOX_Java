package Programming_String;

public class Stringa3 {


		    // Method to compress the string
		    public static String compressString(String input) {
		        // StringBuilder to build the resulting string
		        StringBuilder result = new StringBuilder();
		        
		        // Initialize a count to keep track of consecutive characters
		        int count = 1;
		        
		        // Iterate through the input string starting from the second character
		        for (int i = 1; i < input.length(); i++) {
		            // If the current character is the same as the previous one, increment the count
		            if (input.charAt(i) == input.charAt(i - 1)) {
		                count++;
		            } else {
		                // Append the previous character and its count (if > 1)
		                result.append(input.charAt(i - 1));
		                if (count > 1) {
		                    result.append(count);
		                }
		                // Reset the count for the new character
		                count = 1;
		            }
		        }
		        
		        // Append the last character and its count (if > 1)
		        result.append(input.charAt(input.length() - 1));
		        if (count > 1) {
		            result.append(count);
		        }
		        
		        return result.toString();
		    }

		    // Main method to test the function
		    public static void main(String[] args) {
		        // Test input
		        String input = "aaabbbacfwww";
		        
		        // Get the compressed string
		        String output = compressString(input);
		        
		        // Print the output
		        System.out.println(output);  // Output should be: a3b3acfw3
		    }
		
}
