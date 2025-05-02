package Methods;

public class ParameterizedMethods {
	
	static int c;
	
	
	public static void addition(int a,int b) {
	c=a+b;
	System.out.println(c); 
		
	}
	
	public static void methodB(int d,double e,char f,String s) {
		
		System.out.println("Inside Method B having multiple parameter value "+d+" "+e+" "+f+" "+s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition(5,6);
		methodB(12,15.66,'d',"arun");  
		

	}

}
