package String;

public class Split {

	public static void main(String[] args) {
		String s="The Qafox-is the main software tetsing course";
		System.out.println(s.substring(3)); 
		
		String []s1=s.split("-"); 
		 
		for(String q:s1) {
			//System.out.println(q);
		}
				
		String a[]=s.split("-", 9); 
		
		
			System.out.println(a[0]);	
				

}
}
