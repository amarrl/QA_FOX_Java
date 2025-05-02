package Programming;

import java.util.Arrays;

public class Merger_Sorted_Arrays {
	
	
	public static int[] mergedArrays(int[]arr1,int[] arr2) {
		
		int n1=arr1.length; 
		int n2=arr2.length;
		
		int[]mera=new int[n1+n2];   
		
		int i = 0,j = 0,k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j]) {
				mera[k++]=arr1[i++]; 
			}
			else {
				mera[k++]=arr2[j++];
			}
		}
		
		while (i < n1) {
            mera[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2[] if any
        while (j < n2) {
            mera[k++] = arr2[j++];
        }

		return mera;
		
		
	}

	
	public static void main(String[]args) {
 
		
	int[] array1= {1,3,5,7}; 
	int[] array2= {2, 4, 6, 8, 10,15}; 
	
	
	int []sortedarry=mergedArrays(array1,array2);  
		
	for(int num:sortedarry) {
		System.out.print(num);
	}
	
		
	}
		
}
