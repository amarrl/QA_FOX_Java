package String;

public class ToCharArray {

	public static void main(String[] args) {
		String s="Amar kumar";
		
		
		System.out.println(s.toUpperCase());
	
		
		char k[]=s.toCharArray();  
		
		for(char c:k) {
			System.out.println(c);
		}
		
 
		
	}

}
