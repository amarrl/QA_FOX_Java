package ExceptionHandling;

public class TryCatchVariables {
	
public static void main(String[]args) {
	
	try {
		int a=10; 				//the scope of this variable is upto try block itself
		System.out.println(a);  
		
	}catch(Exception e) {
		int a=19;               //the scope of this variable is upto catch block itself
		System.out.println(a);
	}
	
	//System.out.println(a);
}
}
