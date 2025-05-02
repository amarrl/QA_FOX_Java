package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Merger_Sorted_Arrays2 {

	public static void main(String[] args) {
	 	int[] arr1= {1,3,5,7}; 
		int[] arr2= {2, 4, 6, 8, 10,15}; 
		
		int l1=arr1.length;
		
		int l2=arr2.length;
		
		
		int mer[]=new int[l1+l2];
		
		Arrays.sort(arr1);
		
		Arrays.sort(arr2);
		 
	for(int i=0;i<arr1.length;i++) {
		mer[i]=arr1[i]; 
	}
	
	for(int j=0;j<arr2.length;j++) {
		mer[l1+j]=arr2[j];
	}
	
	Arrays.sort(mer); 
	
	for(int k:mer) { 
		System.out.println(k);
	}
		
		}
		
		
		
	}

