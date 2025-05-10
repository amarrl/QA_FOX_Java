package inheritance;

 class A{
	 
	 int i=10;
	
}
 
 class B extends A{
	 int i=20;
 }
 
 
public class MUstSee {

	public static void main(String[] args) {
		B b=new B();
		
		System.out.println(b.i);  //20
		
		A a=new B(); //hear we are creating object for B but we are saying the object should refere to the propeties of A so A value will be called
		
		System.out.println(a.i);  //10
		
		/*
		WebDriver driver=new ChromeDriver();
		
		we are delcaring the object for chromedriver class but driver should be able to access all the methods of Webdriver and chromdriver internally inheritalling the propeties of webdriver
		
*/
	}

}
