package Programming;

public class CopyAllElementsOFoNeArrayTOAnother {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]=new int[ar1.length];
		
	
		
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=ar1[i];
		}
		
		System.out.println("pring the values of second");
		
		for(int y:ar2) {
			System.out.println(y); 
		}
		
	}

}
