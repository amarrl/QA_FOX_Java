package inheritance;

class car{
	String carName;
	double rate;
	String colour;
	int number;
	int numberofwheels;
	
	public void carDetails() {
		System.out.println("Car rate is "+carName);
		System.out.println("Car rate is "+rate);
		System.out.println("Car colour is "+colour);
		System.out.println("Car number is "+number);
		System.out.println("Car numberofwheels is "+numberofwheels);
	}
	
}


class maruthiCar extends car{
	int no;
	
}

class benz extends maruthiCar{
	
}

public class SinglelevelInherutance {
	
	
	
	public static void main (String[]args) {
		
		maruthiCar t=new maruthiCar();
		t.colour="red";
		t.carName="Maruthi";
		t.carDetails();
		t.no=18;
		
		
		benz b=new benz();
		b.carName="Benz";
		b.carDetails();
		
		
	}

}
