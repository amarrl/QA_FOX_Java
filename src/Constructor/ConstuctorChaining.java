package Constructor;


 class Parentclass{
	 
	 Parentclass(){
	System.out.println("Inside parent class"); 
} 
	  
	
 }
 
 class ChildClass extends  Parentclass { 
	 ChildClass(){
		 System.out.println("Inside child class no argument");
	 }
	 
	 ChildClass(int a){
		 System.out.println("Inside child class paramiterzied constuctor "+a);
	 } 
	 
 } 



public class ConstuctorChaining {

	public static void main(String[] args) {
		
		ChildClass j=new ChildClass(1);  
		
		

	}

}
