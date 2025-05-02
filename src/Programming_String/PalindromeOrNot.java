package Programming_String;

public class PalindromeOrNot {
	
	public static void main(String[]args) {
		String text="MADAM";
		
		text=text.replaceAll("[^a-zA-Z0-9]","");
	
		
		String res=""; 
		
		for(int i=text.length()-1;i>=0;i--) {
			
	res+=text.charAt(i);
			
			
		}
		 
		if(res.equalsIgnoreCase(text)) {
			System.out.println("The String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
