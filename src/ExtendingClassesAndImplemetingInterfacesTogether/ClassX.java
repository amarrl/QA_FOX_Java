package ExtendingClassesAndImplemetingInterfacesTogether;

public class ClassX {
	
	public void classX() {
		System.out.println("Inside Class X");
	}

}

class ClassY extends ClassX implements interfaceX,InterfaceY{

	public void classY() {
		System.out.println("Inside Class Y");
	}

	@Override
	public void interfaceX() {
		System.out.println("inside interface x");
		
	}

	@Override
	public void interfacey() {
		System.out.println("inside interface y");
		
	}
}
