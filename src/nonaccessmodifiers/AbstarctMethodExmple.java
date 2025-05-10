package nonaccessmodifiers;

abstract class Bank{    
	
abstract int getRateOfInterest();      
}    
class SBI extends Bank{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
int getRateOfInterest(){return 8;}    
}    


public abstract class AbstarctMethodExmple {
	
	
	public static void main (String[]args) {
		
		PNB p=new PNB();
		System.out.println(p.getRateOfInterest());
		
		SBI s=new SBI();
		System.out.println(s.getRateOfInterest());
	}

}
