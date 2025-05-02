package Arrays;

public class TwoDimenstionalArrayys {
	
	public static void main(String[]args) {
	
	   
	  int u[][]=new int[2][3]; 
	  
	 
	  
	  
	u[0][0]=1;
	u[0][1]=2; 
	u[0][2]=3;
	
	u[1][0]=4;
	u[1][1]=5;
	u[1][2]=6;
	
	
	
  System.out.println(u[1][0]);
  
  System.out.println("========================"); 

//shortcurt
int tu[][]= {{1,2,3,9},{4,5,6,9,9}}; //2 dimes array is a array of single dimenstional arrays

 
System.out.println("size or length of whole array:"+tu.length); 

System.out.println("size or length of 1st array:"+tu[0].length);  //length of 1st d array  3

System.out.println("size or length of 2d array:"+tu[1].length); //length of 2st d array  4
 

System.out.println("====================");
for(int i=0;i<tu.length;i++) {  //outter for whole arry length //0  //2   
	for(int j=0;j<tu[i].length;j++) {    //    // //0<4 1<4
		
		System.out.print(tu[i][j]);  //1 2 3 
	} 
	System.out.println();

}    
	}

}

