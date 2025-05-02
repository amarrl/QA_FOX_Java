package Iterative_statements;

public class Transfer_Satments {

	public static void main(String[] args) {
		
		//break statment - switch , for loops
		
		int i=0;
		while(i<=5) {
			System.out.println("intexs " + i);
			i++;
			
			if(i==4)
			break;
		}
		
		System.out.println("out side while loop");
		
		// loop
		
		for(int y=0;y<10;y++) {
			System.out.println("index of y "+y);
			
			if(y==5) 
				break;
			
		}
		System.out.println("out side for loop");
		
		
		
		// labled blocks
		
		int r=5;
			int u=6;
			
			
			Amarlavle:{
				System.out.println("labled block started executing");
				System.out.println("labled block started executing 1");
				System.out.println("labled block started executing 2");
				System.out.println("labled block started executing3");
				System.out.println("labled block started executing 4");
				System.out.println("labled block started executing 5");
				
				if(r<u) {
					break 			Amarlavle;
				
				}
				
				System.out.println("labled block started executing 6");
				System.out.println("labled block started executing 7");
				System.out.println("labled block started executing 8");
			}
			System.out.println("=========================================");
			
		//continue
			
			for(int e=0;e<10;e++) {
				
				if(e==5) {
					//System.out.println("is euqal to 5 ");
					continue;
					
				}
				
				if (e==8) {
					break;
				}
				
				System.out.println("index of e is "+e);
	
			}
			System.out.println("the proframe has endded");
			
			
		for(int p=0;p<=10;p++) {
		if(p%2==2) {
			
			continue;
		}
		System.out.println("intext of even numbers "+p);
	}

}
}
