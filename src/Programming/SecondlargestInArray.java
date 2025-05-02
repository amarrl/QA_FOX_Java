package Programming;

public class SecondlargestInArray {
	
	public static int findmax(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
	
		 
		
	
		
		for(int i:arr) {
			if(i>largest) {
				secondlargest=largest;
				largest=i;
			}
			
		}
		return secondlargest;
	}
	
	
	

	public static void main(String[]args) {
		
int ae[]= {5,6,7,8,1,2,3,4};

int l=ae.length;

System.out.println("Second largest value is "+findmax(ae));


	}
}
