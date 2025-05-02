package Programming;

import java.util.Arrays;
import java.util.Collections;

public class PrintArryaInDecendingOrder {

	public static void main(String[] args) {
		Integer y[]= {1,2,4,5,6,7,8};
		
		for(int i=y.length-1;i>0;i--) { 
			System.out.print(y[i]);
		}
		System.out.println("---------------------");
		Arrays.sort(y,Collections.reverseOrder()); 
		System.out.println(Arrays.toString(y));
	}

}
