package HashMapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class practices {

	public static void main(String[] args) {
		String text="Haridwara kumar parvatha";  
	      text=text.toLowerCase().replaceAll("[^a-zA-Z]","");
			  
			  Map<Integer,Character>map=new HashMap<>();
			  
			char ch[]=text.toCharArray();
			
			for(int i=0;i<text.length();i++){
			  
			  map.put(i,ch[i]);

			}
			
			
	}

}
