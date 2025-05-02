package methodsoverriding;

class Bank{
	public float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	public float getRateOfInterest(){
		return 8;
		 
	}
}

class ICICI extends Bank{
	public float getRateOfInterest() {
		return 6;
	}
}


class Axis extends Bank{
	public float getRateOfInterest() {
		return 10;
	}
}
public class BankExample {

	public static void main(String[] args) {
    SBI sbi=new SBI();
    ICICI icici=new ICICI();
    Axis axis=new Axis();
    
   System.out.println(sbi.getRateOfInterest());
   System.out.println(icici.getRateOfInterest());
   System.out.println(axis.getRateOfInterest());
	}

}
