package Programming_String;

public class Occuranceof_String {
	public static void main(String[]args) {
		
		String target="Hello world";
		String text="Hello world, welcome to the Hello world of Java programming! Hello world!";
		int count = 0;
		
		
		char c[]= new char[text.length()];   
		int p=0;
		
		
		for(int i=0;i<text.length();i++) { 
			boolean flag=true;
			for(int j=0;j<target.length();j++) {
				
				if(text.charAt(i+j)==target.charAt(j)) {
					c[p++]=target.charAt(j);
					
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				count++;
			}
		}
		  System.out.println("Occurrences of '" + target + "': " + count);
		for(char t:c) {
		System.out.print(t+""+" ");
	}
}
}
