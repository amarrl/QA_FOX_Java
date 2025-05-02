package Numbers;

public class RandomNumInrange {

	public static void main(String[] args) {
		{  
			int min = 10;  
			int max = 20;  
		
			//Generate random int value from 200 to 400   
			System.out.println("Random value of type int between "+min+" to "+max+ ":");  
			int b = (int)(Math.random()*(max-min));  
			System.out.println(b);  

	}

}
}
