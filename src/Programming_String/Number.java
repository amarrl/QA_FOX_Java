package Programming_String;

public class Number {
	
	public static void main(String[]args) {
		
		int count=0;
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" is an Even Numbe"); 
			}
			 
			boolean isPrime=true;
			
			if(i<=1) {
				 isPrime = false; // 0 and 1 are not prime
			}
			else {
				for(int j=2;j<=i/2;j++) {
					if(i%2==0) {
						isPrime=false;
					}
				}
			}
			
			 if (isPrime) {
				 
				
		              //  System.out.println(i + " is a Prime number"); print only pime number
		            
	                count++; // Increment the count of prime numbers found so far

	                // Step 7: Print only alternate prime numbers (odd-indexed primes)
	                if (count % 2 != 0) { // If count is odd, this is an alternate prime
	                    System.out.println(i + " is an alternate prime number");
	                }
	            }
				
			}
		}
		
		
		
		
		
	
		 
		 
	
	
}
