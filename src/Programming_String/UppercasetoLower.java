package Programming_String;

public class UppercasetoLower {

	public static void main(String[] args) {
		String s="Amar KUMAR raj";
	
		
		StringBuilder s1=new StringBuilder(s);
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(c>='a' && c<='z') {
				s1.setCharAt(i, Character.toUpperCase(c));
			}
		}
		
		System.out.println(s1);
		
	}

}
