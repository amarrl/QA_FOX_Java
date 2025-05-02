package Constructor;


class EmpDetails{
	String name;
	double sal;
	int hikeamount;
	
	EmpDetails(String name,double sal,int hikeamount){
		this.name=name;
		this.sal=sal; 
		this.hikeamount=hikeamount;
	}
	
   EmpDetails(EmpDetails a){
	   this.name=a.name; 
		this.sal=a.sal;
		this.hikeamount=a.hikeamount;
		
	}
   
   void display() {
	   System.out.println(name+sal+hikeamount);
   }
	
}

public class CopyConstuctor {

	public static void main(String[] args) {
		EmpDetails Arun=new EmpDetails("Arun",12000,5000);
		Arun.display();
		EmpDetails kiran=new EmpDetails(Arun);
		kiran.display();
		
		
	}

}
