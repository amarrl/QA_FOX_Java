package Programming;

public class LinerSearch {
	
	public static int LinerSearch(int b[],int k) {
		
		for(int i=0;i<=b.length-1;i++) {
			if(b[i]==k) {    
				return i;  
			} 
			
		} 
		return -1; 
		
	}

	public static void main(String[] args) {
		int []lin= {1,2,3,4,55,43,20,90};
		
		int key=90;
	System.out.println(LinerSearch(lin, key));
		
		 
		
	}

}
