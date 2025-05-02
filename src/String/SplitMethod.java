package String;

public class SplitMethod {
	
	public static void main (String[]args) {
		String s="The Qafox-is the main software tetsing course";
		
	
		
		String[]s1=s.split("-");
		 
		
		
		for(String s2:s1) {
			System.out.print(s2);
		}
		
		System.out.println(s1[0]); //The Qafox
		
		String cont=s1[0].concat(" Amar");
		
		System.out.println(cont);
		
		System.out.println("one".concat("two").concat("three"));
		
		
		String y="Amar";
		
		String x="Kumar";
		
		System.out.println(y+x);
		
		
	}

}
