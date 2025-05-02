package Constructor;


class car{
	
	
	car(){ 
		this(12);  
		
		System.out.println("Inside No Parameter");
	}
	
        car(int x){  
        	this(12,13);
	System.out.println("Inside Single parametersied constuctor"+x);
	}
	
        car(int x,double y){
        	System.out.println("Inside double parametersied constuctor "+x+" "+y); 
        	}
}
public class ThisCallingStatementInConstructor {

	public static void main(String[] args) {
		car cq=new car();
		

	}

}
