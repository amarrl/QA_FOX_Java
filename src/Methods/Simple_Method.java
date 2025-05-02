package Methods;

public class Simple_Method {
	
	static int a=10;
	static int b=20;
	static int c;
	
	public static void kamal() {
		c=a+b;
		System.out.println(c);
	}
	
	public static void methodA() {
		System.out.println("inside method A");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("inside method B");
	}
	
	public static void main (String[]args) {
		
		kamal();
		methodA();
	
		
	}
}
