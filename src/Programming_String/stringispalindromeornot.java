package Programming_String;

public class stringispalindromeornot {

	public static void main(String[] args) {
		
		 String string = "A man a plan a canal Panama";
		
		 string=string.replaceAll("[^a-zA-Z]", "").toLowerCase();
		 
		boolean flag=true;
		 
		 
		 for(int i=0;i<string.length()/2;i++) {
			 if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				 flag=false;
				 break;
			 }
		 }
		 
		 
		 
		 if(flag==true) 
			 System.out.println("it is palindrome");
		 
		 else 
			 System.out.println("it is not plidarome");
		 
		 
		 
	}
}
