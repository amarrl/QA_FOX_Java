package Programming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaProgrrametoLeftRotateOfArray {

	public static void main(String[]args) {
	
		
		  int [] arr = {1, 2, 3, 4, 5}; 
		  int n=3;
		 
		  for(int h:arr) {
			  System.out.print(h+" ");
		
		  }
		  System.out.println();
		  
		  
		  for(int j=0;j<n;j++) {
		  int first=arr[0];
		
		  
		  for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			  
		  }
		arr[arr.length-1]=first;
		  System.out.println(Arrays.toString(arr));   //[2, 3, 4, 5, 1]
		
		  }
	/*
		  for(int j=0;j<3;j++) {
			  
			  int last=arr[arr.length-1];
		  for(int i=arr.length-1;i>0;i--) {
			  arr[i]=arr[i-1];
		  }
		  
		  arr[0]=last;
		  }
		  System.out.println(Arrays.toString(arr));   //3 4 5 1 2
*/
}
}