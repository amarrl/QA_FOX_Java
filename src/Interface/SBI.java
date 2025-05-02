package Interface;

public class SBI implements RBI {

	@Override
	public void depositeMoney() {
		System.out.println("Diposting Amount in SBI");
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Withdrwing amount in SBI");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("trasfering amount in SBI");
		
	}

	@Override
	public void closeBankAccount() {
		// TODO Auto-generated method stub
		System.out.println("closing amount in SBI");
		
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("rateofinterst amount in SBI");
		
	}
	
	public void customMethodSBI(){
		System.out.println("Custome method in sbis");
	}

}
