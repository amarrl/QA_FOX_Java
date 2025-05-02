package Interface;

public class Execute {

	public static void main(String[] args) {
		
		    String BankName="SBI";
			RBI bank=null;
			
			
		
			
			if(BankName.equals("SBI")) {
				bank=new SBI();
			}
			
			else if(BankName.equals("Axis")) {
				bank=new Axis();
			}
			
			bank.closeBankAccount();
			bank.depositeMoney();
			bank.rateOfInterest();
		
			
			
		

	}

}
