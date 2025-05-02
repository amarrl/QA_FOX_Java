package StringBuffer;

public class DifferenceBetweenStringandStringBuffer {

	public static void main(String[] args) {
	String a="Amar";
	a.concat("Rajkumar");
	
	System.out.println(a);  //Amar as string is immutable (can't be changed)
	
	
	StringBuffer b=new StringBuffer("AMAR"); 
	b.append(" ").append("RAJKUMAR");
	
	System.out.println(b);  //AMAR RAJKUMAR(can be changed)
	
	
	
	
	

	}

}
