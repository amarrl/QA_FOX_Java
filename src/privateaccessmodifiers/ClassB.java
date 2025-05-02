package privateaccessmodifiers;

public class ClassB {
	
	public void methodB(){
	ClassA a=new ClassA();
	

	System.out.println(a.a);
	
a.methodA();


		
	
	}

	public static void main(String[] args) {
		
		ClassB b=new ClassB();
		b.methodB();
		
	}

}
