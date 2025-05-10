package Interface;

public class American implements CentralTrafficRules,Austrelia {
	
	public void redStop() {
		System.out.println("redStop is");
	}
	public void greenStop() {
		System.out.println("greenStop is");
	}
	
	public void yewlloStop() {
		System.out.println("yewlloStop is");
	}
	
	public void walkOnStreaat() {
		System.out.println("Peopele can wal on staree");
	}
	
	@Override
	public void zebraCross() {
		System.out.println("Zebracross for peopele");
		
	}
	
	public static void main(String[]args) {
		// As it is iterface implemenation we have changed it it CentralTrafficRules once implenting those those we can got with our country specific
		CentralTrafficRules aa=new American();  // we have create dan object for American to implement the methods in centarltarffic  intreface 
		aa.redStop();
		aa.greenStop();
		aa.yewlloStop();
		 
		Austrelia aus=new American();
		aus.zebraCross();
		
		
		American americ=new American();
		americ.walkOnStreaat();   // as it belongs to this specific countray we will not be able to get from central
		
	}
	

}
