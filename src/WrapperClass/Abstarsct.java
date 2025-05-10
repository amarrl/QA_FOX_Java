package WrapperClass;

abstract class A{
	abstract  void methodA();
}


abstract class B extends A{
	abstract void methodAB();
	
	void Maajjs() {
		System.out.println("smms");
	}
}

 class C extends B{
	 

	@Override
	void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void methodAB() {
		// TODO Auto-generated method stub
		
	}
}






public  class Abstarsct {
	public static void main(String[]args) {
		C kaka=new C();
		kaka.Maajjs();
	}
	
}
