package Methods;

public class MethodReturningValue {
	
	
	
	static int sum;
	
	
	public static int methodA(int a, int b) {
		sum=a+b;
		return sum;
		
		
		
	}
	
	public static void main (String[]args) {
		
		methodA(10,20);
		
		System.out.println(sum);
		
	double q=sum2(13.4,'d');
	System.out.println(q);
	

		
	}
	
	public static double sum2(double d,char e) {
		return d+e;
	}

}
