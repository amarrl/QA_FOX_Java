package String;



import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CaptchString {

	    
	  public static void main(String[] args) { 
	    	    	
	    	     String text="AmarKmar "+"\n"+"Raj";
	    	     
	    	    int newLineIndex =text.lastIndexOf("\n"); 
	    	  
	    	   
	    	    String beforeNewLine=text.substring(0, newLineIndex);
	    	   // System.out.println(beforeNewLine);
	    	      String afterNewLine=text.substring(newLineIndex+1);
	    	    //  System.out.println(afterNewLine);
	    	      
	    	      int lastSpaceIndexOfbeforenewlIne=beforeNewLine.lastIndexOf(" ");
	    	      System.out.println(lastSpaceIndexOfbeforenewlIne);
	    	      if(lastSpaceIndexOfbeforenewlIne!=-1) { 
	    	    	 String part1= beforeNewLine.substring(0, lastSpaceIndexOfbeforenewlIne);
	    	    	 System.out.println(part1);    
	    	    	 String part2=beforeNewLine.substring(lastSpaceIndexOfbeforenewlIne+1);
	    	    	 System.out.println(part2);   
	    	    	 System.out.println("--------------");
	    	    	 System.out.println(part1+afterNewLine+part2); 
	    	      }
	    	     
	    	     
	    	     /*
	    	    int newlineIndex= text.lastIndexOf("\n"); 
	    	     System.out.println(newlineIndex); 
	    	   String beforeNewLine=  text.substring(0,newlineIndex);
	    	   
	    	   System.out.println(beforeNewLine); 
	    	   
	    	   System.out.println(text.substring(newlineIndex+1)); 
	    	    
	    	   */
	    	   
	    	    
	    	  }

	     
}
	  



