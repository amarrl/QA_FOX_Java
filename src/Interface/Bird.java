package Interface;

public class Bird implements Fly,Walk { 

	@Override
	public void walk() {
	
		System.out.println("Bird is walking");
		
	}

	@Override
	public void Fly() {
		System.out.println("Bird is flying");
		
	}
	
	public static void main (String args[]) {
		Bird g=new Bird();
		g.walk(); 	
		g.Fly();
	}
	
	

}
