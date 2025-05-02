package Arrays;

public class Practice2 {

	
	public static void main(String[]args) {
		
		int arr[][][]= {{{1,2,3,4},{4,5,6,7},{3,45,6,7,8}}};
		
		for(int a[][]:arr) {
			for(int k[]:a) {
				for(int jjk:k) {
			System.out.print(jjk);
				}
			}
		}
		
		
		/*
		int ar[][][]= {{{1,2,4,5,6},{3,7,8,9,10,11},{2,3,1,3,45,50}}};
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=0;j<ar[i].length;j++) {
				
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		 
		for(int h[][]:ar) {
			
			for(int j[]:h) {
				
				for(int u:j) {
			System.out.print(u);
				}
				System.out.println();
		}
		
		}
		} 
		
		
		*/
	}
}

