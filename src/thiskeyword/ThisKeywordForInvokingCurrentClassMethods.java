package thiskeyword;


class classA{
	public void MethodX() {
		System.out.println("Inside Method X");
		this.MethodY();
		this.MethodZ();
	}
	
	public void MethodY() {
		System.out.println("Inside Method Y");
		//this.MethodZ();
	}
	
	public void MethodZ() {
		System.out.println("Inside Method Z");
	}
}

public class ThisKeywordForInvokingCurrentClassMethods {

	public static void main(String[] args) {
		classA s=new classA();
		s.MethodX();
		

	}

}
