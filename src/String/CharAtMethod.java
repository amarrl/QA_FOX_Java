package String;

public class CharAtMethod {

	public static void main(String[] args) {
		String s="Amar Rajkumar LAXMI";
		
		char c=s.charAt(3);
		System.out.println(c); 
		
		
		
		String OTP="your otp is 2345 recevived";
		
		String fe=OTP.substring(12, 16);
		
	
		
		System.out.println(fe);
		
		String a="Sachin";
		a.concat("Tendulkar");  //SachinTendular
		
		
		System.out.println(a); // Sachin as string is immutable
		
		int ab=10;
		
	System.out.println(ab+5);	
		

	}

}
