package Programming;

import java.util.Arrays;

public class SortElementsInAssecndingandDecendingOrderOrder_Bubblesort {

	public static void main(String[] args) {
		
		int arr[]= {5, 2, 8, 7, 1};
		int temp;  
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j]; 
					arr[j]=temp;
				}
			}
		}
		for(int u:arr) {
			System.out.println(u);
		}
		

}
}