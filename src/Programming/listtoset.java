package Programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class listtoset {

	public static void main(String[] args) {
		
		String a[]= {"Amar","Kumar","jvi","aaju","Amar","Kumar"};
		
		// a[] = {1, 2, 3, 4, 6, 7, 8, 9};
		
		
	List<String>s=Arrays.asList(a);  
	System.out.println(s); 
	
	Set<String>aa=new HashSet(); 
	aa.addAll(s);
	System.out.println(aa);
	
	Set<String>f=new LinkedHashSet();
	
		f.addAll(s);
		System.out.println(f);
		
		
		
}

	
}

