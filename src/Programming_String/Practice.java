package Programming_String;

import java.util.Arrays;

public class Practice {


		 
		/*
		Integer arr[]={8,4,5,6,7,2,3};
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		

		System.out.print(arr[3-1]);
	
	    */
		public static boolean stringana(String str1,String str2) {
		
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] str3=	str1.toCharArray();
		char[] str4=str2.toCharArray();
		
		Arrays.sort(str3);
		Arrays.sort(str4);
		
		
		for(int i=0;i<str1.length();i++) {
			if(str3[i]!=str4[i]) {
				
				return false;
				
			}
			
		
	
		}
		return true;
		
	}
		
		public static void main(String[] args) {
			String str1="Amar";
			String	 str2="mara";
			
			if(stringana(str1,str2)) {
				System.out.println("");
			}

}
}
