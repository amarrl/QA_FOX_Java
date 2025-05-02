package Set;

import java.util.Comparator;

public class CustomizedSorting implements Comparator {
	/*
//decending order of defult 
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer ione =(Integer)o1;
		Integer itwo=(Integer)o2;
		
		return itwo.compareTo(ione);
	}
*/
	
	/*
	//Acending order of defult
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			
			Integer ione =(Integer)o1;
			Integer itwo=(Integer)o2;
			
			return ione.compareTo(itwo);
		}
		*/
		
		
	/*
	//If user wants the objects to be inserted based on his inseration acsending
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			
			Integer ione =(Integer)o1;
			Integer itwo=(Integer)o2;
			
			return +2;
		}
		
		*/

		//If user wants the objects to be inserted based on his inseration decending
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				Integer ione =(Integer)o1;
				Integer itwo=(Integer)o2;
				
				return -2;
			}
	
	
	


}
