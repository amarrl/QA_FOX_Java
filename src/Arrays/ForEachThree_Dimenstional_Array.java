package Arrays;

public class ForEachThree_Dimenstional_Array {
	
	public static void main (String[] args) {
		int a[][][]= {{{1,2,3},{4,5,6}},{{7,8,9},{1,2,3}},{{4,5,6},{7,8,9}}};
		
		
		for(int[][] one:a) {          //{1,2,3},{4,5,6}  then {7,8,9},{1,2,3}} then {4,5,6},{7,8,9}}
			for(int []two:one) {      //{1,2,3} then {4,5,6}
				for (int result:two){   //{1,2,3
					System.out.print(result+" ");  // 1,2,3
					 
				} 
			}
			System.out.println();
		}
	}

}
