package Programming;

public class FindMaxandMinNumberInArray {
	
	public static int findmin(int[] a,int size){
		
		int minValue=Integer.MAX_VALUE;
		
		for(int i=0;i<size;i++) {
			if(a[i]<minValue) {
				minValue=a[i];
			}
		}
				return minValue;
	
	}
	
	public static int findmax(int a[],int size) {
		
		int maxValue=Integer.MIN_VALUE;
		for(int j=0;j<size;j++) {
			if(a[j]>maxValue) {
				maxValue=a[j];
			}
		}
		
		
		
		
		
		return maxValue;
		
		
		
	}
	
	
	
	
	public static void main(String args[]) {
		int[] a= {12,3,45,67};
		int size=a.length;
		
		System.out.println(findmin(a,size));
		
		System.out.println(findmax(a,size));
		
		
	}

}
