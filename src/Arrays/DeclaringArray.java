package Arrays;

public class DeclaringArray {
	
	public static void main (String[]args ) {
		int arr[]= {12,34,56,78};
		
		
		System.out.println(arr.length); 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("========================");
		for(int y:arr) {
			
			System.out.println(y);
		}
	}

}
