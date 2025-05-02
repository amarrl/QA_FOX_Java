package Constructor;

class Parentt{
	Parentt(){
		System.out.println("Inside Parent class");
	}
}

class Childu extends Parentt{
	
	Childu(){
		this(12); 
		System.out.println("inside 1"); 
	}
	Childu(int i){
		this(10,20); 
		System.out.println("Inside 2nd");
	}
	
	Childu(int i,int y){
		System.out.println("Inside 3rd");
	}
}



public class PracticeTest {

	public static void main(String[] args) {
		//Childu jj=new Childu(10,20);
		
		Childu kk=new Childu();
	

	}

}
