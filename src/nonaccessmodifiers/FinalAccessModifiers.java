package nonaccessmodifiers;

 final class finalclass{
	int b;
	String s;
	
	public final void  mesthodx() {
		System.out.println("Inside method x");
	}
	
	 
	
}

class finalclass2 extends finalclass{
	public void mesthodx() { 
		System.out.println("Insider child class methodxs");
	}
}

public class FinalAccessModifiers {

	public static void main(String[] args) {
	 final int a=10;
		a=9;
		a=7;
		
		System.out.println(a); 
		
		

	}

}
