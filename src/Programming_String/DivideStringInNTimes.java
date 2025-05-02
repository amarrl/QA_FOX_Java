package Programming_String;

public class DivideStringInNTimes {

	public static void main(String[] args) {
		String input="aaaabbbbcccc";
		
		int length=input.length();  //12 
		
		int n=3;  
		
		int temp=0;
		
		int chars=length/n;  //4
		
		
		
		String[] eqaulstr=new String[n]; 
		
		if(length%n!=0) {
			System.out.println("Sorry String can't convert into "+n+" Times");
		 
		}
		else {
			for(int i=0;i<length;i=i+chars) {
					String part=input.substring(i, i+chars);
					eqaulstr[temp++]=part;
					
				
			}
			System.out.println("------------------");
			for(int j=0;j<eqaulstr.length;j++) {
				System.out.println(eqaulstr[j]);
			}
			
		}
		

	}

}
