package GetterandSetterMethods;

public class ExecutePrivateFields {
	
	public static void main (String args[]) {
		//CarClass c=new CarClass(8000,"Maruthi","800Old");
		
		CarClass c=new CarClass();
		
		
		c.setCost(8000);
		c.setName("Maruthi");
		c.setModel("800Old");
		
		System.out.println(c.getCost()); 
		System.out.println(c.getName());
		System.out.println(c.getModel());
		
		
		 c.setCost(9000);
		 
		 System.out.println(c.getCost());
	}

}
