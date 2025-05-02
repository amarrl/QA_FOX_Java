package StringBuffer;

public class IndexOfString {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Amar rajkumar Ade");
		
		System.out.println(s.indexOf("mar", 0));  //1
		
		System.out.println(s.indexOf("Ade",1));  //14
		
		System.out.println(s.lastIndexOf("e")); //16
		
		
		
		

	}

}
