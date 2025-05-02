package Interface_MrthodBody;

public interface InterfaceBank {
	void methodA();
	
	default void MethodB() {
		System.out.println("Inside method B");
	}
	
	static void MethodC() {
		System.out.println("Inside method C");
	}
	

}

class Exndingone implements InterfaceBank{

	@Override
	public void methodA() {
		System.out.println("inside method A");
		
	}
	
}
