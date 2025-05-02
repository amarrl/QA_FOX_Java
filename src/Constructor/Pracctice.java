package Constructor;
class ParentClasssggggga{
	
	
	ParentClasssggggga(){
		  System.out.println("Inside Parent classs");
		}
	ParentClasssggggga(int x,int y){
		  System.out.println("Inside parent paramterised method"+x+y);
		}
	}


class ChildhbhbClass extends ParentClasssggggga{ 
	
	
	ChildhbhbClass(){ 
		super(10,20); 
		  System.out.println("Inside child class");
		}
	ChildhbhbClass(int x,int y){
		  System.out.println("Inside child paramterised method"+x+y+" childu");
		}
	}
 


public class Pracctice {
	
	
	
	public static void main(String[]args) {
		ChildhbhbClass jk=new ChildhbhbClass();
		//ChildhbhbClass k=new ChildhbhbClass(10,222);
		
		
	}

}
