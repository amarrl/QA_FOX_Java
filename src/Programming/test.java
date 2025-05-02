package Programming;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		String a="AMAR";
		 String b="aMkR";
		 
		 a=a.toLowerCase();
		 b=b.toLowerCase();
		  
		 if(a.length()!=b.length()){
		   System.out.println("Not E");
		 }
		 else{
			 
			 char c[]=a.toCharArray(); 
			 char d[]=b.toCharArray();
			 
			   Arrays.sort(c);
			   Arrays.sort(d);
		 
		  
		   
		   for(int i=0;i<a.length();i++){ 
		     if(c[i]!=d[i]){
		       System.out.println("Not Ana");
		       break;
		     }
		 
		     
		   }
		   
		     
		     }
		   
		   
		 

	}

}
