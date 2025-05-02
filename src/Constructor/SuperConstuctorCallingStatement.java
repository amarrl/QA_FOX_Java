package Constructor;


class ParentClasss{  
	ParentClasss(){
		System.out.println("Inside parent class");  
	}
	
	ParentClasss(int X,int Y){
		System.out.println("Inside parameterised constuctor "+X+" "+Y);
	}
}

class Childclasss extends ParentClasss{  
	Childclasss(){
		System.out.println("Inside Child Class");
	}
	
	Childclasss(char a,char b){
		//super(); java will add super by default 
		
		super(80,90);  
		System.out.println("Inside child class "+a+" "+b);
	}
	
} 


public class SuperConstuctorCallingStatement {

	public static void main(String[] args) {
		Childclasss c=new Childclasss('b','z');
		

	}

}
