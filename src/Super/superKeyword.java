package Super;

class methodA{
	methodA(){
		System.out.println("inside constructor");
	}
	int a=5; 
	public void methodX() {
		
		System.out.println("Inside parent class x");
	}

 
}

class MethodB extends methodA{
	int a=9;
	
	public void methodX() {
		
		System.out.println("Inside method child class x");
	}
	
	public void methodY() {
		System.out.println("Inside method child class method y");
		System.out.println("Child class variable is "+a);
		System.out.println("Parent Class variable is "+super.a);
		
		methodX();
		super.methodX();
		
		
	}
	
}

public class superKeyword {

	public static void main(String[] args) {
		MethodB a=new MethodB();
		a.methodY();
		
	
		
		
		
	}

}
