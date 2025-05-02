package Programming_String;

public class hwhsh {

	public static void main(String[] args) {
		
		
		  String text="Haridwara kumar parvathap";
		  
		  text=text.toLowerCase().replaceAll("[^a-zA-Z]", "");
		  
		  System.out.println(text);
		    
		    int count[]=new int[26];
		    
		    for(int i=0;i<text.length();i++){
		      count[text.charAt(i)-'a']++;
		    }
		    
		  for(int i=0;i<text.length();i++) {
			
			  
			  if (count[text.charAt(i) - 'a'] == 1) {
	                // Return the index and the character as a string
	                System.out.println( "Character: " + text.charAt(i) + ", Index: " + i);
	            }
		  }
		   
		 

	}

}


