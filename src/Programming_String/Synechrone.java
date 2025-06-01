package Programming_String;

public class Synechrone {

	public static void main(String[] args) {
		  String text="&%3Am48093&&ar89";
	      
	      StringBuilder s=new StringBuilder();
	      
	      for(int i=0;i<text.length();i++){
	        if(!Character.isLetterOrDigit(text.charAt(i))){
	          s.append(text.charAt(i));
	        }
	    
	        
	      }
	      System.out.println(s);

	}

}
