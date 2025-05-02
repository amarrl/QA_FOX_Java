package Programming_String;

public class ReturnFirstnonrepatingcharandindex {

	
	  public static String firstUniqChar(String s) {
	        // Step 1: Count the frequency of each character in the string
	        int[] count = new int[26];  // Assuming only lowercase English letters (a-z)
	        
	        // Loop through the string and populate the count array
	        for (int i = 0; i < s.length(); i++) { 
	            count[s.charAt(i) - 'a']++; 
	        } 
	        
	        // Step 2: Find the first character that appears only once
	        for (int i = 0; i < s.length(); i++) {
	            if (count[s.charAt(i) - 'a'] == 1) {
	                // Return the index and the character as a string
	                return "Character: " + s.charAt(i) + ", Index: " + i;
	            }
	        }
	        
	        // Step 3: If no such character exists, return "-1"
	        return "-1";
	  }


    	  
    	  
    	    public static void main(String[] args) {
    	        String s = "leetcodel"; 
    	        String result = firstUniqChar(s);
    	        System.out.println(result);  // Output: Character: t, Index: 3
    	        
    	        s = "loveleetcode";
    	        result = firstUniqChar(s);
    	        System.out.println(result);  // Output: Character: v, Index: 2
    	        
    	        s = "aabb";
    	        result = firstUniqChar(s);
    	        System.out.println(result);  // Output: -1 (no unique character)
    	        
    	        s = "abcdabcdxyz";
    	        result = firstUniqChar(s);
    	        System.out.println(result);  // Output: Character: x, Index: 8
    	    }
    	

    
}