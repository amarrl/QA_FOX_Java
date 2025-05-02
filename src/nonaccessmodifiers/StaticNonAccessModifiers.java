package nonaccessmodifiers;


class Car{
  Double rate; 
  int millage;
  static int wheels=4;
  static String name;
  
  
  //non static method //object memory
  public void methodX() {
	  System.out.println(wheels);
  }
  
  //static method //class memory
  
  public static void idDisplayed() {
	  //only static stuff be accessed within the static method
	  //there is a way to access non static stuff inside static method i.e create object
	  
	  Car u=new Car();
	System.out.println(  u.millage=90);
	  
	  System.out.println("Car details are "+name);
  }
  
  
}

public class StaticNonAccessModifiers {
	
	public static void main(String[]args) {
	
	Car audi=new Car();
	audi.name="Audi";
	audi.idDisplayed();
	audi.rate=1525.277;
	audi.millage=10;
	
	System.out.println(audi.rate);
	System.out.println(audi.millage);
	
	System.out.println(Car.wheels);
	
	Car Benz=new Car();
	Benz.name="Benz";
	Benz.rate=9000.9;
	Benz.millage=7;
	Benz.idDisplayed();
	System.out.println(Benz.rate);
	System.out.println(Benz.millage);
	System.out.println(Car.wheels);
	
	
	
	
	
	
	}
}
