package Arrays;

public class ForEach_for_Two_DimensionArryas {
	
	public static void main (String[]args) {
		
		int a[][]= {{1,2,3,4},{5,6,7,8}};
		
		for(int[] one:a) {             //{1,2,3,4} / 
					for(int two:one) {             //1,2,3
						System.out.print(two);   //1,2,3
					} 
					System.out.println();  
			
		}  
		
		System.out.println("three dimensional array for each=================");
		int b[][][]= {{{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},{{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}}};
		 
		for(int[][]three1:b) {
			for(int[]three2:three1) {
				for(int three3:three2) {
					System.out.println(three3);
				}
			}
			
		}
		 
		
	}

}
