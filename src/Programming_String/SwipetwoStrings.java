package Programming_String;

public class SwipetwoStrings {


		public static void main(String[] args) {    
	        String str1 = "Good ", str2 = "morning";   
	        
	        System.out.println(str2.length());
	        
	        
	       // System.out.println(str1.length()-str2.length());
	         System.out.println("Strings before swapping: " + str1 + " " + str2);   
	         
	       //  System.out.println(str1.substring(0));
	         
	         
	        
	        //Concatenate both the string str1 and str2 and store it in str1    
	        str1 = str1 + str2;      
	        //Extract str2 from updated str1    
	        str2 = str1.substring(0, (str1.length() - str2.length()));    
	        
	        System.out.println(str2);
	        //Extract str1 from updated str1    
	        str1 = str1.substring(str2.length());
	        
	    
	        
	       
	            
	        System.out.println("Strings after swapping: " + str1 + " " + str2);    
	    }    

	}


