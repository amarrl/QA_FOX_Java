package Methods;

public class MethodChaining {

	public static void main(String[] args) {
		String str="Amar Rajkumar";
		
		String str2=str.replace(" ","_").concat(" ").concat("ADE").replace(" ", "_");
		System.out.println(str2);
		

	} 

}
