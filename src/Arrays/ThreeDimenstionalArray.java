package Arrays;

public class ThreeDimenstionalArray {
	
	public static void main (String[]args) {
int a[][][]= {{{1,2,3,5,6},{3,4,5,6},{23,45,12,56}},{{1,2,3,4},{5,6,7,8},{10,11,12,13},{1,2,4,5}}};  
		
		System.out.println("The nuber of two dimesion array in this 3 dimesion array are :"+a.length);  //2
		
		System.out.println("The number of single dimenstion array in 1st 2 dimenston array :"+a[0].length);   //3
		
		
		System.out.println("The number  of single dimenstion array in 2nd , 2 dimesntion array :"+a[1].length);   //4
		
		System.out.println("The number of values in 1st single dimenstion array "+a[0][0].length);  //5
		
		//System.out.println(a[1][3].length); //4
		 
		
		for(int w=0;w<a.length;w++) {     //0<2 
		for(int t=0;t<a[w].length;t++) {  //0<3
			
    	for(int y=0;y<a[w][t].length;y++) {   // 0<5
			 
			System.out.print(a[w][t][y]);  //000 001 
			
		}  

		} 
		
		System.out.println();
		}
	
		
	}
	

}
