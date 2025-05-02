package Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargest {

		public static int getMenstionedNumberOfLargestNum(Integer bb[],int n) {
			
			List<Integer>list=Arrays.asList(bb);
			//Collections.sort(list); 
			
			Arrays.sort(bb,Collections.reverseOrder());
			
			int elemm=list.get(n-1);
			return elemm;
			
			
			
		}
		
		public static void main(String[]args){
			Integer ar[]= {8,3,4,56,1,2,5,9};
			//Arrays.sort(ar);
			//System.out.println(Arrays.toString(ar));
			System.out.println(getMenstionedNumberOfLargestNum(ar,2));
		
			
		}

	}
	
