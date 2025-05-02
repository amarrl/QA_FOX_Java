package ScannerClass;

import java.util.Scanner;

public class ScannerClassExp {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name=sc.next(); 
		
		
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		
		System.out.println("Enter your gender");
		
		char gender=sc.next().charAt(0);
		
		System.out.println("All the enetered details are correct or not Enter true or false");
		
		boolean b=sc.nextBoolean();
		
		
		
		
		
		System.out.println("Your name is "+name);
		System.out.println("Your age is "+age);
		System.out.println("Your Gender is "+gender);
		System.out.println("Your confimation on the above details isAmarf "+b);
	}

}
