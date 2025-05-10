package nonaccessmodifiers;

 abstract class A{ 
	abstract void methodA();
	
	void methodk() {
	} 
}

 abstract class B extends A{ 
	abstract void methodB();
}

class C extends B{
	
	 
	 void methodA() {
		 System.out.println("Inside method A");
	 }
	 
	 void methodB() {
		 System.out.println("Inside method B");
	 }
}

public class AbsrtactMethod {

	public static void main(String[] args) {
		C c=new C();
		c.methodA();
c.methodB();

	}

}
