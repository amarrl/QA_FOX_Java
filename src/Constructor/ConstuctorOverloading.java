package Constructor;


class Emp{
	String name;
	int id;
	double sal;
	
	Emp(String name,int id){ 
		this.name=name;  
		this.id=id;
		
	}
	
	Emp(String name,int id,double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
		
	}
	
}

public class ConstuctorOverloading {

	public static void main(String[] args) {
		Emp madava=new Emp("Madhava",14,14);
		
		Emp king=new Emp("King",13);
		
		
		
		

	}

}
