package Programming_String;

public class String_Replacewith {

	public static void main(String[] args) {
		  String input="Tesing device from";
		  
		  StringBuilder s=new StringBuilder();
		  
		  for(int i=input.length()-1;i>=0;i--) {
			  char c=input.charAt(i);
			 
			  if(c==' ') {
				  s.append('%');
			  }
			  else {
				  s.append(c);
			  }
			  }
		  System.out.println(s);
	}
}


