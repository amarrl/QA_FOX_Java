package Constructor;

class Employee{
	String name;
	int id;
	double sal;
	
	Employee(String name,int id,double sal){
		this.name=name; 
		this.id=id; 
		this.sal=sal;
		 
	}
	
	public void detailsOfEmployeeDisplay(){
		
		System.out.println("\"Name is\" "+name+" "+"id is "+id+" sal is "+sal);
		
	}
	
}

public class Example {

	public static void main(String[] args) {
		Employee arun=new Employee("Arun",19,19000);
		
		arun.detailsOfEmployeeDisplay();

	}

}
