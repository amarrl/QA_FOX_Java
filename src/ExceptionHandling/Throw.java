package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {
		int a=8; 
		
		
		try {
			
		if(a>5) {
			throw new Exception("This is is not allowed");
		}
		
		}catch(Exception e){ 
		System.out.println(e.getMessage());
		}
		
		if(a<5) {
			System.out.println("Age is allowed");
		}

	}

}
