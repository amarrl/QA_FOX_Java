package Programming;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine();
		 
		String reversedString="";
		
		for(int i=input.length()-1;i>=0;i--){
			reversedString +=input.charAt(i);  
		}
		
		System.out.println(reversedString);
		
		
	
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String which you need to reverse");
		
		String input=sc.nextLine();
		String reversedString=new StringBuilder(input).reverse().toString();  //converts the reversed stringbuilder back to string object
		
		System.out.println(reversedString);  
		
		sc.close();
				*/
	
	
	}

}
