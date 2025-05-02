package ClassAndObject;


class car{
	
	String name;
	double carprice;
	String colour;
	int numberPlate; 
	
	
	void carDetials(){
		
		System.out.println("Car name is "+name);
		System.out.println("Car price is "+carprice);
		System.out.println("Car colour is "+colour);
		System.out.println("Car numberPlate is "+numberPlate);
		
	}
	
	public void startCar() {
		System.out.println("Car is started");
	}
	
	public void stopCar() {
		System.out.println("Car is stoped");
	}
	
}


public class TempletandObject {
	
	public static void main (String[]args) {
		

		
		car Maruthi=new car(); //new object will be created for car class in the colony // Maruthi is object reference cariable //object creation statement
		
		Maruthi.name="Maruthi";
		Maruthi.carprice=4000;
		Maruthi.colour="Yellow";
		Maruthi.numberPlate=38;
		
		Maruthi.carDetials();
		
		System.out.println("==================");
		
		car Hyndai=new car(); //new object will be creted for car class
		
		Hyndai.startCar();
		Hyndai.name="Hyndai";
		Hyndai.colour="Red";
		Hyndai.carprice=9000;
		Hyndai.numberPlate=12;
		Hyndai.carDetials();
		Hyndai.stopCar();
		
		
		
		
		
	}

}
