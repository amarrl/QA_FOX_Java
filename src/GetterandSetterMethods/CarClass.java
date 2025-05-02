package GetterandSetterMethods;

public class CarClass {
	private int cost;
	private String name;
private	String model;

/*
CarClass(int cost,String name,String model){
	this.cost=cost;
	this.name=name;
	this.model=model; 
}
*/
 
//setter method

public void setCost(int cost) {
	this.cost=cost;  
	
}

public void setName(String name) {
	this.name=name;
	
}

public void setModel(String model) {
	this.model=model;
	
}

//getter methods

public int getCost() {
	return cost;
}

public String getName() {
	return name;
}

public String getModel() {
	return model;
}


	
	
	
	

}
